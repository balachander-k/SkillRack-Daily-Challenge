// The program must accept a string S containing only alphabets as the input. The program
// must print all the vowels in the string S in the order of their occurrence interlaced with all
// the consonants in the string S in the reverse order of their occurrence as the output.

// Boundary Condition(s):
// 1 <= Length of S <= 1000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the string value as per the given condition.

// Example Input/Output 1:
// Input
// Skillrack

// Output:
// ikacRllkS

// Explanation:
// The vowels in the string SkillRack are i and a.
// The consonants in the string SkillRack are S, k, I, I, R, c and k.
// After interlacing the vowels (in the order of their occurrence) with the consonants (in the
// reverse order of their occurrence), the string becomes ikacRIIkS.
// So ikacRIIkS is printed as the output.

// Example Input/Output 2:
// Input:
// Heaven

// Output:
// enaveH

// Example Input/Output 3:
// Input:
// AEIOU

// Output:
// AEIOU


import java.util.*;
public class Interlace_Vowels_And_Consonants
{
    public static boolean isVowel(char ch)
    {
        if(ch=='a'||ch=='A'||ch=='E'||ch=='e'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
            return true;
        return false;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        String conso="",vow="",con="";
        for(int i=0;i<s.length;i++)
        {
            if(isVowel(s[i]))
                vow+=s[i];
            else 
                conso+=s[i];
        }
        int max=Integer.max(conso.length(),vow.length()),f=0,c=0,r=conso.length()-1;
        for(int i=0;i<max;i++)
        {
            if(f<vow.length)
                con+=vow.charAt(f++);
            if(r>=0)
                con+=conso.charAt(r--);
        }
        System.out.print(con);
    }
}