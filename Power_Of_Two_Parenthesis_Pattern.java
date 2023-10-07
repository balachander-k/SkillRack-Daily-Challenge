// The program must accept an integer N as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.
// Boundary condition(s):
// 2<= N <= 15
// Input Format:
// The first line contains N.
// Output Format:
// The lines containing the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 2

// Output:
// (())
// ()()

// Example Input/Output 2:
// Input:
// 3

// Output:
// (((())))
// (())(())
// ()()()()


// Example Input/Output 3:
// Input:
// 4

// Output:
// (((((((())))))))
// (((())))(((())))
// (())(())(())(())
// ()()()()()()()()

import java.util.*;
public class Power_Of_Two_Parenthesis_Pattern
{
    public static void Parenthesis(long x)
    {
        long temp=x/2;
        for(long i=1;i<=x;i++)
            System.out.print((i<=temp)?"(":")");
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        long n=obj.nextLong(),pow=(long)Math.pow(2,n);
        for(long i=0;i<n;i++)
        {
            long t=(int)Math.pow(2,i);
            for(long j=1;j<=t;j++)
                Parenthesis(pow);
            pow=pow/2;
            System.out.println();
        }
    }
}