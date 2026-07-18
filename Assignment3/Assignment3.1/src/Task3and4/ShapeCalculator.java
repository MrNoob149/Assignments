package Task3and4;
import java.util.ArrayList;
import java.util.List;

public class ShapeCalculator {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(12, "red"));
        shapes.add(new Rectangle(20, 12, "green"));
        shapes.add(new Triangle(10, 5, "blue"));

        for (Shape shape : shapes) {
            System.out.println("The area of " + shape + " is " + shape.calculateArea() + " and the color of it is " + shape.getColor());
        }
    }
}

