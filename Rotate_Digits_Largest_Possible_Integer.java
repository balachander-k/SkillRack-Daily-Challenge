// The program must accept an integer N as the input. The program must print the
// largest possible integer which is obtained by rotating the digits of N in the
// clockwise direction.

// Boundary Condition(s):
// 10 <= N <= 10^8

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the largest possible integer as per the given condition.

// Example Input/Output 1:
// Input:
// 2451

// Output:
// 5124

// Explanation:
// The largest possible integer 5124 is obtained by rotating the digits of 2451 for
// two times in the clockwise direction.
// So 5124 is printed as the output.

// Example Input/Output 2:
// Input:
// 151614

// Output:
// 614151


import java.util.*;
public class Rotate_Digits_Largest_Possible_Integer 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] N=obj.next().toCharArray();
        int large=Integer.MIN_VALUE;
        for(int i=0;i<N.length;i++)
        {
            char last=N[N.length-1];
            for(int j=N.length-1;j>0;j--)
                N[j]=N[j-1];
            N[0]=last;
            int num=Integer.valueOf(String.valueOf(N));
            if(num>large)
                large=num;
        }
        System.out.print(large);
    }
}