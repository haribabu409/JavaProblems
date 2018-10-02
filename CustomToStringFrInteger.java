import java.util.*;

public class CustomToStringFrInteger
{
    public static void main(String[] args)
    {
        
      String res  =  toString(1234);
      System.out.println("result: " + res);
    }
    
    
    public static String  toString(Integer i)
    {
        String str;
        if(i>0)
        {
            int temp = i%10;
            i=i/10;
            int val = '0' + (int) temp;
            //System.out.println(val);
            char s = (char) val;
            //System.out.println(s);
            return toString(i)+s;
        }
        else
            return "\0";
    }
    
    
}