// The program must accept N integers and a string containing N-1 arithmetic
// (+, -, *, /) operators. The program must form an arithmetic expression E by
// interlacing the N integers and the N-1 operators. Then the program must evaluate
// the expression E from left to right and print the result R as the output.
// Note: When an integer is divided by another integer, the quotient will be taken for
// the evaluation.

// Boundary Condition(s):
// 2 <= N <= 100
// 1 <= Each integer value <= 10^5

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.
// The third line contains N-1 arithmetic operators.

// Output Format:
// The first line contains the result R.

// Example Input/Output 1:
// Input:
// 4
// 2 5 6 7
// +-+

// Output:
// 8

// Explanation:
// The expression E is formed as 2 + 5 - 6 + 7.
// The result of the above expression is 8, so 8 is printed as the output.
// Example Input/Output 2:

// Input:
// 7
// 10 58 15 68 10 3

// Output:
// 16

// Explanation:
// The expression E is formed as 10 + 5 + 15 / 68 * 10/3.
// The result of the above expression is 16, so 16 is printed as the output.


import java.util.*;
public class Integers_&_Operators
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),q=0,cal=0;
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
            arr[i]=obj.nextInt();
        char[] s=obj.next().toCharArray();
        for(int i=0;i<N-1;i++)
        {
            if(s[q]=='+')
                cal=arr[i]+arr[i+1];
            else if(s[q]=='-')
                cal=arr[i]-arr[i+1];
            else if(s[q]=='*')
                cal=arr[i]*arr[i+1];
            else
                cal=arr[i]/arr[i+1];
            q++;
            arr[i+1]=cal;
        }
        System.out.print(cal);
    }
}