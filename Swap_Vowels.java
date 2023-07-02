// The program must accept two string values Sl and S2 containing only alphabets.
// The number of vowels in Sl will always be equal to the number of vowels in S2.
// The program must replace the vowels in S2 with the vowels in Sl in the same
// order of occurrence and vice versa. Finally, the program must print the modified
// string values Sl and S2 as the output.

// Boundary Condition(s):
// 1 <=Length ofS1, S2 <=100

// Input Format:
// The first line contains the string Sl.
// The second line contains the string S2.

// Output Format:
// The first line contains the modified string Sl.
// The second line contains the modified string S2.

// Example Input/Output 1:
// Input:
// apple
// mango

// Output:
// applo
// mange

// Explanation:
// The vowels in "apple" are a and e.
// The vowels in "mango" are a and o.
// So they are interchanged in the same order of occurrence.
// Hence the output is
// applo
// mange

// Example Input/Output 2:
// Input:
// pollute
// elephant

// Output:
// pelleta
// oluphent


import java.util.*;
public class Swap_Vowels 
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
        String a=obj.next(),b=obj.next();
        char[] c=a.toCharArray();
        char[] d=b.toCharArray();
        char[] v1=new char[a.length()];
        char[] v2=new char[b.length()];
        int q=-1,w=-1,t=-1,r=-1;
        for(int i=0;i<b.length();i++)
        {
            if(isVowel(d[i])==1)
                v1[++q]=d[i];
        }
        for(int i=0;i<a.length();i++)
        {
            if(isVowel(c[i])==1)
                System.out.print(v1[++w]);
            else 
                System.out.print(c[i]);
        }
        System.out.println();
        for(int i=0;i<a.length();i++)
        {
            if(isVowel(c[i])==1)
                v2[++t]=c[i];
        }
        for(int i=0;i<b.length();i++)
        {
            if(isVowel(d[i])==1)
                System.out.print(v2[++r]);
            else 
                System.out.print(d[i]);
        }
    }
}