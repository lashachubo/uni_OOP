package practice.draw;

import javax.swing.JFrame;

public class DrawPadDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("DrawPad");
        DrawPadPanel panel = new DrawPadPanel();

        panel.addShape(new Circle("#FF0000", 50));
        panel.addShape(new Rectangle("#00FF00", 80, 40));
        panel.addShape(new Triangle("#0000FF", 60));

        frame.add(panel);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
