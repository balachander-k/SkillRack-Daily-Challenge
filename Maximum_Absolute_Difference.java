// The program must accept N distinct integers as the input. The program must print
// the maximum possible absolute difference between two consecutive integers in
// the given N integers as the output.

// Boundary Condition(s):
// 2 <= N <= 1000
// 1 <= Each integer value <= 10^8

// Input Format:
// The first line contains N.
// The second line contains N distinct integers separated by a space.

// Output Format:
// The first line contains the maximum absolute difference between the consecutive
// two integers.

// Example Input/Output 1:
// Input:
// 5
// 1 4 7 2 6

// Output:
// 5

// Explanation:
// The given 5 integers are 1, 4, 7, 2, and 6.
// The absolute difference between 1 and 4 is 3.
// The absolute difference between 4 and 7 is 3.
// The absolute difference between 7 and 2 is 5.
// The absolute difference between 2 and 6 is 4.
// Here the maximum absolute difference is 5.
// Hence the output is 5

// Example Input/Output 2:
// Input:
// 4
// 10 2 3 11

// Output:
// 8


import java.util.*;
public class Maximum_Absolute_Difference
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),max=Integer.MIN_VALUE;
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
            arr[i]=obj.nextInt();
        for(int i=0;i<N-1;i++)
        {
            int diff=(int)Math.abs(arr[i]-arr[i+1]);
            if(diff>max)
                max=diff;
        }
        System.out.print(max);
    }
}