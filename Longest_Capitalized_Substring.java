// The program must accept a string S containing only alphabets as the input. The
// program must print the longest substring of minimum length 2 in S which
// contains the first alphabet in upper case and the remaining alphabets in lower
// case. If more than one such substrings have occurred in S, the program must print
// the first occurring substring as the output. If there is no such substring, the
// program must print -1 as the output.

// Boundary Condition(s):
// 3 <= Length of S <= 100

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the longest substring or -1 as per the given conditions.

// Example Input/Output 1:
// Input:
// ThislsSkillRack

// Output:
// Skill

// Explanation:
// The longest substring which contains the first alphabet in upper case and the
// remaining alphabets in lower case is Skill.
// Hence the output is Skill

// Example Input/Output 2:
// abcDeFghiJklMnopQrst

// Output:
// Fghi

// Example Input/Output 3:
// Input:
// skillRACK

// Output:
// -1

import java.util.*;
public class Longests_Capitalized_Substring
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String val=obj.next(),largest="";
        char[] arr=val.toCharArray();
        for(int i=0;i<val.length-1;i++)
        {
            String temp="";
            if(Character.isUpperCase(arr[i]) && Character.isLowerCase(arr[i+1]))
            {
                temp+=String.valueOf(arr[i]);
                for(int j=i+1;j<val.length();j++)
                {
                    if(Character.isLowerCase(arr[j]))
                        temp+=String.valueOf(arr[j]);
                    else 
                        break;
                }
            }
            if(temp.length()!=0)
                if(temp.length()>largest.length())
                    largest=temp;
        }
        System.out.print(largest.length()!=0?largest:-1);
    }
}