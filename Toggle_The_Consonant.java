// The program accepts a string S containing only lower case alphabets as the input.
// For each vowel in S, the program must toggle the case of next consonant in S.
// Finally, the program must print the modified string S as the output.

// Boundary Condition(s):
// 2 <= Length of S <= 10000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the modified string S.

// Example Input/Output 1:
// Input:
// about

// Output:
// a Bout

// Explanation:
// The 1St vowel in the string "about" is 'a' and the next consonant of 'a' is 'b'. So the
// case of 'b' is toggled.
// Now the string becomes "aBout".

// The 2nd vowel in the string "aBout" is 'o' and the next consonant of 'o' is 't'.So the 
// case of 't' is toggled.
// Now the string becomes "aBouT".

// The 3rd vowel in the string "aBouT" is 'u' and the next consonant of 'u' is 'T'.So the 
// case of 'T' is toggled.
// Now the string becomes "aBout".
// Hence the output is aBout

// Example Input/Output 2:
// Input:
// adoc

// Output:
// aDoC

// Example Input/Output 3:
// Input:
// aeibco

// Output:
// aeiBco


import java.util.*;
public class Toggle_The_Consonant
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
        for(int i=0;i<a.length();i++)
        {
            if(isVowel(b[i]))
            {
                char togg='0',con='0',g='0';
                int index=0;
                if(i+1<a.length())
                {
                    for(int j=i+1;j<a.length();j++)
                    {
                        if(!isVowel(b[j]))
                        {
                            togg=b[j];
                            index=j;
                            break;
                        }
                    }
                    if(Character.isLowerCase(togg))
                    {
                        con=Character.toUpperCase(togg);
                        b[index]=con;
                    }
                    if(Character.isUpperCase(togg))
                    {
                        g=Character.toLowerCase(togg);
                        b[index]=g;
                    }
                }
            }
        }
        System.out.print(String.valueOf(b));
    }
}