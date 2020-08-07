import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scan.nextInt();
        }
        scan.close();

        int negative_subarrays = 0;
        for(int i=0;i<n;i++)           // pick starting point
        {  
            for(int j=i;j<n;j++)        // pick ending point of array
            {
                int current_sum = 0;
                for(int k=i;k<=j;k++)       //print subarray between start and end points
                {
                current_sum += arr[k]; 
                }
                if(current_sum < 0)
                {
                    negative_subarrays++;
                }
            }
        }
        System.out.println(negative_subarrays);
    }

}
