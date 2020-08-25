import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.next();
        }
        int m=sc.nextInt();
        String ar[]=new String[m];
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=sc.next();
        }
        HashMap<String,Integer>map=new HashMap();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        int mm=0;
        for(int i=0;i<ar.length;i++)
        {
        // try
            //{
        if(map.containsKey(ar[i]))
        {
         mm=map.get(ar[i]);                  //get-return the value associate with key
         System.out.println(mm);
        }
        else
            System.out.println(0);
        
        //}
        //catch(Exception e)
       // {
        //System.out.println(0);    
        //}
    //    System.out.println(mm);
    }
    }
}
