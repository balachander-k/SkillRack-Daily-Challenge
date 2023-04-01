// The program must accept an integer N as the input. The program must replace all
// the odd digits by 1 in N. Then the program must replace all the even digits by O in N.
// Finally, the program must print the decimal equivalent of N as the output.

// Boundary Condition(s):
// O <= N <=10^18

// Input Format:
// The first line contains the value of N.

// Output Format:
// The first line contains the integer based on the given conditions.

// Example Input/Output I:
// Input:
// 5278

// Output:
// 10

// Explanation:
// After replacing all the odd digits by 1 in 2 8, the integer becomes 1218.
// After replacing all the even digits by 0 in 1 1 , the integer becomes 1010.
// The decimal equivalent of (1010)2 is 10.
// Hence the output is 10

// Example Input/Output 2:
// Input:
// 645796

// Output:
// 14


import java.util.*;
public class Integer_Binary_Decimal
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next(),val="";
        char[] b=a.toCharArray();
        for(int i=0;i<a.length();i++)
        {
            int d=Integer.parseInt(String.valueOf(b[i]));
            if(d%2==0)
                val=val+"0";
            if(d%2!=0)
                val=val+"1";
        }
        int decimal=Integer.parseInt(val,2);
        System.out.print(decimal);
    }
}