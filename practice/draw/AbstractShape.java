package practice.draw;

import java.awt.Color;

public abstract class AbstractShape implements Shape {
    protected Color color;

    public AbstractShape(String colorStr) {
        this.color = Color.decode(colorStr);
    }

    @Override
    public abstract void resize(double factor);

    @Override
    public abstract double getArea();
}
