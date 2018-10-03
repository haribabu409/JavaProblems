import java.util.*;

/*
* Sorting Elements of an Array by Frequency. If two elements are having same frequency, then print in increasing value. range of numbers is [1,60]

input:
11
2 3 2 4 5 12 2 3 3 3 12

output:
3 3 3 3 2 2 2 12 12 4 5
*/

public class SortByFreq
{
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        //Read count of numbers
        int count = s.nextInt();
        int[] a = new int[count];
        int[] freq = new int[61];
        Arrays.fill(freq, 0);
        
        //Reading inputs
        for(int i=0; i<count; i++)
        {
            a[i] = s.nextInt();
        }
        
        int max = 0;
        //find freq of each no
        for(int i : a)
        {
            freq[i]++;
            if(i>max)
                max = i;
        }
        
        for(int i=0; i<=max; i++)
        {
            int highfreq = 0;
            int highindx = 0;
            for(int j=0; j<=max; j++)
            {
                if(freq[j] > highfreq)
                {
                    highfreq = freq[j];
                    highindx = j;
                }
            }
            for(int j=0; j<highfreq; j++)
            {
                System.out.print(highindx+" ");
            }
            freq[highindx] = 0;
        }
        
    }
    
}