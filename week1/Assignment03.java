package workshop.w1.lasha_chubinidze_1;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;


/**
 * Find the file "hidden.txt" and print its path.
 * The file should be found yourself without java code.
 * 0.5 points
 */
public class Assignment03 {
    public static void main(String[] args) throws IOException {
        File file = new File("../wrench/truck/clay/hidden.txt");
        
        if (file.exists()) {
            Desktop.getDesktop().open(file);
        } else {
            System.out.println("not found");
        }
    }
}