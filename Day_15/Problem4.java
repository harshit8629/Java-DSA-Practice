public class Problem4 {
    public static String evenSeries(int n) {
        String result = "";
        for (int i = 2; i <= n; i += 2) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(evenSeries(6));   // 246
        System.out.println(evenSeries(10));  // 246810
    }
}