/*
Definition : Given two strings s1 and s2 consisting of lowercase characters. 
The task is to check whether two given strings are an anagram of each other or not.
An anagram of a string is another string that contains the same characters, 
only the order of characters can be different. For example, "act" and "tac" are an anagram of each other. 
Strings s1 and s2 can only contain lowercase alphabets.

Note: You can assume both the strings s1 & s2 are non-empty.

Examples :

Input: s1 = "geeks", s2 = "kseeg"
Output: true
Explanation: Both the string have same characters with same frequency. So, they are anagrams.
*/

import java.util.*;
    class Main {
        public static void main(String[] args) {
            
            String s1="patil";
            String s2="ltipa";
            boolean isAnagram=checkAnagram(s1,s2);
            System.out.println(isAnagram);
            
        }
        public static boolean checkAnagram(String s1,String s2){
            if(s1.length()!=s2.length()) return false;
            int[] arr=new int[26];
            for(int i=0;i<s1.length();i++){
                arr[s1.charAt(i)-'a']++;
                arr[s2.charAt(i)-'a']--;
            }
           for(int k:arr){
               if(k!=0) return false;
           }
            return true;
        }
    }
