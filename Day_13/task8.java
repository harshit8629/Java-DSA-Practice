public class task8 {
    public static void main(String[] args) {
        int n = -5;

        try {
            if (n < 0) {
                throw new Exception("Number cannot be negative");
            }
            System.out.println("Number = " + n);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}