/*
Definition : Given a string s, the task is to find the minimum number of characters to be added to the front of s to make it palindrome.
A palindrome string is a sequence of characters that reads the same forward and backward.

Examples: 

Input: str = "aacecaaaa"
Output: 2
Explanation: We can make above string palindrome as "aaaacecaaaa" by adding two a's at front of string.
*/

// Approach 1) : Using the KMP algorithm

class MinCharForPalindrome {
    public static int minChar(String s) {
        // Write your code here
    int n=s.length();
    String rev=new StringBuilder(s).reverse().toString();
    s=s+"$"+rev;
    
    int[] lps=lpsArray(s);
    
    return (n-lps[lps.length-1]);
    }
    
    public static int[] lpsArray(String pat){
        
        int n=pat.length();
        int[] lps=new int[n];
        
        lps[0]=0;
        int i=1,len=0;
        
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
        String s="aacecaaaa";
        System.out.println(minChar(s));
    }
}


// Approach 2) : Using the Brute-force way

// Java program for counting minimum character to be
// added at front to make string palindrome
class MinCharForPalindrome {

    // Function to check if the substring s[i...j] is a palindrome
    static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            
            // If characters at the ends are not the same, it's not a palindrome
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static int minChar(String s) {
        int cnt = 0;
        int i = s.length() - 1;
    
        while (i >= 0 && !isPalindrome(s, 0, i)) {   
            i--;
            cnt++;
        }   
        return cnt;
    }
    public static void main(String[] args) {
        String s = "AACECAAAA";
        System.out.println(minChar(s));
    }
}

