public class task2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int index = 5;

        try {
            System.out.println("Element = " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }
    }
}