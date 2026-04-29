import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,25,30,35,51};
        int[] arr2 = {1,2,3,4};

        ArrayList<Integer> list = new ArrayList<>();

        for(int num : arr1) {
            list.add(num);
        }

        for(int num : arr2) {
            list.add(num);
        }

        System.out.println("Size=" + list.size());

        for(int num : list) {
            System.out.print(num + " ");
        }
    }
}