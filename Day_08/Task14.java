public class Task14 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            // first part (1's)
            for (int j = 1; j <= n - i; j++) {
                System.out.print("1");
            }

            // second part (i's)
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}