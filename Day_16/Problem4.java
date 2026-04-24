import java.util.ArrayList;

public class Problem4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        int arr[] = {3, 9, 6, 7};

        int len = arr.length;

        for (int i = 0; i < len; i++) {
            int num = arr[i];

            arrList.add(num);

            num = num * 2;

            arrList.add(num);
        }

        len = arrList.size();

        System.out.println("Size: " + len);

        for (int i = 0; i < len; i++) {
            int ele = arrList.get(i);
            System.out.println("#" + i + " : " + ele);
        }
    }
}