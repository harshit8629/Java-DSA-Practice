public class Problem5 {
    public static String removeSpaces(String str) {
        return str.replace(" ", "");
    }

    public static void main(String[] args) {
        System.out.println(removeSpaces("hello world")); // helloworld
        System.out.println(removeSpaces("a b c"));       // abc
    }
}