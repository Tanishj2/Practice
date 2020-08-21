#There are three method in java by which you reverse your string
1.Using StringBuffer because it is immutable
2.Iterative method
3.Recursion Method

#Method 1 using StringBuffer

public class Solution {

    public static void main(String[] args) {
    
        String s1 = "MyJava";
        StringBuffer sb = new StringBuffer(s1);

        System.out.println(sb.reverse());
    }
}


#Method 2 using iterative method
public class Solution
{
    public static void main(String[] args)
    {
        String s = "Tanish Jain";
        
        //1st step is to convert string into char array
        char [] chararray = s.toCharArray();

        //iterate through for loop
        for(int i=chararray.length-1;i>=0;i--)
        {
            System.out.print(chararray[i]);
        }
    }
}

 

#Method 3 using recursion method
public class Solution
{
    public static void main(String[] args)
    {
        String s = "Tanish Jain";
         
        System.out.println(recursiveMethod(s));             //output- niaJ hsinaT
    }
static String  recursiveMethod (String str)
    {
         if ((null == str) || (str.length() <= 1))
         {
                return str;
         }
 
         return recursiveMethod(str.substring(1)) + str.charAt(0);
    }
}
     




