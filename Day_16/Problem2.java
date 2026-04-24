import java.util.ArrayList;

public class Problem2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        arrList.add(30);
        arrList.add(40);
        arrList.add(10);
        arrList.add(50);

        int len = arrList.size();
        System.out.println(len);

        System.out.println(arrList);

        int num = arrList.get(0);
        System.out.println(num);

        arrList.set(1, num + 5);
        arrList.set(2, num + 10);
        arrList.set(3, num + 15);

        System.out.println(arrList);
    }
}