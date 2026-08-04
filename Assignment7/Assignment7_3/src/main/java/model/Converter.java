// this is an entity
package model;
import jakarta.persistence.*;

@Entity
@Table(name="currency")


public class Converter {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name="names")
    private String names;

    @Column(name="converted_to")
    private String converted_to;

    @Column(name="exchanged_rate")
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


