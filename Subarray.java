// Question 4: Java Subarray

// Skill Mapping: Basic

// Description: Solve the HackerRank Problem given as a link below

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Subarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ressum,count=0;
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                ressum = 0;
                for(int k=i;k<=j;k++)
                {
                    ressum+=a[k];
                   
                }
                 if(ressum<0)count++;
            }
        }
        System.out.print(count);
    }
}
