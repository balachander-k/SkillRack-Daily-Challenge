// The program must accept an integer N as the input. The program must print YES
// if all the digits in N are in ascending order. Else the program must print NO as
// the output.

// Boundary Condition(s):
// 10 <= N <= 10^7

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains either YES or NO.

// Example Input/Output 1:
// Input:
// 2579

// Output:
// YES

// Explanation:
// In 2579 all the digits are in ascending order.
// So YES is printed as the output.

// Example Input/Output 2:
// Input :
// 52738

// Output:
// NO


import java.util.*;
public class Digits_In_Ascending_Order
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        int count=0;
        for(int i=0;i<s.length-1;i++)
        {
            int r=Integer.valueOf(s[i]);
            int t=Integer.valueOf(s[i+1]);
            if(t>r)
                count++;
        }
        System.out.print(count==s.length-1?"YES":"NO");
    }
}