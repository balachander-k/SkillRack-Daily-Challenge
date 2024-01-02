// The program must accept N integers and an integer K as the input. The program
// must print the sum of every K consecutive integers as the ouput.
// Press Esc to exit

// Boundary Condition(s):
// 3 <= N <= 10^5
// -100 Each integer value < = 100
// 2 <= K <= 10

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.
// The third line contains K.

// Output Format:
// The first line contains the sum of every K consecutive integers separated by a space.

// Example Input/Output 1:
// Input:
// 7
// 10 20 5 2 -5 66 -69
// 3

// Output:
// 35 27 2 63 -8

// Explanation:
// Here K = 3.
// The sum of every 3 integers among the 7 integers is given below.
// (10 + 20 + 5), (20 + 5 + 2), (5 + 2 + (-5)), (2 + (-5) + 66), + 66 + (-69))
// 35, 27, 2, 63, -8

// Example Input/Output 2:
// Input:
// 10
// 3 7 9 4 1 13 6 2 5 8
// 4

// Output:
// 23 21 27 24 22 26 21


import java.util.*;
public class Sum_K_Consecutive_Integers
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=obj.nextInt();
        int k=obj.nextInt();
        for(int i=0;i<=n-k;i++)
        {
            int c=0,q=i,sum=0;
            while(c!=k)
            {
                sum=sum+arr[q];
                q++;
                c++;
            }
            System.out.print(sum+" ");
        }
    }
}