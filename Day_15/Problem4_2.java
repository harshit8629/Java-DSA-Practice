import java.util.*;

public class Problem4_2 {

    public static String evenSeries(int n) {
        String result = "";
        for (int i = 2; i <= n; i += 2) {
            result += i;
        }
        return result;
    }

    public static List<String> evenSeriesList(int[] arr) {
        List<String> list = new ArrayList<>();
        for (int n : arr) {
            list.add(evenSeries(n));
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 4};
        System.out.println(evenSeriesList(arr));
    }
}