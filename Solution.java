package javaapplication1;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");
        int n=Integer.parseInt(s[0]),m=Integer.parseInt(s[1]);
        char a[][]=new char[n][m];
        for(int i=0;i<n;i++){
            String s1=br.readLine();
            a[i]=s1.toCharArray();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}