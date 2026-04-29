import java.util.HashMap;

public class Task3 {
    public static void main(String[] args) {

        int[] arr = {10,20,30,20,40,50};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;

        for(int freq : map.values()) {
            if(freq > maxFreq) {
                maxFreq = freq;
            }
        }

        for(int key : map.keySet()) {
            if(map.get(key) == maxFreq) {
                System.out.print(key + " ");
            }
        }
    }
}