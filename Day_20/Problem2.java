import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> m = new HashMap<>();

        m.put(2, 2);
        m.put(3, 4);
        m.put(5, 1);
        m.put(7, 8);

        Set<Integer> x = m.keySet();
        Iterator<Integer> z = x.iterator();

        while (z.hasNext()) {
            int y = z.next();
            y = y * m.get(y);

            System.out.println(y);
        }
    }
}