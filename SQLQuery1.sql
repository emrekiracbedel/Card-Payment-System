USE PaymentSystem;
IF OBJECT_ID('dbo.Cards', 'U') IS NULL
BEGIN
    CREATE TABLE dbo.Cards(
        card_number NVARCHAR(19) NOT NULL PRIMARY KEY,
        name        NVARCHAR(100) NOT NULL,
        expiry      NVARCHAR(7) NOT NULL,
        cvv         NVARCHAR(4) NOT NULL,
        balance     DECIMAL(18,2) NOT NULL
    );
END;

INSERT INTO dbo.Cards(card_number, name, expiry, cvv, balance) VALUES
('1234 1234 1234 1234', 'Emre Kiracbedel', '01/29', '258', 5000.00),
('1111 2222 3333 4444', 'Temmuz Ustununal', '12/25', '123', 10000.00);
