public class Solution
{
    public static void main(String[] args)
    {
        String str = "Java J2EE Java JSP J2EE";
        StringBuffer sb = new StringBuffer(str);

         sb.replaceAll("\\s+","");                    

        System.out.println(sb);

     
    }
}
