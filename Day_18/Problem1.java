import java.util.HashSet;

public class Problem1 {
    public static void main(String[] args) {
        HashSet<String> gatePassSwipe = new HashSet<>();

        gatePassSwipe.add("Surbhi");
        gatePassSwipe.add("Rohan");
        gatePassSwipe.add("Sakshi");
        gatePassSwipe.add("Rohit");
        gatePassSwipe.add("Sakshi Sharma");
        gatePassSwipe.add("Rohan");
        gatePassSwipe.add("Tushar");

        int len = gatePassSwipe.size();
        System.out.println("Unique: " + len);
        System.out.println(gatePassSwipe);
    }
}