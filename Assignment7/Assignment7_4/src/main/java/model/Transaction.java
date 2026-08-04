package model;

import jakarta.persistence.*;


@Entity
@Table(name="transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private double amount;

    @ManyToOne
    @JoinColumn(name="source")
    private String source;

    @ManyToOne
    @JoinColumn(name="convert_to")
    private String convert_to;


    public Transaction(double amount, String source,String convert_to) {
        this.amount = amount;
        this.source = source;
        this.convert_to = convert_to;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getConvert_to() {
        return convert_to;
    }

    public void setConvert_to(String convert_to) {
        this.convert_to = convert_to;
    }
}
