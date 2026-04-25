import java.util.ArrayList;
import java.util.Iterator;

public class Problem7 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(8);
        numbers.add(3);
        numbers.add(6);
        numbers.add(1);

        // Replace element at index 2 with 10
        numbers.set(2, 10);

        Iterator<Integer> itr = numbers.iterator();

        while (itr.hasNext()) {
            int num = itr.next();

            if (num > 5) {
                System.out.println(num);
            }
        }
    }
}