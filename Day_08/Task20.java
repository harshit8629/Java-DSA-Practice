public class Task20 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            // starting number
            int start = i;

            // increasing
            for (int j = 1; j <= i; j++) {
                System.out.print(start);
                start++;
            }

            // decreasing
            start -= 2;
            for (int j = 1; j < i; j++) {
                System.out.print(start);
                start--;
            }

            System.out.println();
        }
    }
}