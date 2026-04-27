import java.util.*;

public class Problem7 {
    public static void replaceDup(ArrayList<String> arrList) {
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < arrList.size(); i++) {
            String str = arrList.get(i);

            if (set.contains(str)) {
                arrList.set(i, "hello");
            } else {
                set.add(str);
            }
        }

        System.out.println(arrList);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(
                Arrays.asList("mat","bad","cat","mad","cat","bat","mat")
        );
        replaceDup(list);
    }
}