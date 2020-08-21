import java.util.HashMap;
import java.util.Set;
public class Solution
{
    private static void characterDuplicatecount(String str)
    {
        char[] ch = str.toCharArray();              //convert string to char array

        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        for(char c: ch)
        {
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }
        Set<Character> setmap = map.keySet();
        System.out.println("Duplicate character In:"+str);

        for(Character c: setmap)
        {
            if(map.get(c) > 1)
                System.out.println(c+":"+map.get(c));
        }

    }
    public static void main(String[] args)
    {
        characterDuplicatecount("Java J2EE Java JSP J2EE");
    }
}


/*Output  

    Duplicate character In: Java J2EE Java JSP J2EE

    E:4

    2:2

    v:2

     :4

    a:4

    J:5
    */
