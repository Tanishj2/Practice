import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
             a[i] = scanner.nextInt();
        }
        //creating second array for rotation
    
        while(d-->0)
        {
            int i;
            int temp=a[0];
            for( i=0;i<a.length-1;i++)
            {
                a[i] = a[i+1]; 
            }
            a[i] = temp;
        }
//print the updated array as a single line of space-separated integers.
         for(int i: a)
         {
             System.out.print(i+" ");
         }

        scanner.close();
    }
}
