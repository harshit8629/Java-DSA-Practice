public class Problem2 {
    public static int countVowels(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("hello"));      // 2
        System.out.println(countVowels("education"));  // 5
    }
}