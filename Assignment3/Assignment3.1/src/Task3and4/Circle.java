package Task3and4;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea () {
        return Math.PI * radius * radius;
    }

    double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "The radius of a circle is " + radius + " and the color of Circle is " + getColor();
    }
}
