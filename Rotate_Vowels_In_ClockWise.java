// The program must accept a string S as the input. The program must rotate all the
// vowels in the string S in the clockwise direction at their positions 1 time. Then the
// program must print the modified string S as the output.
// Note: At least one vowel is always present in the string S.

// Boundary Condition(s):
// I <= Length of S <= 1000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the modified string S.

// Example Input/Output 1:
// Input:
// national

// Output:
// natainol

// Explanation:
// After rotating the vowels in the clockwise direction by 1 time, the string becomes
// nt n l.
// Hence the output is natainol

// Example Input/Output 2:
// Input:
// AEIou

// Output:
// uAElo

import java.util.*;
public class Rotate_Vowels_In_ClockWise
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
        char[] val=obj.next().toCharArray();
        String temp="",last="";
        int q=0;
        for(int i=0;i<val.length;i++)
        {
            if(isVowel(val[i]))
            {
                temp=temp+val[i];
                last=String.valueOf(val[i]);
            }
        }
        for(int i=0;i<temp.length()-1;i++)
            last=last+temp.charAt(i);
        for(int i=0;i<val.length;i++)
        {
            if(isVowel(val[i]))
            {
                System.out.print(last.charAt(q));
                q++;
            }
            else 
                System.out.print(val[i]);
        }
    }
}