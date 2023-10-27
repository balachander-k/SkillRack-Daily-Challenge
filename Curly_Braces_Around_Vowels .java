// The program must accept a string S as the input. For each substring containing
// only vowels in the string S, the program must enclose the substring by a pair of
// curly braces {l. Then the program must print the modified string S as the output.

// Boundary Condition(s):
// 1 <= Length of S <=100

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the modified string S.

// Example Input/Output 1:
// Input:
// bookreading

// Output:
// b{oo)kr{ea}d{i}ng

// Explanation:
// Here the string is bookreading.
// The substring containing only vowels in S are 00 ea and i. So they are enclosed by
// the pair of curly braces O.
// Hence the output is b{oo}kr{ea}d{i}ng

// Example Input/Output 2:
// Input:
// AelOu

// Output:
// {AelOu}

// Example Input/Output 3:
// Input:
// Apple

// Output:
// {A}ppl{e}

import java.util.*;
public class Curly_Braces_Around_Vowels 
{
    public static boolean isVowel(char c)
    {
        char ch=Character.toLowerCase(c);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            return true;
        return false;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] temp=obj.next().toCharArray();
        int count=0;
        for(int i=0;i<temp.length;i++)
        {
            if(isVowel(temp[i]))
            {
                count++;
                if(count==1)
                    System.out.print("{");
                System.out.print(temp[i]);
            }
            else 
            {
                if(count!=0)
                {
                    System.out.print("}");
                    count=0;
                }
                System.out.print(temp[i]);
            }
        }
        if(count!=0)System.out.print("}");
    }
}