// The program must accept an integer N as the input. The program must print the
// sum of each digit to the power of number of digits in N as the output.

// Boundary Condition(s):
// 1 <= N <=10^8

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the sum of each digit to the power of number of digits in N.

// Example Input/Output 1:
// Input:
// 154

// Output:
// 190

// Explanation:
// The number of digits in 154 is 3.
// (1*1*1) + (5*5*5)+(4*4*4)
// Hence the output is 190

// Example Input/Output 2:
// Input:
// 6047

// Output:
// 3953


import java.util.*;
public class Sum_Power_Of_Number_Of_Digits
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String N=obj.next();
        int sum=0;
        for(int i=0;i<N.length();i++)
        {
            int num=Integer.valueOf(N.charAt(i)-48),val=1;
            for(int j=0;j<N.length();j++)
                val*=num;
            sum+=val;
        }
        System.out.print(sum);
    }
}