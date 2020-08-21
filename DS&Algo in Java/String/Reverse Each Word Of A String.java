 public class Solution
 {
     static void reverseEachWordOfString(String str)
     {
         String[] words = str.split(" ");
         String reverseString = "";

         for(int i=0;i<words.length;i++)
         {
             String word= words[i];
             
             String reverseWord ="";
             
             for(int j=word.length()-1;j>=0;j--)
             {
                 reverseWord = reverseWord + word.charAt(j);
             }
                reverseString += reverseWord + " ";
         }
         System.out.println(str);
         System.out.println(reverseString);
     }



     public static void main(String[]args)
     {
         String s1 = "Java TU Jaa";
         reverseEachWordOfString(s1);
     }
 }
 
 --------
 OUTPUT
 --------
 
 Java TU Jaa
 avaJ UT aaJ 
 
 
 
