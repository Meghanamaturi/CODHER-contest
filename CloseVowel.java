Problem Statement : https://www.hackerrank.com/contests/the-codher/challenges/closevowel/problem


Java Code:
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();
        for(int k=0; k< x; k++){
            int n = sc.nextInt();
            String s = sc.next();
            int cunt = 1;
            
            long num = 1000000007;
            
            for(int i=0; i<s.length(); i++) {
                char c = s.charAt(i);
                if(c == 'c' || c == 'l' || c == 'r' || c == 'g')
                cunt *= 2;
                
                cunt %= num;
            }
            
            System.out.println(cunt);
        }
    }
}
