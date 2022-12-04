Problem Statement:   https://www.hackerrank.com/contests/the-codher/challenges/longestsubstring-1/problem


Java Code:
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.length()!=0){
            int ans = lengthOfLongestSubstring(s);
            System.out.println(ans);
        }
        else{
            int d =0;
        System.out.println(d);
        }
    }
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>() ;
      String longest = "";
      String current = "";
      int i=0;
      int j=0;
      while (i<s.length()){
          char ch = s.charAt(i);
          if(set.contains(ch)){
              current = "";
              set.clear();
           i=j;
             j++;
          }
          else{
              set.add(ch) ;
              current = current + ch;
              i++;
          }
  if(current.length() > longest.length()){
      longest = current;
  }
      }
        return longest.length();
    }
}
