
import java.util.ArrayList;
import java.util.Scanner;

public class LuckyNumber {

    public static void main(String[] args) {
        ArrayList<Integer> luckyNumbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            luckyNumbers.add(i+1);
        }
        System.out.println(luckyNumbers);

        for(int i=1;i<=6;i++){
            for(int j=1;j<luckyNumbers.size();j++){
                if(j%i==0){
                    luckyNumbers.remove(j);
                }
            }
        }
        System.out.println(luckyNumbers);

    }
}
