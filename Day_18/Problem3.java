import java.util.HashSet;

public class Problem3 {
    public static void main(String[] args) {
        HashSet<Character> mySet = new HashSet<>();
        mySet.add('c');
        mySet.add('o');
        mySet.add('l');
        mySet.add('a');

        String str = "chocolate";
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (mySet.contains(ch)) {
                newStr = newStr + ch;
            } else {
                newStr = newStr + "#";
            }
        }

        System.out.println(newStr);
    }
}