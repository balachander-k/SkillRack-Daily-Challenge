// The program must accept a string S containing only alphabets as the input. The program
// must form two string values Sl and S2 of equal length L (where L is the length of S) based
// on the following conditions.

// - Initially, the string Sl contains all the alphabets in S and S2 contains only asterisks.
// - For each alphabet in the string S, if the previous alphabet is a vowel, the program must
// interchange the characters in Sl and S2 at the same position.
// Finally, the program must print Sl and S2 in separate lines as the output.

// Boundary Condition(s):
// 3 <= Length of S <= 1000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains Sl.
// The second line contains S2.

// Example Input/Output 1:
// Input:
// boom

// Output:
// bo**
// **om

// Explanation:
// Here S = boom and its length is 4.
// Sl = boom
// The ISt alphabet in S is b and there is no previous alphabet. So there is no change in Sl and
// The 2nd alphabet in S is o and the previous alphabet is a consonant (b). So there is no
// change in Sl and S2.
// The 3r alphabet in S is o and the previous alphabet is a vowel (o). So the characters in Sl
// and S2 are interchanged in the same position.
// Sl = bo*m
// The 4th alphabet in S is m and the previous alphabet is a vowel (o). So the characters in Sl
// and S2 are interchanged in the same position.
// Sl = bo**
// om

// Hence the output is
// bo**
// **om

// Example Input/Output 2:
// Input:
// skillrack

// Output:
// ski*lra*k
// ***l***c*

// Example Input/Output 3:
// Input:
// QUEUEING

// Output:
// QU*****G
// **EUEIN*


import java.util.*;
public class Split_String_Based_On_Vowels
{
    public static boolean isVowel(char ch)
    {
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
            return true;
        return false;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.next(),aster=("*").repeat(s.length());
        char[] s1=s.toCharArray(),s2=aster.toCharArray();
        for(int i=1;i<s.length();i++)
        {
            if(isVowel(s.charAt(i-1)))
            {
                char temp=s1[i];
                s1[i]=s2[i];
                s2[i]=temp;
            }
        }
        System.out.print(String.valueOf(s1)+"\n"+String.valueOf(s2));
    }
}