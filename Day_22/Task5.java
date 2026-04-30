import java.util.HashSet;

public class Task5 {
    public static void main(String[] args) {

        int[] arr = {1,3,5,7,9,4,7,11,9};

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr) {
            set.add(num);
        }

        for(int num : set) {
            System.out.print(num + " ");
        }
    }
}