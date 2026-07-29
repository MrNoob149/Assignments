DROP DATABASE IF EXISTS currency;
CREATE DATABASE currency;
USE currency;

CREATE TABLE CURRENCY (
   id INT NOT NULL AUTO_INCREMENT,
   names VARCHAR(50) NOT NULL,
   converted_to VARCHAR(50) NOT NULL,
   exchanged_rate DECIMAL(10, 2) NOT NULL,
   PRIMARY KEY (id)
);

INSERT INTO currency (NAMES, converted_to, exchanged_rate) VALUES
            ('United States dollar',  'USD', 1),
            ('Vietnam Dong',  'VND', 26343.33),
            ('euro',  'EURO', 0.87),
            ('japanese yen',  'JPY', 163.77),
            ('British Pound Sterling',  'GBP', 0.75),
            ('Chinese yuan',  'CNY', 6.76),
            ('Swiss franc',  'CHF', 0.81),
            ('Australian dollar',  'AUD', 1.43),
            ('Canadian dollar',  'CAD', 1.41),
            ('Hong Kong dollar',  'HKD', 7.84);

DROP USER if EXISTS 'appuser'@'localhost';
CREATE USER 'appuser'@'localhost' IDENTIFIED BY '123';
GRANT SELECT ON currency.* TO 'appuser'@'localhost';
