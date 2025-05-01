package workshop.workshop2.t1;

public class WorkshopTester {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle("rectangle1", 4, 5);
        shapes[1] = new Circle("circle1", 3);
        shapes[2] = new Rectangle("rectangle2", 2, 6);

        System.out.println("shapes:");
        for (Shape shape : shapes) {
            shape.display();
        }

        System.out.println("resizing rectangle:");
        for (Shape shape : shapes) {
            if (shape instanceof Resizable) {
                Resizable res = (Resizable) shape;
                res.resize(2.0);
                System.out.println("resized " + shape.name + ":");
                System.out.println("updated area: " + res.getResizedArea());
                System.out.println("updated permeter: " + res.getResizedPerimeter());
                System.out.println("\n\n");
            }
        }
    }
}
