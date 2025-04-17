import java.util.ArrayList;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        List<Integer> original = new ArrayList<>();

        original.add(23);
        original.add(45);
        original.add(12);
        original.add(67);
        original.add(89);
        original.add(34);
        original.add(56);

    for (int i = original.size() - 1; i >= 0; i --) {
        if (i % 2 != 0) {
            original.remove(i);
        }    
    }


    System.out.println(original);
    }
}
