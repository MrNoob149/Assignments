package model;

public class Converter {
    private String names, converted_to;
    private double exchanged_rate;

    public Converter(String names, String converted_to, double exchanged_rate) {
        this.names = names;
        this.converted_to = converted_to;
        this.exchanged_rate = exchanged_rate;
    }

    public Converter() {
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getConverted_to() {
        return converted_to;
    }

    public void setConverted_to(String converted_to) {
        this.converted_to = converted_to;
    }

    public double getexchanged_rate() {
        return exchanged_rate;
    }

    public void setexchanged_rate(double exchanged_rate) {
        this.exchanged_rate = exchanged_rate;
    }
}


