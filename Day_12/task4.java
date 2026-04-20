public class task4 {
    public static void main(String[] args) {
        String s = null;

        try {
            System.out.println("Length = " + s.length());
        } catch (NullPointerException e) {
            System.out.println("String is null");
        }
    }
}