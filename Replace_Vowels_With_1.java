
// The program must accept a string S as the input. The program must replace all the vowels in
// the string S with 1. Then the program must print the modified string and the count of
// vowels C in the string S as the output. If the string S contains characters other than
// alphabets, the program must print Invalid as the output.

// Boundary Condition(s):
// 1 <= Length of S <= 1000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the modified string and C separated by a space or contains the string
// value "Invalid".

// Example Input/Output 1:
// Input:
// AeFloT

// Output:
// IIF11T3

// Explanation:
// The count of vowels in the string AeFloT is 3 and they are A, e and o.
// After replacing the vowels with 1, the string becomes 1 IFIIT.
// Hence the output is
// IIF11T3

// Example Input/Output 2:
// Input:
// ABIE

// Output:
// Invalid

import java.util.*;
public class Replace_Vowels_With_1
{
    public static boolean isVowel(char ch)
    {
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='O'||ch=='o'||ch=='u'||ch=='U')
            return true;
        return false;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        int count=0,c=0;
        for(int i=0;i<s.length;i++)
        {
            if(Character.isAlphabetic(s[i]) && isVowel(s[i]))
            {
                s[i]='1';
                count++;
            }
            else if(!Character.isAlphabetic(s[i]))
            {
                System.out.print("Invalid");
                c++;
                break;
                
            }
        }
        if(c==0)System.out.print(String.valueOf(s)+" "+count);
    }
}