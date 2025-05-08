package practice.draw;

import java.awt.Graphics;

public class Rectangle extends AbstractShape {
    private double width, height;

    public Rectangle(String colorStr, double width, double height) {
        super(colorStr);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(150, 50, (int) width, (int) height);
    }

    @Override
    public void resize(double factor) {
        width *= factor;
        height *= factor;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
