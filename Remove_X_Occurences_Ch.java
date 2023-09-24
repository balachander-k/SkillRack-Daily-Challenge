// The program must accept a string S, a character CH and an integer X as the input.
// The program must remove the first X occurrences of the character CH in the string
// S. Then the program must print the modified string S as the output. If all the
// characters are removed from the string S, the program must print -1 as the
// output.

// Note: The string S is case sensitive.

// Boundary Condition(s):
// 1 <= Length of S <= 1000
// 1 <= x <= 100

// Input Format:
// The first line contains S.
// The second line contains CH and X separated by a space.

// Output Format:
// The first line contains the modified string S or -1 as per the given condition(s).

// Example Input/Output 1:
// Input:
// Digitization
// i 3
// Output:
// Dgtzation

// Explanation:
// Here the string is Digitization.
// After removing the first 3 occurrences of i, the string becomes Dgtzation.
// Hence the output is Dgtzation

// Example Input/Output 2:
// Input:
// B2b5b4@ABC
// B 4

// Output:
// 2b5b4@AC

// Example Input/Output 3:
// Input:
// AAAA
// A 7
// Output:
// -1


import java.util.*;
public class Remove_X_Occurences_Ch 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        char ch=obj.next().charAt(0);
        int x=obj.nextInt(),count=0;
        String temp="";
        for(int i=0;i<s.length;i++)
        {
            if(s[i]!=ch)
                temp=temp+s[i];
            if(s[i]==ch)
            {
                count++;
                if(count>x)
                    temp=temp+s[i];
            }
        }
        System.out.print((temp.length()==0)?"-1":temp);
    }
}