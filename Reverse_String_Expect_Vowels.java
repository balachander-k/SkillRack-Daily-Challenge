// The program must accept a string S containing only alphabets as the input. The
// program must reverse the string S, keeping the vowels in the same position. Then
// the program must print the modified string S as the output.

// Boundary Condition(s):
// 1 <= Length of S <=1000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the modified string S.

// Example Input/Output 1:
// Input:
// bulk

// Output:
// kulb

// Explanation:
// There is only one vowel in b 1k So the string is reversed except
// Hence the output is kulb

// Example Input/Output 2:
// Input:
// Apple

// Output:
// Alppe

import java.util.*;
public class Reverse_String_Expect_Vowels
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
        String a=obj.next(),store="";
        for(int i=0;i<a.length();i++)
        {
            if(!isVowel(a.charAt(i)))
                store=store+a.charAt(i);
        }
        int j=store.length()-1;
        for(int i=0;i<a.length();i++)
        {
            if(!isVowel(a.charAt(i)))
            {
                System.out.print(store.charAt(j));
                j--;
            }
            else 
                System.out.print(a.charAt(i));
        }
    }
}