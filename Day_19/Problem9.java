import java.util.HashSet;

public class Problem9 {
    public static void commonFromTwo(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        // add first array elements
        for (int num : arr1) {
            set.add(num);
        }

        // check common elements
        for (int num : arr2) {
            if (set.contains(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        commonFromTwo(
                new int[]{2,1,5,3},
                new int[]{3,4,0,1,10}
        );
    }
}