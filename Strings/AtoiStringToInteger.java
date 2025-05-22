/*
Definition : Given a string s, the objective is to convert it into integer 
format without utilizing any built-in functions. Refer the below steps to know about atoi() function.

Cases for atoi() conversion:

1) Skip any leading whitespaces.
2) Check for a sign (‘+’ or ‘-‘), default to positive if no sign is present.
3) Read the integer by ignoring leading zeros until a non-digit character is encountered or end of the string is reached.
If no digits are present, return 0.
4) If the integer is greater than 2^31 – 1, then return 2^31 – 1 and if the integer is smaller than -231, then return -231.

Examples:

Input: s = "-123"
Output: -123
*/

import java.util.*;
class Solution {
    public static int myAtoi(String s) {
        // Your code here
        int i=0,n=s.length();
        int result=0;
        int sign=1;
        
        while(i<n && s.charAt(i) == ' '){
            i++;
        }
        
        if(i<n){
            if(s.charAt(i)=='-'){
                sign=-1;
                i++;
            }else if(s.charAt(i) == '+'){
                i++;
            }
        }
        
        while(i<n){
            char c=s.charAt(i);
            if(c<'0' || c>'9') break;
            int digit=c-'0';
            
            if(result > (Integer.MAX_VALUE-digit)/10){
                return (sign == 1) ? Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            
            result = result * 10 + digit;
            i++;
        }
        
        return result * sign;
    }

  public static void main(String args[]){
    String s="  -0012gfg4";
    int result=myAtoi(s);
    System.out.println(result);
  }
}
