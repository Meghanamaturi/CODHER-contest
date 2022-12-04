ProblemStatement : https://www.hackerrank.com/contests/the-codher/challenges/altstr/problem

Java Code :

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.regex.*;
public class Solution
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
         int t=sc.nextInt();
        for(int i =0; i<t;i++)
        {
            int n=sc.nextInt();
            String s = sc.next();
            Pattern pattern = Pattern.compile("0");
            Matcher matcher = pattern.matcher(s);
            int count = 0;
            while (matcher.find()) {
            count++;
            }
            
            Pattern p = Pattern.compile("1");
            Matcher m = p.matcher(s);
            int count1 = 0;
            while (m.find()) {
            count1++;
            }
            
            if(count1==count){
                System.out.println(count1+count);
            }
            else if(count>count1)
            {
                System.out.println((2*count1)+1);
            }
            else if(count<count1)
            {
                System.out.println((2*count)+1);
            }
        }
       
    }
}
