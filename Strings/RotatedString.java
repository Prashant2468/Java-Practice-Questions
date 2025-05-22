/*
Definition : You are given two strings of equal lengths, s1 and s2.
The task is to check if s2 is a rotated version of the string s1.
Note: The characters in the strings are in lowercase.

Examples :

Input: s1 = "abcd", s2 = "cdab"
Output: true
Explanation: After 2 right rotations, s1 will become equal to s2.
*/

class RotatedString {
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        int n=s1.length();
        int m=s2.length();
        if(n!=m) return false;
        int[] lps=lpsArray(s2);
        s1=s1+s1;
        int i=0,j=0;
        
        while(i<s1.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
            }
            if(j==m){
                return true;
            }else if(i<s1.length() && s1.charAt(i)!=s2.charAt(j)){
                if(j!=0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
        }
        return false;
    }
    
    public static int[] lpsArray(String pat){
        int n=pat.length();
        int len=0,i=1;
        int[] lps=new int[n];
        
        lps[0]=0;
        
        while(i<n){
            if(pat.charAt(i)==pat.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                
                if(len==0){
                    lps[i]=0;
                    i++;
                }else{
                    len=lps[len-1];
                }
            }
        }
        
        return lps;
    }
    
    public static void main(String args[]){
        String s1="abcd";
        String s2="cdab";
        System.out.println(areRotations(s1,s2));
    }
}
