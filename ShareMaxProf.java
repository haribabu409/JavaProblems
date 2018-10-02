import java.util.*;


/**
 * Prices of share over n days are given. Person should make only one transaction. What is the maximum profit possible.
 * */
public class ShareMaxProf
{
    public static void main(String[] args)
    {
        System.out.println(Integer.MIN_VALUE);
        Scanner s = new Scanner(System.in);
        //Read no of days
        int count = s.nextInt();
        int[] prices = new int[count];
        //Read prices on each day
        for(int i=0; i< count; i++)
        {
            prices[i] = s.nextInt();
        }
        
        System.out.println("Max profit obtained is:" + getMaxProfit(prices) );
    
    }
    
    public static int getMaxProfit(int[] p)
    {
        int minVal = Integer.MAX_VALUE;
        int maxDiff = 0;
        
        for(int i : p)
        {
            if(i<minVal)
                minVal = i;
            else
            {
                int temp = i-minVal;
                if(temp>maxDiff)
                    maxDiff = temp;
            }
        }
        return maxDiff;
    }
    
    
}