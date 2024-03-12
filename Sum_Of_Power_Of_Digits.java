// The program must accept an integer N as the input. The program must print the
// sum of each digit raised to the power of the number of digits in N as the output.

// Boundary Condition(s):
// 1 <= N <= 10^8

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the sum of each digit raised to the power of the number of
// digits in N.

// Example Input/Output 1:
// Input:
// 2356

// Output:
// 2018

// Explanation:
// The number of digits in 2356 is 4.
// (2^4+3^4+5^4+6^4) = (16 + 81 + 625 + 1296) = 2018
// Hence the output is 2018

// Example Input/Output 2:
// Input:
// 78100

// Output:
// 49576


import java.util.*;
public class Sum_Of_Power_Of_Digits
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        int sum=0,len=s.length;
        for(int i=0;i<s.length;i++)
            sum+=(int)Math.pow(Integer.valueOf(s[i]-'0'),len);
        System.out.print(sum);
    }
}