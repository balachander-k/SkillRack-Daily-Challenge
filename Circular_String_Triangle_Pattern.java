// The program must accept an integer N and a string S as the input. The program
// must print the pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 1 <= N, Length of S <= 100

// Input Format:
// The first line contains N and S separated by a space.

// Output Format:
// The first N lines contain the pattern as shown in the Example Input/Output section.

// Example Input/Output 1:
// Input:
// 5 ABCDE

// Output:
// A
// BC
// DEA
// BCDE
// ABCDE

// Example Input/Output 2:
// Input:
// 6 @#rU

// Output:
// @
// #r
// U@#
// rU@#
// rU@#r
// U@#rU


import java.util.*;
public class Circular_String_Triangle_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int value=obj.nextInt();
        String order=obj.next();
        char[] c=order.toCharArray();
        int k=0;
        for(int i=1;i<=value;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(k>=order.length())
                    k=0;
                System.out.print(c[k]);
                k++;
            }
            System.out.println();
        }
    }
}