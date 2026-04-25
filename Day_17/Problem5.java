import java.util.ArrayList;
import java.util.Iterator;

public class Problem5 {
    public static void main(String[] args) {

        ArrayList<Character> alphabets = new ArrayList<Character>();

        alphabets.add('A');
        alphabets.add('C');
        alphabets.add('D');
        alphabets.add('E');

        alphabets.set(0, 'B');

        Iterator<Character> itr = alphabets.iterator();

        while (itr.hasNext()) {
            char ch = itr.next();
            System.out.println(ch);
        }
    }
}