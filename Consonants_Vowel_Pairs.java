// The program must accept a string S as the input. The program must print all the
// pairs having a consonant followed by a vowel in the string S (in the order of
// occurrence) as the output.

// Note: The string S always contains at least one pair having a consonant followed
// by a vowel.

// Boundary Condition(s):
// 2 <= Length of S <= 100

// Input Format:
// The first line contains the string S.

// Output Format:
// The first line contains all the pairs having a consonant followed by a vowel
// separated by a space.

// Example Input/Output 1:
// Input:
// volcano

// Output:
// vo ca no

// Explanation:
// The string "volcano" contain three pairs having a consonant followed by a vowel.
// So the pairs vo ca and no are printed as the output.

// Example Input/Output 2:
// Input:
// TELEVISION

// Output:
// TE LE VI Sl

import java.util.*;
public class Consonants_Vowel_Pairs
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
        String a=obj.next();
        char[] b=a.toCharArray();
        for(int i=0;i<b.length-1;i++)
        {
            if(!isVowel(b[i]) && isVowel(b[i+1]))
            {
                System.out.print(b[i]);
                System.out.print(b[i+1]+" ");
            }
        }
    }
}