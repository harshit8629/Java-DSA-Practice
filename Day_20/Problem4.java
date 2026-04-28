import java.util.*;

public class Problem4 {

    public static ArrayList<String> extractNum(HashSet<String> names) {
        ArrayList<String> result = new ArrayList<>();

        Iterator<String> itr = names.iterator();

        while (itr.hasNext()) {
            String name = itr.next();

            if (name.length() > 3) {
                result.add(name);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        names.add("Rohan");
        names.add("Ann");
        names.add("Tripp");
        names.add("Eli");

        ArrayList<String> answer = extractNum(names);

        System.out.println(answer);
    }
}