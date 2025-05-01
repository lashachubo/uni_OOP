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
        System.out.println("Shape: " + name);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("------------------------");
    }
}
