// The program must accept an integer N and a string S containing only alphabets as
// the input. The program must print the desired pattern as shown in the Example
// Input/Output section.

// Boundary Condition(s):
// 1 <= N <= Length of S < = 100

// Input Format:
// The first line contains N.
// The second line contains S.

// Output Format:
// The lines containing the desired pattern as shown in the Example Input/Output
// section.
// Example Input/Output 1:
// Input:
// 3
// SkillRack

// Output:
// Sk*ll*ac*
// S**l**a**
// *********

// Example Input/Output 2:
// Input:
// 5
// keyboard

// Output:
// keyb*ard
// key**ard
// ke***ar*
// k****a**
// ********


import java.util.*;
public class String_Replace_By_Asterisks_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),t=N;
        char[] s=obj.next().toCharArray();
        for(int i=0;i<N;i++)
        {
            int c=1;
            for(int j=0;j<s.length;j++)
            {
                if(Character.isAlphabetic(s[j]))
                {
                    if(c==t)
                    {
                        s[j]='*';
                        c=0;
                    }
                    c++;
                }
            }
            t--;
            System.out.println(String.valueOf(s));
        }
    }
}