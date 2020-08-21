import java.util.Arrays;

public class Solution
{
    public static void main(String[] args)
    {
        isAnagram("Mother In Law", "Hitler Woman");
 
        isAnagram("keEp", "peeK");
    }
    static void isAnagram(String s1, String s2)
    {
        boolean status = true;

        String copyofs1 = s1.replaceAll("\\s+","");
        String copyofs2 = s2.replaceAll("\\s+","");

        if(copyofs1.length()!=copyofs2.length())
        {
            status = false;
        }
        else{
             char[] Arrays1 = copyofs1.toLowerCase().toCharArray();
             char[] Arrays2 = copyofs2.toLowerCase().toCharArray();
        
              Arrays.sort(Arrays1);                               //sort char array
              Arrays.sort(Arrays2);

             status = Arrays.equals(Arrays1,Arrays2);          //equals return boolean
            }   
        if(status)
        {
            System.out.println(s1 +" "+"and"+" "+s2+" "+ "are Anagram");
        }
        else
        {
            System.out.println(s1 +"and"+s2 + "are not Anagram");
        }
    }
    
}



