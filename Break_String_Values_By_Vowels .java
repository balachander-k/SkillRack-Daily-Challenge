// The program must accept a string S as the input. The program must break the string into multiple string values so that each string contains exactly one vowel. The string values must be broken such that all the string values start with vowel except for the first string.


// Boundary Conditions(s);
// 1<= Length of S <=100

// Input Format:
// The first line contains the string S.

// Output Format:
// The lines contain a string in each line.

// Example Input/Output 1:
// Input:
// helloworld

// Output:
// hell
// ow
// orld

// Explanation:
// The string values "hell", "ow" and "orld" contains exactly one vowel. All the string values are started wiht vowel except the first string.

// Example Input/Output 2:
// Input:
// daefifof

// Output:
// da
// ef
// if 
// of

// Explanation:
// The string values "da","ef","if" and "of" contains exactlyone vowel. All the string values are started with vowel except the first string.

import java.util.*;
public class Break_String_Values_By_Vowels 
{
    public static int isVowel(char ch)
    {
        char r=Character.toLowerCase(ch);
        if(r=='a' || r=='e' || r=='i'|| r=='o' || r=='u')
            return 1;
        else 
            return 0;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a="gbbcadgj";
        char[] b=a.toCharArray();
        String[] c=new String[a.length()];
        int len=a.length()-1;
        int count=0,flag=0,StringVowel=0;
        for(int i=0;i<a.length();i++)
        {
            if(isVowel(b[i])==1)
            {
                count++;
            }
            if(count==2)
            {
                flag=i-1;
                break;
            }
        }
        if(count!=2)
        {
            for(int i=0;i<a.length();i++)
            {
                System.out.print(b[i]);
            }
        }
        else
        {
        for(int i=0;i<=flag;i++)
        {
            System.out.print(b[i]);
        }
        System.out.print("\n");
        int temp=++flag;
        for(int i=temp;i<a.length();i++)
        {
            if(isVowel(b[i])==1)
            {
                StringVowel++;
            }
            if(StringVowel==2)
            {
                StringVowel=1;
                System.out.println();
                System.out.print(b[i]);
            }
            else
            {
                System.out.print(b[i]);   
            }
        }
        }
    }
}