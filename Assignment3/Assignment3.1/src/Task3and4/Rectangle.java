package Task3and4;

public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle(double width, double length, String color) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea () {
        return width * length;
    }

    double getWidth() {
        return width;
    }

    double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "The Rectangle length is " + length + " and width is " + width;
    }

}
