// The program must accept an integer N as the input. The program must replace each odd
// digit in N with 1 and each even digit in N with O. The modified value of N representing a
// binary representation. The program must print the decimal equivalent of the modified value
// of N as the output.

// Boundary Condition(s):
// 1 <= N <= 10^18

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains an integer representing the decimal equivalent of the modified value
// of N.

// Example Input/Output 1:
// Input:
// 84536

// Output:
// 6

// Explanation:
// Here N = 84536.
// After replacing each odd digit in 84536 with 1, the integer becomes 84116.
// After replacing each even digit in 84116 with O, the integer becomes 00110.
// Now the decimal equivalent of 00110 is 6.
// So 6 is printed as the output.

// Example Input/Output 2:
// Input:
// 541532

// Output:
// 46


import java.util.*;
public class Digits_To_Bits
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] n=obj.next().toCharArray();
        for(int i=0;i<n.length;i++)
        {
            if(Integer.valueOf(n[i])%2==0)n[i]='0';
            else n[i]='1';
        }
        System.out.print(Integer.valueOf(String.valueOf(n),2));
    }
}