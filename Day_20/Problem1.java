import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        numbers.add(5);

        ArrayList<Integer> arr = new ArrayList<>();

        Iterator<Integer> itr = numbers.iterator();

        while (itr.hasNext()) {
            int z = itr.next();

            if (z % 2 == 0) {
                arr.add(z);
            } else {
                arr.add(z + 1);
                arr.add(z + 2);
            }
        }

        System.out.println(arr);
    }
}