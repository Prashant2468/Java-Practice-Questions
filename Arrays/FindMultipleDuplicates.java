/*
Definition : write a program to find duplicated from the given array

Input : [1,2,2,3,5,2,6,5,3,4]
Outout : [2,3,5]
*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr={0,1,5,3,5,6,2,3,1,2};
        Set<Integer> seen=new HashSet<>();
        Set<Integer> duplicate=new HashSet<>();
        
        for(int num:arr){
            if(!seen.add(num)){
                duplicate.add(num);
            }   
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(duplicate);
    }
}
