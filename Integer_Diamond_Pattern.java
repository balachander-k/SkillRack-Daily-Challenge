// The program must accept an integer N as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 3 <= N <= 50

// Input Format:
// The first line contains N.

// Output Format:
// The lines containing the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 4

// Output:
// * * * 1 * * * 
// * * 2 1 2 * * 
// * 3 2 1 2 3 *
// 4 3 2 1 2 3 4 
// * 3 2 1 2 3 *
// * * 2 1 2 * * 
// * * * 1 * * * 

// Example Inpupt/Output 2:
// Input: 
// 5 

// Output:
// * * * * 1 * * * * 
// * * * 2 1 2 * * * 
// * * 3 2 1 2 3 * * 
// * 4 3 2 1 2 3 4 *
// 5 4 3 2 1 2 3 4 5
// * 4 3 2 1 2 3 4 *
// * * 3 2 1 2 3 * * 
// * * * 2 1 2 * * * 
// * * * * 1 * * * * 


import java.util.*;
public class Integer_Diamond_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        for(int i=1;i<=N;i++)
        {
            for(int j=N-i;j>=1;j--)
                System.out.print("*"+" ");
            for(int j=i;j>=1;j--)
                System.out.print(j+" ");
            for(int j=2;j<=i;j++)
                System.out.print(j+" ");
            for(int j=N-i;j>=1;j--)
                System.out.print("*"+" ");
            System.out.println();
        }
        for(int i=1;i<=N-1;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print("*"+" ");
            for(int j=N-i;j>=1;j--)
                System.out.print(j+" ");
            for(int j=2;j<=N-i;j++)
                System.out.print(j+" ");
            for(int j=1;j<=i;j++)
                System.out.print("*"+" ");
            System.out.println();
        }
    }
}