public class ShapeEnumDemo {
    enum Shapes {
        CIRCLE(3.14), SQUARE(4.0), TRIANGLE(3.0);

        private double value;

        Shapes(double value) {
            this.value = value;
        }

        double calculateArea() {
            return value;
        }

        double calculatePerimeter() {
            return value;
        }
    }

    public static void main(String[] args) {
        for (Shapes shape : Shapes.values()) {
            System.out.println(shape + " - Area: " + shape.calculateArea() + ", Perimeter: " + shape.calculatePerimeter());
        }
    }
}