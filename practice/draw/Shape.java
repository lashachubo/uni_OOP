package practice.draw;

import java.awt.Graphics;

public interface Shape {
    void draw(Graphics g);
    void resize(double factor);
    double getArea();
}
