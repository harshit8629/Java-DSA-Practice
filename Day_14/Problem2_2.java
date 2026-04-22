public class Problem2_2 {

    public static int countVowels(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void printVowelCount(String[] arr) {
        for (String s : arr) {
            System.out.println(countVowels(s));
        }
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "sky", "idea"};
        printVowelCount(arr);
    }
}