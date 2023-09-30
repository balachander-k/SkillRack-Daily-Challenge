// The program must accept an integer N as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 1 <= N <=26

// Input Format:
// The first line contains N.

// Output Format:
// The first N lines contain the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 4

// Output:
// ab
// a
// abcd
// abc


// Example Input/Output 2:
// Input:
// 7

// Output:
// ab
// a
// abcd
// abc
// abcdef
// abcde
// abcdefgh

import java.util.*;
public class Alternate_Row_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt(),odd=2,even=1;
        for(int i=1;i<=size;i++)
        {
            String val="";
            if(i%2!=0)
            {
                char t='a';
                for(int j=1;j<=odd;j++)
                {
                    val=val+t;
                    t++;
                }
                odd=odd+2;
            }
            else 
            {
                char r='a';
                for(int j=1;j<=even;j++)
                {
                    val=val+r;
                    r++;
                }
                even=even+2;
            }
            System.out.println(val);
        }
    }
}