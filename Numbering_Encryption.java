// The program must accept a string S containing only lower case alphabets as the
// input The program must replace all the consonants by numbering them from 1
// (left to right) in S. Then the program must replace all the vowels by numbering
// them from 1 (right to left) in S. Finally, the program must print the modified string
// S as the output.

// Boundary Condition(s):
// 1 <= Length of S <= 100

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the modified string S.

// Example Input/Output 1:
// Input:
// skillrack

// Output:
// 122345167

// Explanation:
// The string skillrack contains 2 vowels and 7 consonants.
// The consonants in the string skillrack are numbered from left to right 12i345a67
// The vowels in the string skillrack are numbered from right to left as 122345167.
// Hence the output is 122345167

// Example Input/Output 2:
// Input:
// abcdefghijklmnopqrstu

// Output:
// 5123445637891011212131415161


import java.util.*;
public class Numbering_Encryption 
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
        char[] s=obj.next().toCharArray();
        String[] num=new String[s.length];
        int c=1,v=1;
        for(int i=0;i<s.length;i++)
        {
            if(!isVowel(s[i]))
            {
                num[i]=String.valueOf(c);
                c++;
            }
        }
        for(int i=s.length-1;i>=0;i--)
        {
            if(isVowel(s[i]))
            {
                num[i]=String.valueOf(v);
                v++;
            }
        }
        for(int i=0;i<s.length;i++)
            System.out.print(num[i]);
    }
}