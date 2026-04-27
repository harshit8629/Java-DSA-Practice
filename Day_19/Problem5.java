import java.util.HashSet;

public class Problem5 {
    public static void main(String[] args) {
        String str = "abracadabra";

        HashSet<Character> mySet = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (mySet.contains(ch)) {
                System.out.println("$ : " + ch);
            }

            mySet.add(ch);
        }

        System.out.println(mySet);
    }
}