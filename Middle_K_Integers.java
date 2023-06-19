// The program must accept N integers and an integer K as the input. The program
// must print middle K integers in the reverse order in the N integers as the output.
// Note: Both the integers N and K are odd or both the integers are even.

// Boundary Condition(s):
// 1 <= N <= 10^5

// Input Format:
// The first line contains the two integers N and K separated by a space.
// The second line contains N integers separated by space(s).

// Output Format:
// The first line contains middle K integers in the reverse order.

// Example Input/Output 1:
// Input:
// 13 5
// 20 10 30 40 5 15 50 25 35 130 110 120 45

// Output:
// 35 25 50 15 5

// Explanation:
// The middle 5 integers are 5, 15, 50, 25 and 35.
// In the reverse order, the values are 35, 25, 50, 15, 5.
// Hence the output is 35 25 50 15 5

// Example Input/Output 2:
// Input:
// 1 04
// 89 12 15 50 65 13 52 28 15 80

// Output:
// 52 13 65 50

import java.util.*;
public class Middle_K_Integers
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt(),key=obj.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=obj.nextInt();
        int len=(size+key)/2;
        for(int i=len-1;i>=0;i--)
        {
            if(count!=b)
            {
                System.out.print(arr[i]+" ");
                count++;
            }
        }
    }
}