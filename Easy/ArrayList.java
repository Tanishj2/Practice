/*
#Input Format
The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there will be  space-separated integers. In the next line there will be an integer  denoting number of queries. Each query will consist of two integers  and .


#Output Format
In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"
*/



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<List<Integer>> A = new ArrayList<List<Integer>>();
        
        for (int i = 0; i < n; i++) {
            int l = input.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>();
            while(l-- > 0) {
                a.add(input.nextInt());
            }
            A.add(a);
        }
        
        int m = input.nextInt();
        while(m-- > 0) {
            int line = input.nextInt()-1;
            int position = input.nextInt()-1;
            if (line >= A.size()) {
                System.out.println("ERROR!");
            } else if (position >= A.get(line).size()) {
                System.out.println("ERROR!");
            } else {
                System.out.println(A.get(line).get(position));
            }
        }
    }
}
