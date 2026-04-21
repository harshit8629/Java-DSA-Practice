public class task5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] arr = {1, 2, 3};
        int index = 5;

        try {
            int result = a / b;
            System.out.println("Division Result = " + result);

            System.out.println("Array Element = " + arr[index]);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }
    }
}