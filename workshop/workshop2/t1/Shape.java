package workshop.workshop2.t1;

public class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public double getArea() {
        return 0.0;
    }

    public double getPerimeter() {
        return 0.0;
    }

    public void display() {
        System.out.println("shape: " + name);
        System.out.println("area: " + getArea());
        System.out.println("perimeter: " + getPerimeter());
        System.out.println("\n\n");
    }
}
