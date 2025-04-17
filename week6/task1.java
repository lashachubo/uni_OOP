import java.util.ArrayList;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        List<Integer> original = new ArrayList<>();
        List<Integer> copy = new ArrayList<>();

        original.add(23);
        original.add(45);
        original.add(12);
        original.add(67);
        original.add(89);

        for (int num : original) {
            copy.add(num);
        }
        
        System.out.println(original);
        System.out.println(copy);
    }
}
