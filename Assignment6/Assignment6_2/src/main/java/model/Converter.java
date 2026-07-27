package model;

import java.util.HashMap;

public class Converter {

    private HashMap<String, Double> MoneyStore = new HashMap<>();
    private HashMap<String, String> currencyNames = new HashMap<>();

    public Converter() {

        MoneyStore.put("USD",  1.0);
        MoneyStore.put("JPY",  163.63);
        MoneyStore.put("VND",  26000.0);

        currencyNames.put("USD", "US Dollar");
        currencyNames.put("JPY", "Japanese Yen");
        currencyNames.put("VND", "Vietnamese Dong");

    }

    public double getRate(String currency) {
        return MoneyStore.get(currency);
    }

    public HashMap<String, Double> getMoneyStore() {
        return MoneyStore;
    }
}
