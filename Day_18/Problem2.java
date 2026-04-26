import java.util.HashSet;

public class Problem2 {
    public static void main(String[] args) {
        char[] arr = {'T', 'R', 'I', 'S', 'E', 'C', 'T'};
        HashSet<Character> set1 = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set1.add(arr[i]);
        }

        int len = set1.size();
        System.out.println(len);
        System.out.println(set1);
    }
}