// The program must accept an integer N as the input. The program must print the
// first N terms in the following series.
// 1, 5, 15, 34, 65, 111, 175, 260 and so on.

// Boundary Condition(s):
// 2 <= N < = 100

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the first N terms in the above mentioned series.

// Example Input/Output 1:
// Input:
// 3

// Output:
// 1 5 15

// Explanation:
// The first 3 terms in the above mentioned series are 1, 5 and 15.
// Hence the output is 1 5 15

// Example Input/Output 2:
// Input:
// 10

// Output:
// 1 5 15 34 65 111 175 260 369 505


import java.util.*;
public class First_N_Terms_Sum_Series
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),t=1;
        for(int i=1;i<=N;i++)
        {
            int series=0;
            for(int j=1;j<=i;j++)
                series+=(t++);
            System.out.print(series+" ");
        }
    }
}