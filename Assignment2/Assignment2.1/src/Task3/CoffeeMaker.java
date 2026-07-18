package Task3;

public class CoffeeMaker {
    private int amount;
    private String type;
    private boolean on;

    public CoffeeMaker() {
        this.on = false;
        this.type = "normal";
        this.amount = 10;
    }

    public void pressOnOff() {
        if (on) {
            on = false;
        } else {
            on = true;
        }
    }
    public boolean isOn(){
        return on;
    }

    public void setCoffeeType(String coffeeType) {
        if (on) {
            if (coffeeType.equals("normal") || coffeeType.equals("espresso")) {
                this.type = coffeeType;
            }
        }
    }

    public String getCoffeeType() {
        return type;
    }

    public void setCoffeeAmount(int coffeeAmount) {
        if (on) {
            if (coffeeAmount >= 10 && coffeeAmount <= 80) {
                this.amount = coffeeAmount;
            }
        }
    }

    public int getCoffeeAmount() {
        return amount;
    }
}


