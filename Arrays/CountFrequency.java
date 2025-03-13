/*
 * Definition : Find the frequency of element in the array
 * Example : 
 * Input : [10,20,20,30,20,40,10]
 * Output : 10 2
 *          20 3
 *          30 1
 *          40 1    
 * 
 */

import java.util.HashMap;

// Solution : 1
public class CountFrequency {
    public static void main(String[] args) {
        int arr[] = {20, 10, 30, 20, 10, 20, 20};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        // System.out.println(map);
        for (Integer key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}

// Solution : 2
public class CountFrequency {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 20, 40, 10};
        int frq[] = new int[1001];
        for (int i = 0; i < arr.length; i++) {
            frq[arr[i]]++;
        }
        for (int i = 0; i < 1001; i++) {
            if (frq[i] != 0) {
                System.out.println(i + " " + frq[i]);
            }
        }
    }
}
