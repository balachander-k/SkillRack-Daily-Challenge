// The program must accept a string S and print all the vowels enclosed within
// square brackets one by one as shown in the Example Input/Output section.
// Note: At least one vowel is always present in the string S.

// Boundary Condition(s):
// 2 <= Length of S <= 100

// Input Format:
// The first line contains S.

// Output Format:
// The lines (whose count is equal to the number of vowels in S) contain the desired
// pattern as shown in the Example Input/Output section.

// Example Input/Output 1:
// Input:
// skillrack

// Output:
// sk[i]llrack
// sk[i]llr[a]ck

// Example Input/Output 2:
// Input:
// Ethical Hacking

// Output:
// [E]thical Hacking
// [E]th[i]cal Hacking
// [E]th[i]c[a]l Hacking
// [E]th[i]c[a]l H[a]cking
// [E]th[i]c[a]l H[a]ck[i]ng

import java.util.*;
public class String_Vowels_Square_Brackets
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
        String a=obj.nextLine();
        int vowel=0;
        for(int i=0;i<a.length();i++)
            if(isVowel(a.charAt(i)))
                vowel++;
        for(int i=1;i<=vowel;i++)
        {
            int count=0;
            for(int j=0;j<a.length();j++)
            {
                if(isVowel(a.charAt(j)) && count<i)
                {
                    System.out.print("["+a.charAt(j)+"]");
                    count++;
                }
                else 
                    System.out.print(a.charAt(j));
            }
            System.out.println();
        }
    }
}