import java.util.ArrayList;

public class Problem6 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(2);
        numbers.add(7);
        numbers.add(4);
        numbers.add(1);
        numbers.add(5);

        for (int num : numbers) {
            if (num < 5) {
                System.out.println(num);
            }
        }
    }
}