import java.util.HashSet;
import java.util.ArrayList;

public class Task7 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,2,4,5,1,6,1};

        HashSet<Integer> unique = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        // Find duplicates
        for(int num : arr) {

            if(!unique.add(num)) {
                duplicates.add(num);
            }
        }

        // Store duplicates in ArrayList
        ArrayList<Integer> list = new ArrayList<>(duplicates);

        // Print ArrayList
        for(int num : list) {
            System.out.print(num + " ");
        }
    }
}