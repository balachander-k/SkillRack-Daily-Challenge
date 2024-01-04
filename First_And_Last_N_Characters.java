// Given a string S and an integer N, print "yes" if the first N characters of the string
// are equal to the last N characters, otherwise print "no".

// Boundary Condition(s):
// 2 <= Length of S 100
// 1 <= N <=100

// Input Format:
// The first line contains S.
// The second line contains N.

// Output Format:
// The first line contains yes or no.

// Example Input/Output 1:
// Input:
// madoma
// 2

// Output:
// yes

// Example Input/Output 2:
// Input:
// abcdeaacb
// 3

// Output:
// no

import java.util.*;
public class First_And_Last_N_Characters
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        int x=obj.nextInt(),t=Math.abs(x-s.length);
        String f="",l="";
        for(int i=0;i<s.length;i++)
        {
            if(i<x)
                f=f+String.valueOf(s[i]);
            if(i>=t)
                l=l+String.valueOf(s[i]);
        }
        System.out.print(f.equals(l)?"yes":"no");
    }
}