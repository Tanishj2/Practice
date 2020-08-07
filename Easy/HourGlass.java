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
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        
        //Code
        int max_hourglass_sum = Integer.MIN_VALUE;
        int row = arr.length;
        int column = arr[0].length;
        
        for(int i =0;i<row-2;i++)
        {
            for(int j=0;j<column-2;j++)
            {
                int current_hourglass_sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]
                                    +arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]
                                    +arr[i+2][j+2];

               max_hourglass_sum = Math.max(current_hourglass_sum,max_hourglass_sum); 
            }
        }
        System.out.println(max_hourglass_sum);


        scanner.close();
    }
}
