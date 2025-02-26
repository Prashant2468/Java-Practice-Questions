/*
 * Definition : Lucky Numbers: Lucky numbers are a subset of integers.
 * Example of Lucky Numbers:
 * Take the set of integers
 * 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20
 * First, delete every Second number, we get the following 
 * reduced set.
 * 1,3,5,7,9,11,13,15,17,19 (index(2)=3) therefor delete each 3rd element bellow
 * Now, delete every Third number, we get
 * 1, 3, 7, 9, 13, 15, 19
*/

import java.util.ArrayList;
import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Step 1: Initialize the list with numbers from 1 to n
        ArrayList<Integer> luckyNumbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            luckyNumbers.add(i);
        }

        // Step 2: Remove every nth number iteratively
        int index = 1;
        while (index < luckyNumbers.size()) {
            int step = luckyNumbers.get(index);
            ArrayList<Integer> tempList = new ArrayList<>();

            // Only keep numbers that are not at the removed positions
            for (int i = 0; i < luckyNumbers.size(); i++) {
                if ((i + 1) % step != 0) { 
                    tempList.add(luckyNumbers.get(i));
                }
            }
            luckyNumbers = tempList;  // Update list after removal
            index++;
        }
        // Step 3: Print the lucky numbers
        System.out.println("Lucky numbers: " + luckyNumbers);
        sc.close();
    }
}


/*
* Solution - 2 
*/


import java.util.ArrayList;
import java.util.Scanner;

public class LuckyNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Step 1: Initialize the list with numbers from 1 to n
        ArrayList<Integer> luckyNumbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            luckyNumbers.add(i);
        }

        // Step 2: Remove every nth number iteratively
        int index = 1;
        while (index <=6) {
            // int step = luckyNumbers.get(index);
            ArrayList<Integer> tempList = new ArrayList<>();

            // Only keep numbers that are not at the removed positions
            for (int i = 0; i < luckyNumbers.size(); i++) {
                if ((i + 1) % (index + 1) != 0) {
                    tempList.add(luckyNumbers.get(i));
                }
            }
            System.out.println(tempList);

            luckyNumbers = tempList;  // Update list after removal
            index++;
        }


        // Step 3: Print the lucky numbers
        System.out.println("Lucky numbers: " + luckyNumbers);
        sc.close();
    }
}

