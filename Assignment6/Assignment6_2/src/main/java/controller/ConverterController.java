package controller;

import model.Converter;

public class ConverterController {

    private Converter model;

    public ConverterController() {
        model = new Converter();
    }


    public double convert(double amount, String from, String to) {

        double fromRate = model.getRate(from);
        double toRate = model.getRate(to);

        double usdAmount = amount / fromRate;

        double result = usdAmount * toRate;

        return result;
    }


    public Converter getModel() {
        return model;
    }
}