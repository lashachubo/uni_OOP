package t1;

import java.util.*;

public class t1 {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(6, 10, 5, 2, 9, 4, 8, 3, 1, 7);

        List<String> list2 = Arrays.asList("din", "sao", "uoy", "pfe", "ejw", "nqm", "yji", "wfu", "ypi", "vto", "dqy", "tny");

        Set<Integer> seen = new HashSet<>();
        List<String> list3 = new ArrayList<>();

        for (int index : list1) {
            if (!seen.contains(index) && index < list2.size()) {
                list3.add(list2.get(index));
                seen.add(index);
            }
        }

        System.out.println("list3:");
        for (String s : list3) {
            System.out.println(s);
        }
    }
}
