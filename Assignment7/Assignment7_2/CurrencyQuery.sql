SELECT * FROM currency.currency;
SELECT * FROM currency.currency WHERE converted_to = "EUR";
SELECT COUNT(*) FROM currency.currency;
SELECT * FROM currency.currency WHERE converted_currency IN (SELECT MAX(converted_currency) FROM currency.currency);