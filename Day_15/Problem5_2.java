public class Problem5_2 {

    public static String removeSpaces(String str) {
        return str.replace(" ", "");
    }

    public static void printNoSpaces(String[] arr) {
        for (String s : arr) {
            System.out.println(removeSpaces(s));
        }
    }

    public static void main(String[] args) {
        String[] arr = {"hi there", "a b", "code"};
        printNoSpaces(arr);
    }
}public class Problem5_2 {

    public static String removeSpaces(String str) {
        return str.replace(" ", "");
    }

    public static void printNoSpaces(String[] arr) {
        for (String s : arr) {
            System.out.println(removeSpaces(s));
        }
    }

    public static void main(String[] args) {
        String[] arr = {"hi there", "a b", "code"};
        printNoSpaces(arr);
    }
}