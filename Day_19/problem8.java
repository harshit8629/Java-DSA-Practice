import java.util.HashSet;

public class problem8 {
    public static void uniqueFromTwo(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            set.add(num);
        }

        System.out.println(set);
    }

    public static void main(String[] args) {
        uniqueFromTwo(
                new int[]{2,1,3,2,5},
                new int[]{3,4,0,1,4}
        );
    }
}