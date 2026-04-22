public class Problem3 {
    public static String reverseString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("abcd"));  // dcba
        System.out.println(reverseString("hello")); // olleh
    }
}