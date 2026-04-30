import java.util.HashMap;

public class Task6 {
    public static void main(String[] args) {

        String[] arr = {"aaaa","bbb","cc","d","ccde"};

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of characters
        for(String str : arr) {

            for(int i = 0; i < str.length(); i++) {

                char ch = str.charAt(i);

                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        // Print chars occurring more than 3 times
        for(char key : map.keySet()) {

            if(map.get(key) > 3) {
                System.out.print(key + " ");
            }
        }
    }
}