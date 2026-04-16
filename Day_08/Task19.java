public class Task19 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // decreasing
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // increasing
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}