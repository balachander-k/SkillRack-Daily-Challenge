// The program must accept an integer N as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 5 <= N <= 100
// Input Format:
// The first line contains N.
// Output Format:
// The first N lines containing the desired pattern as shown in the Example


// Example Input/Output 1:
// Input:
// 7

// Output:
// & & & & & & & 
// & * * * * * &
// & . . . . . &
// & . . . . . &
// & . . . . . &
// & * * * * * &  
// & & & & & & &

// Example Input/Output 2:
// Input:
// 8

// Output:
// & & & & & & & & 
// & * * * * * * &
// & . . . . . . &
// & . . . . . . &
// & . . . . . . &
// & . . . . . . &
// & * * * * * * &  
// & & & & & & & &


import java.util.*;
public class Box_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=N;j++)
            {
                if(i==1 || j==1 || i==N || j==N)
                    System.out.print("&"+" ");
                else if(j==2 || i==2 || j==N-1 || i==N-1)
                    System.out.print("*"+" ");
                else 
                    System.out.print("."+" ");
            }
            System.out.println();
        }
    }
}