import java.util.*;

public class Problem3 {

    public static void countEnrolled(HashMap<String, Integer> enrollments) {
        Iterator<String> itr = enrollments.keySet().iterator();

        while (itr.hasNext()) {
            String subject = itr.next();

            if (enrollments.get(subject) > 50) {
                System.out.println(subject);
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> enrollments = new HashMap<>();

        enrollments.put("Science", 55);
        enrollments.put("Arts", 10);
        enrollments.put("Maths", 60);

        countEnrolled(enrollments);
    }
}