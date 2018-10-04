import java.util.*;

/*
INPUT
5 6
1  2  3  4  5  6 
7  8  9  10 11 12 
13 14 15 16 17 18 
19 20 21 22 23 24 
25 26 27 28 29 30 

OUTPUT
1 2 3 4 5 6 12 18 24 30 29 28 27 26 25 19 13 7 8 9 10 11 17 23 22 21 20 14 15 16
*/

public class PrintSpiralForm{

     public static void main(String []args)
     {
      
      Scanner s = new Scanner(System.in);
      int rc = s.nextInt();
      int cc = s.nextInt();
      int a[][] = new int[rc][cc];
      
      for(int i=0; i<rc; i++)
      {
          for(int j=0; j<cc; j++)
          {
              a[i][j] = s.nextInt();
          }
      }
      
      printspiral(a, rc, cc, 0,0);
      
     }
     
     public static void printspiral(int[][] a, int m, int n, int x, int y)
     {
         //System.out.println("Executing printspiral method");
         
         if(m==0)
         {
             return;
         }
         else if(m==1 && n==1)
         {
             System.out.print(a[x][y]+" ");
             return;
         }
         else if(m==1)
         {
             for(int j=y; j<y+n; j++)
             {
                 System.out.print(a[x][j]+" ");
             }
             return;
         }
         else
         {
             int i,j;
             
             i=x;
             for(j=y; j<(y+n); j++)
             {
                 System.out.print(a[i][j]+" ");
             }
             
             j = y+n-1;
             for(i=x+1; i<x+m; i++)
             {
                  System.out.print(a[i][j]+" ");
             }
             
             i=x+m-1;
             for(j=y+n-2; j>=y; j--)
             {
                  System.out.print(a[i][j]+" ");
             }
             
             j=y;
             for(i=x+m-2; i>x; i--)
             {
                  System.out.print(a[i][j]+" ");
             }
             
             printspiral(a, m-2, n-2,x+1, y+1);
         }
     }
}