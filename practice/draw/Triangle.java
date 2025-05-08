package practice.draw;

import java.awt.Graphics;
import java.awt.Polygon;

public class Triangle extends AbstractShape {
    private double a, b, c;

    public Triangle(String colorStr, double side) {
        super(colorStr);
        this.a = this.b = this.c = side;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        int[] xPoints = {300, 300 + (int) a, 300 + (int) a / 2};
        int[] yPoints = {100, 100, 100 - (int) (Math.sqrt(3) / 2 * a)};
        g.fillPolygon(new Polygon(xPoints, yPoints, 3));
    }

    @Override
    public void resize(double factor) {
        a *= factor;
        b *= factor;
        c *= factor;
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
