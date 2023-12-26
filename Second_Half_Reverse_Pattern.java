// The program must accept an even integer N as the input. The program must print
// the desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 4 <= N <= 50

// Input Format:
// The first line contains N.

// Output Format:
// The first N/2 lines contain the desired pattern as shown in the Example
// Input/Output section.

// Example Input/Output 1:
// Input:
// 6

// Output:
// 1 2 3 6 5 4
// * 1 2 4 3
// * * 1 2

// Example Input/Output 2:
// Input:
// 8

// Output:
// 1 2 3 4 8 7 6 5
// * 1 2 3 6 5 4
// * * 1 2 4 3 
// * * * 1 2

import java.util.*;
public class Second_Half_Reverse_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),t=n+2;
        for(int i=0;i<n/2;i++)
        {
            t-=2;
            int r=t/2,y=t;
            if(i>0)
                for(int j=0;j<i;j++)
                    System.out.print("*"+" ");
            for(int j=1;j<=t;j++)
            {
                if(j<=r)
                    System.out.print(j+" ");
                else 
                {
                    System.out.print(y+" ");
                    y--;
                }
            }
            System.out.println();
        }
    }
}