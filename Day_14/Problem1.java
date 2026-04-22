public class Problem1 {
    public static String lastThree(String str) {
        return str.substring(str.length() - 3);
    }

    public static void main(String[] args) {
        System.out.println(lastThree("abcdef"));   // def
        System.out.println(lastThree("morning"));  // ing
    }
}