// The program must accept N integers and an integer K as the input. The program
// must print the absolute difference between the number of integers greater than or
// equal to K and the number of integers less than K as the output.

// Boundary Condition(s):
// 1 <= N, K <=10^3
// 1 <= Each integer value <= 10^3

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.
// The third line contains K.

// Output Format:
// The first line contains the absolute difference.

// Example Input/Output 1:
// Input:
// 5
// 20 30 50 44 10
// 35

// Output:
// 1
// Explanation:
// There are two integers (44 and 50) which are greater than or equal to 35.
// There are three integers (20 30 and 10) which are less than 35.
// Here the absolute difference is |2 - 3|
// Hence the output is 1

// Example Input/Output 2:
// Input:
// 10
// 3 7 94 1 13 6 2 5 8
// 3

// Output:
// 6

import java.util.*;
public class Lesser_And_Greater_Absolute_Difference
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt(),lesser=0,greater=0;
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=obj.nextInt();
        int key=obj.nextInt();
        for(int i=0;i<size;i++)
        {
            if(arr[i]>=key)
                greater++;
            else 
                lesser++;
        }
        System.out.print(Math.abs(greater-lesser));
    }
}