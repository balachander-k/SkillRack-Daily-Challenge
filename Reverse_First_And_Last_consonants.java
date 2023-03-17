// The program must accept a string S as the input. The program must reverse the characters
// between the first occuring consonant and the last occuring consonant (inclusive of both the
// consonants) in the string. Then the program must print the modified string as the output.
// Note: At least two consonants will be present in the string S.

// Boundary Condition(s):
// 2 <= Length of S <= 1000

// Input Format:
// The first line contains the string S.

// Output Format:
// The first line contains the modified string S.

// Example Input/Output 1:
// Input:
// aroma

// Output:
// amora

// Explanation:
// The first occurring consonant is r.
// The last occurring consonant is m.
// So "romn is reversed as "mor".
// Hence the output is amora

// Example Input/Output 2:
// Input:
// aEilkjOpqrstuAe

// Output:
// aEitsrqpOjkluAe

import java.util.*;
public class Reverse_First_And_Last_consonants
{
    public static int isVowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I'|| ch=='O' || ch=='U')
            return 1;
        else 
            return 0;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine(),first="",last="",mid="";
        int first_ind=0,last_ind=0;
        char[] b=a.toCharArray();
        for(int i=0;i<a.length();i++)
        {
            if(isVowel(b[i])==0)
            {
                first_ind=i;
                break;
            }
            else first=first+b[i];
        }
        for(int i=a.length()-1;i>=0;i--)
        {
            if(isVowel(b[i])==0)
            {
                last_ind=i;
                break;
            }
            else last=b[i]+last;
        }
        for(int i=last_ind;i>=first_ind;i--)mid=mid+b[i];
        System.out.print(first+mid+last);
        
    }
}