// The program must accept N integers and an integer K as the input. The program
// must find the maximum integer among N integers as X. Then the program must
// print X if the value of all other integer values when multiplied by K is less than or
// equal to X. Else the program must print -1 as the output.

// Boundary Condition(s):
// 2 <= N <= 1O^5
// 1 <= K <= 100

// Input Format:
// The first line contains the two integers N and K separated by a space.
// The second line contains N integers separated by space(s).

// Output Format:
// The first line contains either the maximum integer or -1.

// Example Input/Output 1:
// Input:
// 5 3
// 4 1 0 12 3

// Output:
// 12

// Explanation:
// The maximum integer is 12.
// All the other integers when multiplied by 3 are 12, 3, 0 and 9.
// Here all other integers are less than or equal to 12.
// Hence the output is 12

// Example Input/Output 2:
// Input:
// 6 5
// 10 20 5 4 80 2

// Output:
// -1

import java.util.*;
public class Maximum_Integer
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt(),key=obj.nextInt();
        int max=Integer.MIN_VALUE,count=0;
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=obj.nextInt();
            if(max<arr[i])
                max=arr[i];
        }
        for(int i=0;i<size;i++)
        {
            int temp=arr[i]*key;
            if(arr[i]!=max)
            {
                if(temp>max)
                    count++;
            }
        }
        System.out.print((count==0)?max:"-1");
    }
}