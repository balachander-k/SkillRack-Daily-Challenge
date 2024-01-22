// The program must accept a string S containing only alphabets as the input. The
// program must print the vowels in the string S alternatively from both ends.
// Note: The string S always contains atleast one vowel.

// Boundary Condition(s):
// 2 <= Length of S <= 100

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the vowels in the string S alternatively from both ends.

// Example Input/Output 1:
// Input:
// Environment

// Output:
// Eeio

// Explanation:
// The vowels in the string Environment are E, i, o and e.
// So they are printed alternatively from both ends.

// Example Input/Output 2:
// Input:
// MANAGERIAL

// Output:
// AAAIE

// Example Input/Output 3:
// Input:
// skillrack

// Output:
// ia


import java.util.*;
public class Alternate_Vowels_String
{
    public static boolean isVowel(char c)
    {
        char ch=Character.toLowerCase(c);
        if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
            return true;
        return false;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        String t="",r="";
        for(int i=0;i<s.length;i++)
            if(isVowel(s[i]))
                t+=s[i];
        int f=0,l=t.length()-1;
        while((f<t.length()/2) && (l>=t.length()/2))
            r+=String.valueOf(t.charAt(f++))+String.valueOf(t.charAt(l--));
        if(t.length()%2!=0)
            r+=String.valueOf(t.charAt(t.length()/2));
        System.out.print(r);
    }
}