// The program must accept a string S as the input. The program must print only the
// vowels in the string if the vowel count is larger than the consonant count. Else the
// program must print only the consonants in S as the output. If both the counts are
// equal, then the program must print the string as it is without any change.
// Note: The alphabets must be printed in the same order as given in the input.

// Boundary Condition(s):
// 1 <= Length of S <= 1000

// Input Format:
// The first line contains the string S.

// Output Format:
// The first line contains the string based on the given condition.

// Example Input/Output 1:
// Input:
// takeout

// Output:
// aeou

// Explanation:
// The number of vowels in takeout is 4.
// The number of consonants in takeout is 3.
// Hence the vowels are printed.

// Example Input/Output 2:
// Input:
// partyhall

// Output:
// prtyhll

import java.util.*;
public class Print_Majority_Vowel_Consonants
{
    public static int isVowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            return 1;
        else 
            return 0;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine(),vowel="",conso="";
        for(int i=0;i<a.length();i++)
        {
            if(isVowel(a.charAt(i))==1)
                vowel=vowel+a.charAt(i);
            else 
                conso=conso+a.charAt(i);
        }
        if(vowel.length()==conso.length())
            System.out.print(a);
        if(vowel.length()>conso.length())
            System.out.print(vowel);
        if(vowel.length()<conso.length())
            System.out.print(conso);
    }
}