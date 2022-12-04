Problem Statement : https://www.hackerrank.com/contests/the-codher/challenges/sort3nums

Java Code :
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[x];
        int[] me = new int[x];
        for(int i=0; i< x; i++){
            arr[i]= sc.nextInt();
        }
        int j=0;
        for(int i=0; i< x; i++){
            if(arr[i] == a){
                me[j]= a;
                j++;
            } 
        }
        for(int i=0; i< x; i++){
            if(arr[i] == b){
                me[j]= b;
                j++;
            } 
        }
        for(int i=0; i< x; i++){
            if(arr[i] == c){
                me[j]= c;
                j++;
            } 
        }
        for(int i=0; i< x; i++){
            System.out.print(me[i]+" ");
        }
    }
}
