package practice.draw;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class DrawPadPanel extends JPanel {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
        repaint();
    }

    public void removeShape(Shape shape) {
        shapes.remove(shape);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}
