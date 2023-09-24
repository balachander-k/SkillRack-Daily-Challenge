// The program must accept two string values Sl and S2 of equal length as the
// input. The program must print YES if both the string values have a vowel or a
// consonant at the same position. Else the program must print NO as the output.

// Boundary Condition(s):
// 1 <= Length of Sl, S2 <= 1000

// Input Format:
// The first line contains Sl.
// The second line contains S2.

// Output Format:
// The first line contains YES or NO.

// Example Input/Output 1:
// Input:
// mcabcdeng
// SKILLRACK

// Output:
// YES

// Explanation:
// Here both the string values have a vowel or a consonant at the same position.
// m S - consonants
// c K - consonants
// a l - vowels
// b L - consonants
// c L - consonants
// d R - consonants
// e A - vowels
// n C - consonants
// g K - consonants
// Hence the output is YES

// Example Input/Output 2:
// Input:
// yogaa
// power

// Output:
// NO

import java.util.*;
public class Vowels_&_Consonants_S1_And_S2
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
        char[] s1=obj.next().toCharArray();
        char[] s2=obj.next().toCharArray();
        int vowel=0,conso=0;
        for(int i=0;i<s1.length;i++)
        {
            if(isVowel(s1[i]) && isVowel(s2[i]))
                vowel++;
            if(!isVowel(s1[i]) && !isVowel(s2[i]))
                conso++;
        }
        System.out.print((conso+vowel==s1.length)?"YES":"NO");
    }
}