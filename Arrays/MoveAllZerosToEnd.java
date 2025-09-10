/*
Definition : You are given an array arr[] of non-negative integers. 
Your task is to move all the zeros in the array to the right end 
while maintaining the relative order of the non-zero elements. 
The operation must be performed in place, meaning you should not use extra space for another array.

Examples:

Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: [1, 2, 4, 3, 5, 0, 0, 0]
Explanation: There are three 0s that are moved to the end.

*/
import java.util.*;
class MoveAllZerosToEnd {
    public static void pushZerosToEnd(int[] arr) {
        // code here
        int tempIndex=0;
        int[8] arr={1,2,0,4,3,0,0};
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[tempIndex++]=arr[i];
            }
        }
        while(tempIndex<arr.length){
            arr[tempIndex++]=0;
        }
      System.out.println(Arrays.toString(arr));
    }
  
  public static void main(String args[]){
    int[] arr={1,0,5,0,6,0,0,8};
    pushZerosToEnd(arr);
}
