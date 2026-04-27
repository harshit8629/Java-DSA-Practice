import java.util.HashSet;

public class Problem6 {
    public static void uniqueOdds(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (num % 2 != 0) {   // check odd
                set.add(num);
            }
        }

        System.out.println(set);
    }

    public static void main(String[] args) {
        uniqueOdds(new int[]{7,8,2,5,7,3,9,3,4,2});
    }
}