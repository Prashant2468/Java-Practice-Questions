/*
Definition : Given two strings, one is a text string txt and the other is a pattern string pat. 
The task is to print the indexe  of all the occurrences of the pattern string in the text string. 
Use 0-based indexing while returning the indices. 
Note: Return an empty list in case of no occurrences of pattern.

Examples :

Input: txt = "abcab", pat = "ab"
Output: [0, 3]
Explanation: The string "ab" occurs twice in txt, one starts at index 0 and the other at index 3. 
*/

// Approach 1 : Optimize way using KMP algorithm 

class SearchPatterns {   
  // KMP algoritm
    public static void createLps(String pat,int[] lps){
        int len=0;
        lps[0]=0;
        int i=1;
        lps=[01]
        while(i<pat.length()){
            if(pat.charAt(i)==pat.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len!=0){
                    len=lps[len-1];
                }else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        System.out.println(Arrays.toString(lps));
    }

    public static ArrayList<Integer> search(String pat, String txt) {
        // your code here
      int n=txt.length();
      int m=pat.length();
      
      int[] lps=new int[m];
      
      ArrayList<Integer> res=new ArrayList<>();
      
      createLps(pat,lps);
      
      int j=0,i=0;
      
      while(i<n){
          if(txt.charAt(i)==pat.charAt(j)){
              i++;
              j++;
              
              if(j==m){
                  res.add(i-j);
                  j=lps[j-1];
              }
          }else{
              if(j!=0){
                  j=lps[j-1];
              }else{
                  i++;
              }
          }
      }
      return res;
    }
    
    public static void main(String args[]){
        String txt="aabaababaaba";
        String pat="aaba";
        ArrayList<Integer> res=search(pat,txt);
        System.out.println(res);
    }
}


// Approach 2 : Brute-force Approach 

class SearchPattern {
    public static void main(String args[]){
    String s="aabaababaaba";
    String p="aaba";
    int n=s.length();
    int m=p.length();
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=0;i<n-m+1;i++){
        if(s.charAt(i)==p.charAt(0)){
            boolean isMatch=true;
            for(int j=1;j<m;j++){
                if(s.charAt(i+j)!=p.charAt(j)){
                    isMatch=false;
                    break;
                }
            }
            if(isMatch){
                list.add(i);
            }
        }
        
    }
    System.out.println(list);
  }
}


