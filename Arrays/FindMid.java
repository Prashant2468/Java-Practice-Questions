

/*
 * Definition : Find the Middle element from the array
 * Example : 
 * Input  : [12 23 25 35 45]
 * Output : 25
 */
import java.util.*;

public class FindMid {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Step : 1 Take length of array as Input
        System.out.println("Enter the length of arrauy : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Step : 2 Now convert array in Ascending order
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        // Step : 3 Now find the middle element
        if (n % 2 == 1) {
            System.out.println(arr[n / 2]);
        } else {
            System.out.println((arr[n / 2 - 1] + arr[n / 2]) / 2);
        }
    }
}
