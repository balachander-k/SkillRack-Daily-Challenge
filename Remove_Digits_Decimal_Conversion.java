// The program must accept N integers as the input. For each integer X among the N
// integers, the program must remove all the digits in X except Os and Is. If the
// integer X does not have any 0s and Is then remove that integer X completely.
// Then the program must form a binary representation B by concatenating the
// modified integers. Finally, the program must print the decimal value of B as the
// output. If it is not possible to form the binary representation B (i.e., if all N integers
// do not have 0s and Is), the program must print -1 as the output.

// Boundary Condition(s):
// 1 <= Each integer value <= 10^8

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains the decimal value of B.

// Example Input/Output 1:
// Input:
// 4
// 61807 1811 500 48101

// Output:
// 373

// Explanation:
// After removing all the digits except 0s and Is in 61807, the integer becomes 10.
// After removing all the digits except 0s and Is in 1811, the integer becomes 111.
// After removing all the digits except 0s and Is in 500, the integer becomes O.
// After removing all the digits except 0s and Is in 48101, the integer becomes 101.
// Now the binary representation B is 101110101.
// The decimal value of 101110101 is 373.
// Hence the output is 373

// Example Input/Output 2:
// Input:
// 2
// 4005001 80102010

// Output:
// 50

// Example Input/Output 3:
// Input:
// 4
// 65498 2786 4987 657

// Output:
// -1


import java.util.*;
public class Remove_Digits_Decimal_Conversion
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),t=0,w=0;
        String c="",r="";
        for(int i=1;i<=n;i++)
        {
            char[] v=obj.next().toCharArray();
            for(int j=0;j<v.length;j++)
                if(v[j]=='0'||v[j]=='1')
                    c=c+v[j];
            if(!c.equals(""))
            {
                t=Integer.parseInt(c);
                w++;
            }
            c="";
            r=r+t;
        }
        String q=String.valueOf(r);
        if(w!=0)
            System.out.print(Integer.parseInt(q,2));
        else 
            System.out.print("-1");
    }
}