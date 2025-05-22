package mypack; // Package declaration

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius; //Area of circle calculation
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0); // Creating an instance of Circle
        System.out.println("Circle Area: " + circle.getArea());
    }
}
