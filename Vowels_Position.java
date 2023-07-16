// The program must accept a string value S the input. The program must print the
// vowel positions. If there are no such vowels in S then print -1 as the output.

// Boundary Condition(s):
// 1 <= Length of S <= 100

// Input Format:
// The first line contains the values of string S.

// Output Format:
// The first line contains either the vowel positions separated by a space(s) or -1.

// Example Input/Output 1:
// Input:
// Mechanic

// Output:
// 2 5 7

// Explanation:
// In Mechanic, the vowels are e, a, and i.
// And their positions are 2, 5 and 7.
// Hence the output is 2 5 7

// Example Input/Output 2:
// Input:
// EncyclOPEDlA

// Output:
// 1 7 9 11 12

// Example Input/Output 3:
// Input:
// Rhythm

// Output:
// -1

import java.util.*;
public class Vowels_Position
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
        String val=obj.next();
        int count=0;
        for(int i=0;i<val.length();i++)
            if(isVowel(val.charAt(i)))
            {
                System.out.print((i+1)+" ");
                count++;
            }
        if(count==0)System.out.print("-1");
    }
}