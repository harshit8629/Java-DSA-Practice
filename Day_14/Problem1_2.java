public class Problem1_2 {

    public static String lastThree(String str) {
        return str.substring(str.length() - 3);
    }

    public static void printLastThree(String[] arr) {
        for (String s : arr) {
            System.out.println(lastThree(s));
        }
    }

    public static void main(String[] args) {
        String[] arr = {"coding", "python", "java"};
        printLastThree(arr);
    }
}