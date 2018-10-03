import java.util.*;

/*
Largest no formed by concatenating individual integers
5
3 30 34 5 9

Result = 9534330
*/

public class LargestNo{

     public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        Integer[] a = new Integer[count];
        for(int i=0; i<count; i++)
        {
            a[i] = s.nextInt();
        }
        
        Arrays.sort(a, new Comparator<Integer>(){
           @Override
           public int compare(Integer i1, Integer i2)
           {
               String a = String.valueOf(i1);
               String b = String.valueOf(i2);
               
               return Integer.parseInt(b+a) - Integer.parseInt(a+b);
           }
        });
        
        for(int i=0; i<count; i++)
        {
            System.out.print(a[i]);
        }
        System.out.println("");
     }
}