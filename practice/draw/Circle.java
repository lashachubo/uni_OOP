package practice.draw;

import java.awt.Graphics;

public class Circle extends AbstractShape {
    private double radius;

    public Circle(String colorStr, double radius) {
        super(colorStr);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        int r = (int) radius;
        g.fillOval(50, 50, r * 2, r * 2);
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
