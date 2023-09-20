// The program must accept an integer N as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 1 <= N <= 50

// Input Format:
// The first line contains N.

// Output Format:
// The lines contain the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 4

// Output:
// 1 2 3 4
// 1 2 2 3 4
// 1 2 3 3 3 4
// 1 2 3 4 4 4 4

// Example Input/Output 2:
// Input:
// 5

// Output:
// 1 2 3 4 5
// 1 2 2 3 4 5
// 1 2 3 3 3 4 5
// 1 2 3 4 4 4 4 5
// 1 2 3 4 5 5 5 5 5 

import java.util.*;
public class Repeated_Integer_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int val=obj.nextInt();
        for(int i=1;i<=val;i++)
        {
            for(int j=1;j<=val;j++)
            {
                if(j>1 && i==j)
                    for(int k=1;k<=j;k++)
                        System.out.print(j+" ");
                else 
                    System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}