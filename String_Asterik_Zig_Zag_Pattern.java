// The program must accept a string S as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 2 <= Length of S <= 100

// Input Format:
// The first line contains S.

// Output Format:
// The lines contain the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// abcde

// Output:
// abcde
// abcd*
// *bcde
// abc**
// **cde
// ab***
// ***de
// a****
// ****e
// *****
// *****

// Example Input/Output 2:
// Input:
// How
// Output:
// How
// Ho*
// *ow
// H**
// **w
// ***
// ***

import java.util.*;
public class String_Asterik_Zig_Zag_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        int q=0,t=s.length-1;
        System.out.println(String.valueOf(s));
        for(int i=0;i<s.length*2;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<s.length;j++)
                    System.out.print((j>=t)?"*":s[j]);
                System.out.println();
                t--;
            }
            else 
            {
                for(int j=0;j<s.length;j++)
                    System.out.print((j<=q)?"*":s[j]);
                System.out.println();
                q++;
            }
        }
    }
}