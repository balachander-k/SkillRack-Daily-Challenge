// The program must accept an integer N representing a power of 2 as the input. The
// program must print the expression E which represents the product of 2s for the
// given integer N as the output.

// Boundary Condition(s):
// 2 <= N <=10^4

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the expression E.

// Example Input/Output 1:
// Input:
// 8

// Output:
// 2*2*2
// Explanation:
// Here 8 = 2^3.
// Hence the output is 2*2*2

// Example Input/Output 2:
// Input:
// 512

// Output:
// 2*2*2*2*2*2*2*2*2

import java.util.*;
public class Power_Of_2_Expression
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),temp=2;
        while(true)
        {
            if(temp<=n)
                System.out.print(2);
            if(temp!=n)
                System.out.print("*");
            else 
                break;
            temp=temp*2;
        }
    }
}