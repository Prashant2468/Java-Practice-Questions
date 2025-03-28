/*
    Definition : Check the inputed number is armstrong number or not
    (Armstrong) ->Armstrong numbers means the number whose sum of the ,cube of the all digits is same as number itself
    Example : 153 = (1*1*1) + (5*5*5) + (3*3*3) = 153
*/
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int sum=0,rem,copy=n;
        while(n!=0){
            rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        if(sum==copy){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong Number");
        }
    }
}
