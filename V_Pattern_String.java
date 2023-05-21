// The program must accept a string S as the input. The program must print the desired
// pattern as shown in the Example Input/Output section.

// Note: The length Of S is always Odd.

// Boundary Condition(s):
// 1 <= Length of S <= 100

// Input Format:
// The first line contains the string S.
// Output Format:
// The list of lines containing the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// apple

// Output:
// apple
// *ppl*
// **p**

// Example Input/Output 2:
// Input:
// program

// Output:
// program
// *rogra*
// **ogr**
// ***g***


import java.util.*;
public class V_Pattern_String
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        int mid=a.length()/2,first=1,last=a.length()-2;
        char[] b=a.toCharArray();
        System.out.println(a);
        for(int i=1;i<=mid;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print("*");
            for(int k=first;k<=last;k++)
                System.out.print(b[k]);
            for(int j=1;j<=i;j++)
                System.out.print("*");
            first++;
            last--;
            System.out.println();
        }
    }
}