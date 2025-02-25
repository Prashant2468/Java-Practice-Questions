/* Definition : (HappyNumber) A number is called happy if it leads to 1 after a sequence of steps where in each step number is replaced by the
                 sum of squares of its digit , that is if we start with HappyNumber and keep replacing it with digits square sum , we reach1.

Example : 1,7,10,13,19,23,28,31,32,44,49,68,70,79,82,86,91,94,97,100

UserInput:n=19
Output:True

19 is HappyNumber,
1^2+9^2=82
8^2+2^2=68
6^2+8^2=100
1^2+0^2+0^2=1

As we reached 1 , 19 is a HappyNumber.

Input:n=20
Output:False
 */

import java.util.*;

public class HappyNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        System.out.println(isHappy(num));
    }

    public static boolean isHappy(int n) {
        ArrayList<Integer> set = new ArrayList<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = getSum(n); 
            System.out.println(n);
             
        }
        return n == 1;
    }

    public static int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }
}
