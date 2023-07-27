// The program must accept an integer N as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 3 <= N <= 100

// Input Format:
// The first line contains N.

// Output Format:
// The first N lines contain the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 4

// Output:
// * * * * 
// - * 1 2 *
// - - * 3 4 *
// - - - * * * * 

// Example Input/Output 2:
// Input:
// 5

// Output:
// * * * * * 
// - * 1 2 3 *
// - - * 4 5 6 *
// - - - * 7 8 9 *
// - - - - * * * * * 

import java.util.*;
public class Parallelogram_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt(),temp=1;
        for(int i=1;i<=size;i++)
            System.out.print("*"+" ");
        System.out.println();
        for(int i=1;i<=size-1;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print("-"+" ");
            if(i!=size-1)
            {
                for(int j=1;j<=size;j++)
                {
                    if(j==1 || j==size)
                        System.out.print("*"+" ");
                    else 
                    {
                        System.out.print(temp+" ");
                        temp++;
                    }
                }
            }
            else 
            {
                for(int j=1;j<=size;j++)
                    System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}