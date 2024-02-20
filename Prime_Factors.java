// The program must accept an integer N as the input. The program must print the
// prime factors of N in ascending order as the output.

// Boundary Condition(s):
// 10 <= N <= 10^5

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the prime factors of N in ascending order.

// Example Input/Output 1:
// Input:
// 100

// Output:
// 2 5

// Explanation:
// The factors of 100 are 1, 2, 4, 5, 10, 20, 25, 50 and 100.
// The prime factors of 100 are 2 and 5.
// So 2 and 5 are printed as the output.

// Example Input/Output 2:
// Input:
// 150

// Output:
// 235


import java.util.*;
public class Prime_Factors
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        for(int i=2;i<=N;i++)
        {
            if(N%i==0)
            {
                boolean flag=false;
                for(int j=2;j<=i/2;j++)
                {
                    if(i%j==0)
                    {
                        flag=true;
                        break;
                    }
                }
                if(!flag)System.out.print(i+" ");
            }
        }
    }
}