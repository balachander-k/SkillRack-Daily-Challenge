// The program must accept a string S and print the string value in two lines in zig
// zag pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 2 <= Length of S <= 100

// Input Format:
// The first line contains the string S.

// Output Format:
// The first two lines contain the desired pattern as shown in the Example

// Input/Output section.
// Example Input/Output 1:
// Input:
// abcdefg

// Output:
// a*c*e*g
// *b*d*f*

// Example Input/Output 2:
// Input:
// blockchain

// Output:
// b*o*k*h*i*
// *l*c*c*a*n

import java.util.*;
public class Split_Two_Lines_String 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next();
        for(int i=0;i<a.length();i++)
            System.out.print((i%2==0)?a.charAt(i):"*");
        System.out.println();
        for(int i=0;i<a.length();i++)
            System.out.print((i%2!=0)?a.charAt(i):"*");
    }
}