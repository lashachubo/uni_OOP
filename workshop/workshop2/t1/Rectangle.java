public class Rectangle extends Shape implements Resizable {
    private double length;
    private double width;
    private double scaleFactor = 1.0;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public void resize(double scaleFactor) {
        this.scaleFactor = scaleFactor;
        length *= scaleFactor;
        width *= scaleFactor;
    }

    @Override
    public double getResizedArea() {
        return length * width;
    }

    @Override
    public double getResizedPerimeter() {
        return 2 * (length + width);
    }
}
