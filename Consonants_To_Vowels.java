// The program must accept a string S as the input. The program must replace every
// consonant by the next nearest vowel. If there is no vowel after a consonant then it
// must be removed from the string.

// If there is no vowel in S, then print -1 as the output.

// Boundary Condition(s):
// 1 <= Length of S <=100

// Input Format:
// The first line contains the values of S.

// Output Format:
// The first line contains the string as per the condition or -1.

// Example Input/Output 1:
// Input:
// request

// Output:
// eeuue

// Explanation:
// In the string request, the first vowel after r is e. So the string becomes eequest
// In the string eequest, the first vowel after q is u. So the string becomes eeuuest
// There is no vowel after s and t so they are removed. The string becomes eeuue
// Hence the output is eeuue

// Example Input/Output 3:
// Input:
// cry

// Output:
// -1



import java.util.*;
public class Consonants_To_Vowels
{
    public static int isVowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            return 1;
        return 0;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next();
        char[] b=a.toCharArray();
        int count=0;
        for(int i=0;i<a.length();i++)
        {
            if(isVowel(b[i])==0)
            {
                for(int j=i+1;j<a.length();j++)
                {
                    if(isVowel(b[j])==1)
                    {
                        System.out.print(b[j]);
                        break;
                    }
                }
            }
            if(isVowel(b[i])==1)
            {
                count++;
                System.out.print(b[i]);
            }
        }
        if(count==0)System.out.print("-1");
    }
}