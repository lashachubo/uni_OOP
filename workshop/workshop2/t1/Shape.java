public class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public double getArea() {
        return 0.0; // Default, to be overridden
    }

    public double getPerimeter() {
        return 0.0; // Default, to be overridden
    }

    public void display() {
        System.out.println("Shape: " + name);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
