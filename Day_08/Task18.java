public class Task18 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            // increasing
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // decreasing
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}