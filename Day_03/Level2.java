import java.util.*;
public class Level2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Task 1 Given a string as input. Give count of character 'x' and 'y' in given string. 
        System.out.print("Enter the string:");
        String s = sc.next();
        int countX = 0;
        int countY = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'x') {
                countX++;
            }
            if (s.charAt(i) == 'y') {
                countY++;
            }
        }
        System.out.println("The number of 'x' characters in the string is: " + countX);
        System.out.println("The number of 'y' characters in the string is: " + countY);

        // Task 2 Given a string as input. Print capital if we encounter capital letter. Print small 
        //        otherwise. Assume string contains only alphabets. 
        System.out.print("Enter the string:");
        String s1 = sc.next();
        for (int i = 0; i < s1.length(); i++) {
            if (Character.isUpperCase(s1.charAt(i))) {
                System.out.println(s1.charAt(i) + " is a capital letter.");
            } else {
                System.out.println(s1.charAt(i) + " is a small letter.");
            }
        }

        // Task 3 Count digits and alphabets in input string. Assume string contains only alphabets 
       //         and digits. 
        System.out.print("Enter the string:");
        String s2 = sc.next();
        int digitCount = 0;
        int alphabetCount = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (Character.isDigit(s2.charAt(i))) {
                digitCount++;
            } else if (Character.isLetter(s2.charAt(i))) {
                alphabetCount++;
            }
        }
        System.out.println("The number of digits in the string is: " + digitCount);
        System.out.println("The number of alphabets in the string is: " + alphabetCount);

        //  Task 4 Given a string as input. Print patterns according to following set of test cases.
       //        Input:"car"
       //        Output: c 
       // 	             c# 
       // 	             c#r 
        System.out.print("Enter the string:");
        String s3 = sc.next();
        String s4 = "";
        for(int i=0;i<s3.length();i++){
            if(i%2!=0){
                s4+="#";
            }
            else{
                s4+=s3.charAt(i);
            }
            System.out.println(s4);
        }      
    }
}