/*
Definition : Given a string s consisting of lowercase English Letters. Return the first non-repeating character in s.
If there is no non-repeating character, return '$'.
Note: When you return '$' driver code will output -1.

Examples:

Input: s = "geeksforgeeks"
Output: 'f'
Explanation: In the given string, 'f' is the first character in the string which does not repeat.

*/

class NonRepeatingChar {
    public static char findNonRepeatChar(String s) {
        // code here
        int[] f=new int[26];
        
        for(char c:s.toCharArray()){
            f[c-'a']++;
        }
        
        for(char c:s.toCharArray()){
            if(f[c-'a']==1){
                return c;
            }
        }
        return '$';
    }

  public static void main(String args[]){
    String s="geeksforgeeks";
    char result=findNonRepeatChar(s);
    System.out.println(result);
  }
}
