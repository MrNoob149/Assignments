DROP DATABASE IF EXISTS currency;
CREATE DATABASE currency;
USE currency;

CREATE TABLE CURRENCY (
   id INT NOT NULL AUTO_INCREMENT,
   money DECIMAL(10, 2) NOT NULL,
   names VARCHAR(50) NOT NULL,
   TYPES VARCHAR(50) NOT NULL,
   converted_to VARCHAR(50) NOT NULL,
   converted_currency DECIMAL(10, 2) NOT NULL,
   PRIMARY KEY (id)
);

INSERT INTO currency (money, NAMES, TYPES, converted_to, converted_currency) VALUES
            (1 ,'United States dollar', 'USD', 'VND', 26343.33),
            (1 ,'United States dollar', 'USD', 'EURO', 0.87),
            (1 ,'United States dollar', 'USD', 'JPY', 163.77),
            (1 ,'United States dollar', 'USD', 'GBP', 0.75),
            (1 ,'United States dollar', 'USD', 'CNY', 6.76),
            (1 ,'United States dollar', 'USD', 'CHF', 0.81),
            (1 ,'United States dollar', 'USD', 'AUD', 1.43),
            (1 ,'United States dollar', 'USD', 'CAD', 1.41),
            (1 ,'United States dollar', 'USD', 'HKD', 7.84);

DROP USER if EXISTS 'appuser'@'localhost';
CREATE USER 'appuser'@'localhost' IDENTIFIED BY '123';
GRANT SELECT ON currency.* TO 'appuser'@'localhost';
