import java.util.ArrayList;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        List<Integer> original = new ArrayList<>();
        List<Integer> copy = new ArrayList<>();

        original.add(5);
        original.add(12);
        original.add(8);
        original.add(23);
        original.add(16);
        original.add(32);

    for (int i = 1; i < original.size(); i += 2) {
        copy.add(original.get(i));
    }


        System.out.println(copy);
    }
}
