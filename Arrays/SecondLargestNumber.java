
/*
 Definition : Write a Java program to find the second largest element in an array of integers.
 */

// import java.lang.reflect.Array;
// import java.util.ArrayList;
// import java.util.Scanner;
// public class SecondLargestNumber {
//     public static void main(String a[]) {
//         int[] arr = new int[10]; // Array of integers
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Array Elements : ");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int max = arr[0];
        // first convert in ascending order
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[j] > arr[i]) {
//                     max = arr[j];
//                     arr[j] = arr[i];
//                     arr[i] = max;
//                 }
//             }
//         }
//         ArrayList<Integer> list = new ArrayList<>();
//         for (int i = 0; i < arr.length; i++) {
//             if (!list.contains(arr[i])) {
//                 list.add(arr[i]);
//             }
//         }
//         System.out.println("Second Smallest Number is : " + list.get(list.size() - 2));
//     }
// }
import java.util.Scanner;

public class SecondLargestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter the Array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize largest and secondLargest
        int largest = 0, secondLargest = 0;

        // Find largest and second largest in a single pass
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == 0) {
            System.out.println("No second largest number found.");
        } else {
            System.out.println("Second Largest Number is: " + secondLargest);
        }
    }
}

// Output:
// Enter the Array Elements:
// 1
// 20
// 13
// 40
// 15
// 65
// Second Largest Number is: 40
