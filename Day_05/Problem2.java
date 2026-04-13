public class Problem2 {
    public static void main(String[] args) {
        // Problem 2.1 Write a function cleanString() that takes a string as input and return
        //  a new string containing only alphabets from input string. Assume string 
        // contains  only lowercase letters or digits. 
        String str = "h3ll0w0rld";
        System.out.println(cleanString(str));
    

        // Problem 2.2 Write a function print2() that takes a list of string as input and 
        // prints every string after cleaning (removing digits from them). 
        // Note: Use cleanString() function from problem 2.1 
        String[] arr = {"h3ll0w0rld", "j4v4pr0gr4mm1ng"};
        print2(arr);
    }

    public static String cleanString(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void print2(String[] arr) {
        for (String str : arr) {
            System.out.println(cleanString(str));
        }
    }
}