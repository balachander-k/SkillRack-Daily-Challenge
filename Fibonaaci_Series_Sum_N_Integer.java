// The program must accept N integers as the input. The program must find the integers
// which are present in the Fibonacci series. Then the program must print the sum of those
// integers as the output. If there is no Fibonacci integer, the program must print -1 as the
// output.

// Boundary Condition(s):
// 2 <= N <= 100
// 0 <= Each integer value <= 10^8

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains the sum of integers which are present in the Fibonacci series or -1.

// Example Input/Output 1:
// Input:
// 5
// 4 13 5 23 2

// Output:
// 20

// Explanation:
// The given 5 integers are 4, 13, 5, 23 and 2.
// The integers which are present in the Fibonacci series are 13, 5 and 2.
// So the sum of those integers is 20 (13 + 5 + 2 = 20).
// Hence the output is 20

// Example Input/Output 2:
// Input
// 3
// 22 10 15

// Output:
// -1


import java.util.*;
public class Fibonaaci_Series_Sum_N_Integer
{
    public static boolean isFib(int v)
    {
        int f1=0,f2=1,count=0;
        while(f1<=v)
        {
            if(f1==v)
                count++;
            int temp=f1+f2;
            f1=f2;
            f2=temp;
        }
        if(count!=0)
            return true;
        else 
            return false;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),count=0,sum=0;
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
        {
            int temp=obj.nextInt();
            if(isFib(temp))
            {
                sum+=temp;
                count++;
            }
        }
        System.out.print((count==0)?"-1":sum);
    }
}