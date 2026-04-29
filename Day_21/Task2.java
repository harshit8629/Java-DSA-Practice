import java.util.HashSet;

public class Task2 {
    public static void main(String[] args) {

        String[] arr = {"hello","how","are","you!!"};

        HashSet<Character> set = new HashSet<>();

        for(String str : arr) {
            for(int i = 0; i < str.length(); i++) {
                set.add(str.charAt(i));
            }
        }

        for(char ch : set) {
            System.out.print(ch);
        }
    }
}