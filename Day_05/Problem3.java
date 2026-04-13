public class Problem3 {
    public static void main(String[] args) {
    // Problem 3.1 Write a function numberSeries() that takes n as input 
    // and returns a string in following pattern: "123....n" NumberSeries 
    // should return empty string if n is less than 1. 
     int n = 5;
     System.out.println(numberSeries(n));
    // Problem 3.2 Write a function serieslist() that takes an array of integers 
    // as input and creates a new string list. Each integer n in array have a 
    // corresponding string number series "123.....n" stored at same location in string list.
        int[] arr = {3, 5, 0, -2};
        String[] seriesList = seriesList(arr);
        for (String s : seriesList) {
            System.out.println(s);
        }
    }
 
    public static String[] seriesList(int[] arr) {
    String[] result = new String[arr.length];
    for (int i = 0; i < arr.length; i++) {
        result[i] = numberSeries(arr[i]);   
    }
    return result;
    }



    public static String numberSeries(int n) {
        if (n < 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i);
        }
        return sb.toString();
    }
}