ProblemStatement : https://www.hackerrank.com/contests/the-codher/challenges/digarr/problem


Java Code:
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner s = new Scanner(System.in);
        int T = s.nextInt();
         for(int k =0; k<T;k++) {
            int D = s.nextInt();
            String N = s.next();
            int count = 0;
            for (int i = 0; i < D; i++) {
                if (N.charAt(i) == '0' || N.charAt(i) == '5') {
                    count++;
                }
            }
            if (count != 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
}
}
