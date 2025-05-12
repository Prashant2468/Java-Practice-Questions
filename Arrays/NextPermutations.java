/*
Deinition : Given an array of integers arr[] representing a permutation, 
implement the next permutation that rearranges the numbers into the lexicographically next greater permutation. 
If no such permutation exists, rearrange the numbers into the lowest possible order (i.e., sorted in ascending order). 
Note - A permutation of an array of integers refers to a specific arrangement of its elements in a sequence or linear order.

Examples:

Input: arr = [2, 4, 1, 7, 5, 0]
Output: [2, 4, 5, 0, 1, 7]
Explanation: The next permutation of the given array is {2, 4, 5, 0, 1, 7}.
*/
import java.util.Arrays;

public class NextPermutations {
    public static void nextPermutation(int[] arr) {
        // code here
      int l=arr.length-2;
      boolean found=false;
      for(int i=l;i>=0;i--){
          if(arr[i]<arr[i+1]){
              l=i;
              found=true;
              break;
          }
      }
      if(!found){
              ascending(arr,0,arr.length-1);
              return;
      }
      for(int j=arr.length-1;j>l;j--){
          if(arr[l]<arr[j]){
              int temp=arr[l];
              arr[l]=arr[j];
              arr[j]=temp;
              ascending(arr,l+1,arr.length-1);
              break;
          }
      }
      
    }
    public static void ascending(int[] arr,int start , int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

  public static void main(String args[]){
    int[] arr={3, 4, 2, 5, 1};  
    nextPermutation(arr);
    System.out.println(Arrays.toString(arr));
  }
}
