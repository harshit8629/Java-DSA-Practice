import java.util.ArrayList;

public class Problem3 {
    public static void main(String[] args) {
        ArrayList<String> whitelist = new ArrayList<String>();

        whitelist.add("Rohan");
        whitelist.add("Neha");

        int len = whitelist.size();
        System.out.println(len);

        whitelist.set(0, "Mohan");
        whitelist.set(2, "Shivani");

        System.out.println(whitelist);
    }
}