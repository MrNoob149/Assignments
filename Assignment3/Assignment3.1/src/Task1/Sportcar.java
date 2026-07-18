package Task1;

public class Sportcar extends Car{

    public Sportcar(String typeName, double speed, double gasolineLevel) {
        super(typeName, speed, gasolineLevel);
    }

    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0)
            super.setSpeed(getSpeed() + 100);
        else
            super.setSpeed(getSpeed());
    }

    @Override
    public void decelerate(int amount) {
        if (getGasolineLevel() > 0) {
            if (amount > 0)
                super.setSpeed(getSpeed()) = Math.max(-super.setSpeed(getSpeed()));
        } else
            super.setSpeed(getSpeed());
    }

}
