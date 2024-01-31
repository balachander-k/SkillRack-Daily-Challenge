// The program must accept an integer N as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 1 <= N <= 20

// Input Format:
// The first line contains N.

// Output Format:
// The first N lines containing the desired pattern as shown in the Example

// Input/Output section.
// Example Input/Output 1:
// Input:
// 5

// Output:
// 1+2+3+4+5=15
// 1*2*3*4=24
// 1+2+3=6
// 1*2=2
// 1=1

// Example Input/Output 2:
// Input:
// 8

// Output:
// 1+2+3+4+5+6+7+8=36
// 1*2*3*4*5*6*7=5040
// 1+2+3+4+5+6=21
// 1*2*3*4*5=120
// 1+2+3+4=10
// 1*2*3=6
// 1+2=3
// 1=1

import java.util.*;
public class Addition_Multiplication_Alternate_Pattern 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        long N=obj.nextLong(),t=N;
        for(long i=1;i<=N;i++)
        {
            long sum=0,mul=1;
            for(long j=1;j<=t;j++)
            {
                if(i%2!=0)
                {
                    sum+=j;
                    System.out.print((j!=t)?(j+"+"):(j+"="));
                }
                else 
                {
                    mul*=j;
                     System.out.print((j!=t)?(j+"*"):(j+"="));
                }
            }
            if(i%2!=0)System.out.println(sum);
            if(i%2==0)System.out.println(mul);
            t--;
        }
    }
}