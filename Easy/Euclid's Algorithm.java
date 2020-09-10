/* This code is to find the GCD of two positive integer.*/


import java.io.*;
import java.util.*;
 
public class GCD{
    public int findGcd(int m,int n)
    {
        int r;
        r = m % n;
        if(r == 0)
            return n;
        else{
        m = n ;
        n = r;
       return findGcd(m,n);}
    }
     public static void main(String []args){
        //int m=12,n=8;
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        GCD gc = new GCD();
        int isgcd = gc.findGcd(m,n);
        System.out.println(isgcd+"is GCD");
     }
}

/* OUTPUT */
4 is GCD
https://onlinegdb.com/r1rBumv4v
