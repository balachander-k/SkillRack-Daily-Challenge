// The program must accept N integers as the input. For each integer X among the N integers,
// the program must print the output based on the following conditions.
// - The program must print the sum of the integers ending with the first digit of X on the left
// side of X. Then the program must print the sum of the integers ending with the unit digit of
// X on the right side of X.
// - If there are no such integers on the left side or the right side of X, the program must print
// O as the sum.

// Boundary Condition(s):
// 2 <= N <= 100
// 1 <= Each integer value <= 10^7

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first N lines, each contains two integers separated by a space.

// Example Input/Output 1:
// Input:
// 4
// 12 24 42 22

// Output:
// 0 64
// 120
// 24 22
// 54 0


// Explanation:
// The first integer is 12.
// There are no integers on the left side of 12, so O is printed.
// The sum of integers ending with the unit digit of 12 on the right side of 12 is 64 (42 + 22).
// The second integer is 24.
// The sum of integers ending with the first digit of 24 on the left side of 24 is 12.
// There are no integers ending with the unit of 24 on the right side of 24, so O is printed.
// The third integer is 42.
// The sum of integers ending with the first digit of 42 on the left side of 42 is 24.
// The sum of integers ending with the unit digit of 42 on the right side of 42 is 22.
// The fourth integer is 22.
// The sum of integers ending with the first digit of 22 on the left side of 22 is 54 (12 + 42).
// There are no integers on the right side of 22, so O is printed.

// Example Input/Output 2:
// Input:
// 6
// 646 666 673 633 643 711

// Output:
// 0 666
// 646 0
// 1312 1276
// 1312 643
// 1312 0
// 0 0


import java.util.*;
public class Sum_First_And_Unit_Digit
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        String[] arr=new String[N];
        for(int i=0;i<N;i++)
            arr[i]=obj.next();
        for(int i=0;i<N;i++)
        {
            String temp=arr[i];
            int left=0,right=0;
            int fx=Integer.valueOf(arr[i].charAt(0)-'0'),lx=Integer.valueOf(arr[i].charAt(arr[i].length()-1)-'0');
            if(i>0)
            {
                for(int j=i-1;j>=0;j--)
                {
                    int l=Integer.valueOf(arr[j].charAt(arr[j].length()-1)-'0');
                    if(l==fx)left+=Integer.valueOf(arr[j]);
                }
            }
            if(i!=N-1)
            {
                for(int j=i+1;j<N;j++)
                {
                    int r=Integer.valueOf(arr[j].charAt(arr[j].length()-1)-'0');
                    if(lx==r)right+=Integer.valueOf(arr[j]);
                }
            }
            System.out.println(left+" "+right);
        }
    }
}