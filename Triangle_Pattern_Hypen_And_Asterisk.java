// The program must accept an integer N as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 1 <= N <=100

// Input Format:
// The first line contains the value of N.

// Output Format:
// The first N lines containing the desired pattern as shown in the Example

// Input/Output section.
// Example Input/Output 1:
// Input:
// 4

// Output:
// ---**---
// --****--
// -******-
// ********

// Example Input/Output 2:
// Input:
// 7

// Output:
// ------**------
// -----****-----
// ----******----
// ---********---
// --**********--
// -************-
// *************


import java.util.*;
public class Triangle_Pattern_Hypen_And_Asterisk
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),temp=a-1,star=2;
        for(int i=0;i<a;i++)
        {
            star=star+2;
            for(int j=temp;j>=1;j--)
                System.out.print("-");
            for(int k=0;k<star;k++)
                System.out.print("*");
            for(int j=temp;j>=1;j--)
                System.out.print("-");
            temp--;
            System.out.println();
        }
    }
}