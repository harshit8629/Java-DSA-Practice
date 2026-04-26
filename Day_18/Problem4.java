import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        ArrayList<Integer> anonymousUsers = new ArrayList<>();
        anonymousUsers.add(1);
        anonymousUsers.add(2);
        anonymousUsers.add(3);
        anonymousUsers.add(5);
        anonymousUsers.add(2);
        anonymousUsers.add(3);
        anonymousUsers.add(7);
        anonymousUsers.add(1);

        HashSet<Integer> uniqueUsers = new HashSet<>();

        for (int i = 0; i < anonymousUsers.size(); i++) {
            uniqueUsers.add(anonymousUsers.get(i));
        }

        int total = uniqueUsers.size();
        System.out.println(total);
    }
}