// A string S is passed as the input to the program. The program must reverse the string S and then remove all the characters present at the positions of consonants in the given string (before reversing) as the output.
// Note: There will be at least one vowel in S.

// Boundary Condition(s);
// 1<= Length of S <=1000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the modified string.

// Example Input/Output 1:
// Input:
// baggage

// Output:
// ggb

// Explanation:
// The string baggage is reversed to get egaggab.
// The positions of consonants in the original string are 1, 3, 4 and 6.
// The alphabets at these positions are removed in egaggab to get ggb.

// Example Input/Output 2:
// Input:
// tansformer

// Output:
// msr


import java.util.*;
public class Remove_Alphabets_At_Consonants_Position
{
    public static int isVowel(char ch)
    {
        if(ch=='a' || ch=='A' || ch=='E' || ch=='e' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
            return 1;
        else 
            return 0;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char[] b=a.toCharArray();
        String val="";
        int[] array=new int[a.length()];
        int j=0,r=0;
        for(int i=0;i<a.length();i++)
        {
            if(isVowel(b[i])==0)
            {
                array[j]=i;
                j++;
            }
        }
        for(int i=a.length()-1;i>=0;i--)
            val=val+b[i];
        char[] c=val.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(i==array[r])
            {
                r++;
                continue;
            }
            else System.out.print(c[i]);
        }
    }
}