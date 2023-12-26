// The program must accept a string S as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Note: The length of S is always odd.

// Boundary Condition(s):
// 3 <= Length of S <= 99

// Input Format:
// The first line contains S.

// Output Format:
// The lines containing the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// skill

// Output:
// **i**
// *k*l*
// s***l

// Example Input/Output 2:
// Input:
// TELEPHONE

// Output:
// ****P****
// ***E*H***
// **L***O**
// *E*****N*
// T*******E


import java.util.*;
public class Inverted_V_Pattern_String 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        int mid=s.length/2;
        for(int i=0;i<s.length;i++)
            System.out.print((i==mid)?s[mid]:"*");
        System.out.println();
        for(int i=1;i<=mid;i++)
        {
            for(int j=0;j<s.length;j++)
            {
                if(j==mid-i || j==mid+i)
                    System.out.print(s[j]);
                else 
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}