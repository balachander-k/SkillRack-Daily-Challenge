// The program must accept a string S as the input. For each vowel CH in the string S
// (from left to right), the program must remove the next character of CH from the
// string S. Then the program must print the modified string as the output.

// Boundary Condition(s):
// 1 <= Length of S <= 1000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the modified string S.

// Example Input/Output 1:
// Input:
// skillrack

// Output:
// skilrak

// Explanation:
// Here the string is skillrack
// The first vowel in skillrack is i. The next character of i is I, so I is removed from the
// string skillrack. Now the string becomes skilrack.
// The second vowel in skillrack is a. The next character of a is c, so c is removed
// from the string skilrack. Now the string becomes skilrak.
// Finally, the modified string skilrak is printed as the output.

// Example Input/Output 2:
// Input:
// Aerospace

// Output:
// Aropae

// Example Input/Output 3:
// Input:
// Ael#oU123

// Output:
// Ai0123


import java.util.*;
public class Remove_After_Each_Vowel 
{
    public static boolean isVowel(char c)
    {
        char ch=Character.toLowerCase(c);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            return true;
        return false;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] temp=obj.next().toCharArray();
        for(int i=0;i<temp.length;i++)
            if(isVowel(temp[i]))
                if(i+1<temp.length)
                    temp[i+1]='/';
        for(int i=0;i<temp.length;i++)
            if(temp[i]!='/')
                System.out.print(temp[i]);
    }
}