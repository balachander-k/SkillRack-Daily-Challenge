// The program must accept two successive integers M and N from the fibonacci
// series as the input. The program must print the fibonacci series up to the integer N
// in reverse order as the output.

// Boundary Condition(s):
// 0 <= M <= N <=10^16

// Input Format:
// The first line contains M and N separated by a space.

// Output Format:
// The first line contains the integer values representing the fibonacci series.

// Example Input/Output 1:
// Input:
// 8 13
// Output:
// 13 8 5 3 2 1 1 0

// Explanation:
// Here the value of M and N is 8 and 13 respectively.
// The fibonacci series is 0, 1, 1, 2, 3, 5, 8 and 13. So it is printed in the reverse order.
// Hence the output is 13 8 5 3 2 1 1 0

// Example Input/Output 2:
// Input:
// 21 34

// Output:
// 34 21 13 8 5 3 2 1 1 0

import java.util.*;
public class Fibonacci_Series_Two_Successive_Integers 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        long m=obj.nextLong(),n=obj.nextLong(),f=0,k=1,r=0;
        ArrayList<Long> list=new ArrayList<Long>();
        list.add(0L);list.add(1L);
        while(r!=n)
        {
            r=f+k;
            list.add(r);
            f=k;
            k=r;
        }
        for(int i=list.size()-1;i>=0;i--)
            System.out.print(list.get(i)+" ");
    }
}