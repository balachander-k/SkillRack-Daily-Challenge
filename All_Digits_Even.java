// The program must accept an integer N as the input. The program must print YES
// if all the digits in N are even. Else the program must print the NO as the output

// Boundary Condition(s):
// 1 <= N <= IO^8

// Input Format:
// The first line contains the integer N.

// Output Format:
// The first line contains either YES or NO.

// Example Input/Output 1:
// Input:
// 2468

// Output:
// YES

// Explanation:
// All the digits in 2468 are even. So YES is printed.

// Example Input/Output 2:
// Input:
// 277778

// Output:
// NO


import java.util.*;
public class All_Digits_Even
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        long a=obj.nextLong(),count=0,rev=0;
        String b=String.valueOf(a);
        while(a!=0)
        {
            rev=a%10;
            if(rev%2==0)
                count++;
            a=a/10;
        }
        System.out.print((b.length()==count)?"YES":"NO");
    }
}