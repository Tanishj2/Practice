import java.util.HashMap;

class Solution{


    private static void charactercount(String inputstring)
    {
        HashMap<Character,Integer> charCountMap = new HashMap<Character,Integer>();

        char[] chararray = inputstring.toCharArray();

        for(char c: chararray)
        {
            if(charCountMap.containsKey(c))
            {
                charCountMap.put(c,charCountMap.get(c)+1);
            }
            else{
                charCountMap.put(c,1);
            }
        }
        System.out.println(inputstring+":"+charCountMap);
    }
        public static void main (String[] args)
        {
            charactercount("Java J2EE Java JSP J2EE");
            charactercount("Alll is welll");
        }

}



/*OUTPUT*/

    Java J2EE Java JSP J2EE:{E=4, 2=2, v=2,  =4, P=1, S=1, a=4, J=5}

    Alll is welll:{w=1,  =2, e=1, s=1, A=1, l=6, i=1}
