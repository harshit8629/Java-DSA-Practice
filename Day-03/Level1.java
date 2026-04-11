import java.util.*;
public class Level1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Task 1: Count the number of 'z' characters in a given string.
        System.out.print("Enter the string:");
        String s = sc.next();
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='z'){
                count++;
            }
        }
        System.out.println("The number of 'z' characters in the string is: " + count);

        // Task 2: Given a string as input.  Print total number of uppercase and lowercase 
        //         characters. Note: String can contain non-alphabets. 
        System.out.print("Enter the String:");
        String str = sc.next();
        int uppercase =0;
        int lowercase =0;
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                uppercase++;
            }
            else if(Character.isLowerCase(str.charAt(i))){
                lowercase++;
            }
        }
        System.out.println("The number of uppercase characters in the string is: " + uppercase);
        System.out.println("The number of lowercase characters in the string is: " + lowercase);
    }
}