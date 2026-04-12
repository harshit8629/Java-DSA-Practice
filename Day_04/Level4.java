import java.util.Scanner;
public class Level4{
    public static void main(String[] args) {
        // Task 1 Given a string as input. Create a new string in which every occurrence of 
        // character 'd' is doubled. 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        String modifiedString = input.replace("d", "dd");
        System.out.println("Modified String: " + modifiedString);

        // Task 2 Given a string as input. Create a new string in which every occurrence of capital 
        // 'A' is doubled and small 'a' is tripled. 
        System.out.print("Enter another string: ");
        String input2 = sc.next();
        String modifiedString2 = input2.replace("A", "AA").replace("a", "aaa");
        System.out.println("Modified String: " + modifiedString2);

        // Task 3 Given a string as input. Create a new string with all the lowercase characters removed. 
        System.out.print("Enter a third string: ");
        String input3 = sc.next();
        String modifiedString3 = input3.replaceAll("[a-z]", "");
        System.out.println("Modified String: " + modifiedString3);

        // Task 4 Given a string as input. Input string got some additional '$' characters by 
        // mistake. Print the original string by removing these extra '$' characters. 
        System.out.print("Enter a fourth string: ");
        String input4 = sc.next();
        String modifiedString4 = input4.replaceAll("\\$", "");
        System.out.println("Modified String: " + modifiedString4);
    }
}