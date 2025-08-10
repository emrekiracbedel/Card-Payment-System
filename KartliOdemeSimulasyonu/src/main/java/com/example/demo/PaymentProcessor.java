package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PaymentProcessor {

    private List<Card> cards;

   
  

    public PaymentResult process(PaymentRequest request) {

        // Eksik bilgi kontrolü
        if (request.getCardNumber() == null || request.getCardNumber().isEmpty()
                || request.getExpiryDate() == null || request.getExpiryDate().isEmpty()
                || request.getCvv2() == null || request.getCvv2().isEmpty()) {

            return new PaymentResult(false, "422 İşlenemeyen Varlık - Eksik Kart Bilgileri.");
        }

        // Kartlar içinde eşleşen var mı?
        for (Card card : cards) {
            if (card.getCardnumber().equals(request.getCardNumber())
                    && card.getExpiryDate().equals(request.getExpiryDate())
                    && card.getCvv2().equals(request.getCvv2())) {

                // Bakiye kontrolü
                if (card.getBalance() >= request.getAmount()) {
                    card.setBalance(card.getBalance() - request.getAmount());
                    return new PaymentResult(true,
                            "200 OK - Ödeme Başarılı. Yeni bakiye: " + card.getBalance());
                } else {
                    return new PaymentResult(false, "402 Ödeme Gerekli - Yetersiz Bakiye.");
                }
            }
        }

        // Kart bulunamazsa
        return new PaymentResult(false, "400 Hatalı İstek - Kart Bilgileri Yanlış.");
    }
}
