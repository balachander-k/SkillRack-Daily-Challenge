// The program must accept two integers A and B having same number of digits as the input. The program must add the digits of A and B at same positions without any carry over. Then the program must print the sum as the output.

// Boundary Condition(s);
// 1<= A,B <=10^8

// Input Format:
// The first line contains the values of A and B separated by a space.

// Output Format:
// The first line contains the value of sum based on the given conditions.

// Example Input/Output 1:
// Input:
// 123 219

// Output:
// 332

// Explanation:
// The digits 3 and 9 are added to get 12.
// But add without carry not forwarded to the digit so only 2 is printed.
// The remaining two digits are added as 2+1 = 3 and 1+2=3.
// Hence 332 is printed.

// Example Input/Output 2:
// Input:
// 999 999

// Output:
// 888

import java.util.*;
public class Sum_Without_Carry
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=obj.nextInt();
        String c=String.valueOf(a);
        String val="";
        int len=c.length(),count=0,rev1=0,rev2=0,carry=0,sum=0;
        while(count!=len)
        {
            rev1=a%10;
            rev2=b%10;
            sum=rev1+rev2;
            carry=sum%10;
            val=String.valueOf(carry)+val;
            a=a/10;
            b=b/10;
            count++;
            sum=0;
        }
        int d=Integer.parseInt(val);
        System.out.print(d);
    }
}