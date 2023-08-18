// The program must accept an integer N as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Conditions:
// 1<= N <=30

// Input Format:
// The first line contains the value of N.

// Output Format:
// The first N lines containing the desired pattern as shown in the Example

// Input/Output section.
// Example Input/Output 1:
// Input:
// 5

// Output:
// 0 1
// 0 1 1
// 0 1 1 2 
// 0 1 1 2 3
// 0 1 1 2 3 5

// Example Input/Output 2:
// Input:
// 3

// Output:
// 0 1
// 0 1 1
// 0 1 1 2

import java.util.*;
public class Fibonacci_Pattern_Number 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        for(int i=1;i<=num;i++)
        {
            int t1=0,t2=1,sum=0;
            for(int j=0;j<=i;j++)
            {
                System.out.print(sum+" ");
                t1=t2;
                t2=sum;
                sum=t1+t2;
            }
            System.out.println();
        }
    }
}