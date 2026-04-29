import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {

        int[] arr = {10,20,25,30,35,55};

        ArrayList<Integer> list = new ArrayList<>();

        for(int num : arr) {
            if(num % 10 == 5) {
                list.add(num);
            }
        }

        System.out.println("Size=" + list.size());

        for(int num : list) {
            System.out.print(num + " ");
        }
    }
}