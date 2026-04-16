public class Task13 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            int num = i + 1;

            for (int j = 0; j < n; j++) {
                System.out.print(num);
                num++;

                if (num > n) {
                    num = 1;
                }
            }
            System.out.println();
        }
    }
}