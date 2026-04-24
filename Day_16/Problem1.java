import java.util.ArrayList;

public class Problem1 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("Banana");
        fruits.add("Apple");

        int len = fruits.size();
        System.out.println(len);

        fruits.add("Orange");

        len = fruits.size();
        System.out.println(len);

        System.out.println(fruits);
    }
}