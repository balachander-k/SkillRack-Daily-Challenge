// The program must accept a string S containing only alphabets as the input. The
// program must print YES if all the vowels in the string S are same case (i.e either
// upper case or lower case). Else the program must print NO as the output.
// Note: At least one vowel is always present in the string S.

// Boundary Condition(s):
// 1 <= Length of S <= 1000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains YES or NO.

// Example Input/Output 1:
// Input:
// SkillRack

// Output:
// YES

// Explanation:
// The string Sk IIR ck contains two vowels i and a.
// Here i and a are in lower case. So YES is printed as the output.

// Example Input/Output 2:
// Input:
// Information

// Output:
// NO

// Example Input/Output 3:
// Input:
// ElgHtEEn

// Output:
// YES

import java.util.*;
public class Same_Case_Vowels 
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
        char[] val=obj.next().toCharArray();
        int vowel=0,low=0,upe=0;
        for(int i=0;i<val.length;i++)
        {
            if(isVowel(val[i]))
            {
                vowel++;
                if(Character.isLowerCase(val[i]))
                    low++;
                if(Character.isUpperCase(val[i]))
                    upe++;
            }
        }
    System.out.print((vowel==low||vowel==upe)?"YES":"NO");
    }
}