package Task3and4;

public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea () {
        return (base * height)/2;
    }

    double getBase() {
        return base;
    }

    double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "The base of the triangle is " + base + " and height is " + height;
     }
}
