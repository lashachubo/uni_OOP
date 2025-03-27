package lasha_chubinidze_1.quiz1.t2.sub;

import lasha_chubinidze_1.quiz1.t2.ingredient.A21;
import lasha_chubinidze_1.quiz1.t2.rice.props.A22;
import java.time.Month;

public class R21 {
    public static void main(String[] args) {
        A21 rect = new A21();
        int area = rect.getWidth() * rect.getHeight();
        System.out.println("Rectangle Area: " + area);

        A22 monthVar = new A22();
        int monthNumber = monthVar.getMonth();

        if (monthNumber >= 1 && monthNumber <= 12) {
            System.out.println("Month: " + Month.of(monthNumber));
        } else {
            System.out.println("Invalid month number.");
        }
    }
}
