// The program must accept an integer array of size N as the input. The program
// must print YES if it is possible to split the array into two sides so that the sum of
// the integers on one side is equal to the sum of the integers on the other side. Else
// the program must print NO as the output.

// Boundary Condition(s):
// 2 <= N <= 100
// 1 <= Each integer value <= 10^5

// Input Format:
// The first line contains the value of N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains either YES or NO.

// Example Input/Output 1:
// Input:
// 5
// 5 4 7 1 1

// Output:
// YES

// Explanation:
// The array can be split as "5 4" and "7 1 1".
// The sum of the integers on one side is 9 (5 + 4).
// The sum of the integers on the other side is 9 (7 + 1 + 1).
// Here the sum of the integers on one side is equal to the sum of the integers on
// the other side.
// Hence the output is YES

// Example Input/Output 2:
// Input:
// 6
// 2 6 8 3 4 1

// Output:
// NO


import java.util.*;
public class Split_Array_Equal_Sum 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt(),t=0;
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=obj.nextInt();
        for(int i=0;i<size;i++)
        {
            int s1=0,s2=0;
            for(int j=0;j<=i;j++)
                s1=s1+arr[j];
            for(int k=i+1;k<size;k++)
                s2=s2+arr[k];
            if(s1==s2)
            {
                System.out.print("YES");
                t=1;
                break;
            }
        }
        if(t==0)System.out.print("NO");
    }
}