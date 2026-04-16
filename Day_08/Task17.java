public class Task17 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 0; i < n; i++) {

            // left numbers
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }

            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // right numbers
            for (int j = n - i; j >= 1; j--) {
                if (i == 0) continue; // avoid duplicate center
                System.out.print(j);
            }

            System.out.println();
        }
    }
}