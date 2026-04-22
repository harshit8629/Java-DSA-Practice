import java.util.*;

public class Problem3_2 {

    public static String reverseString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    public static List<String> reverseList(String[] arr) {
        List<String> result = new ArrayList<>();
        for (String s : arr) {
            result.add(reverseString(s));
        }
        return result;
    }

    public static void main(String[] args) {
        String[] arr = {"cat", "dog", "sun"};
        System.out.println(reverseList(arr));
    }
}