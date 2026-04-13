public class Problem1 {
    public static void main(String[] args) {
        // problem 1.1 Write a function firstThree() that takes a string as input and 
        // returns a string containing only first three characters from the input string.
        //  Assume input string has at least 3 characters 
        String str = "Hello World";
        System.out.println(firstThree(str));

        // Problem 1.2 Write a function printFirstThree() that takes a list 
        // of string as input and prints the first three characters of every string. 
        // Note: Use firstThree() function from problem 1.1 to get the first three 
        // characters of every string in the list. 
        String[] arr = {"Hello", "World", "Java", "Programming"};
        printFirstThree(arr);
    }

    public static String firstThree(String str) {
        return str.substring(0, 3);
    }

    public static void printFirstThree(String[] arr) {
        for (String str : arr) {
            System.out.println(firstThree(str));
        }
    }
}