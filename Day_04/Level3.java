import java.util.*;
public class Level3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Task 1 Given a string as input. Clean the string by removing all occurrence of character '#'. 
        System.out.print("Enter a string:");
        String input = sc.next();
        String cleanedString = input.replace("#", "");
        System.out.println("Cleaned String: " + cleanedString);

        // Task 2 Given a string as input. Change every 1 to "ab" and 9 to "c" in string. 
        System.out.print("Enter another String:");
        String input2 = sc.next();
        String modifyedString = input2.replace("1","ab").replace("9","c");
        System.out.println("Modified String: " + modifyedString);
    }
}