import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if(x>=-Math.pow(2,15) && x<=Math.pow(2,15)-1)System.out.println("* short");       //because short is a 16 bit signed two complimentwhich has a minimum value of -2^15 and a maximum value of 2^15-1.
                if(x>=-Math.pow(2,31)&& x<=Math.pow(2,31)-1)System.out.println("* int");          //same as int
                if(x>=-Math.pow(2,63) && x<=Math.pow(2,63)-1)                             
                    System.out.println("* long");                                                 //same as long 
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}
