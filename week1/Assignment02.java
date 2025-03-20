package workshop.w1.lasha_chubinidze_1; 

import week1.first_package.A;
import week1.second_package.B;

/**
 * Find two packages inside this package.
 * Create classes A and B inside first and the second package accordingly
 * 1 point
*/

public class Assignment02 {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();

        objA.display();
        objB.display();
    }
}