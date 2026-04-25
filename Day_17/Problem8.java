import java.util.ArrayList;

public class Problem8 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();

        names.add("Aman");
        names.add("Raj");
        names.add("Sita");
        names.add("Om");

        for (String name : names) {
            if (name.length() > 3) {
                System.out.println(name);
            }
        }
    }
}