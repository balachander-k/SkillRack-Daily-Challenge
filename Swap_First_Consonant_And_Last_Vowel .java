// The program must accept a string S as the input. The program must swap the first occured consonant and the last occured vowel in their positions of the string S. Finally, the program must print the modified string as the output.
// Note: The string S must have a consonant and a vowel.

// Boundary Condition(s);
// 2<= Length of S <=100

// Input Format:
// The first line contains the string S.

// Output Format:
// The first line contains the modified string S.


// Example Input/Output 1:
// Input:
// aeronautics

// Output:
// aeionautrcs

// Explanation:
// The first occured consonant is r.
// The last occured vowel is i.
// So swap the r and i in their positions.
// Hence the output is aeionautrcs

// Example Input/Output 2:
// Input:
// control

// Output:
// oontrcl


import java.util.*;
public class Swap_First_Consonant_And_Last_Vowel 
{
    public static int isVowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O'|| ch=='U')
            return 1;
        else 
            return 0;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char[] b=a.toCharArray();
        char[] vowel=new char[a.length()];
        char[] conso=new char[a.length()];
        int k=0,l=0,t=0,last_index=0,first_index=0;
        for(int i=0;i<a.length();i++)
        {
            if(isVowel(b[i])==1)
            {
                vowel[k]=b[i];
                last_index=i;
                k++;
            }
            else 
            {
                conso[l]=b[i];
                if(l==0)
                    first_index=i;
                l++;
            }
        }
        for(int i=0;i<a.length();i++)
        {
            if(i==first_index)
            {
                System.out.print(vowel[k-1]);
                continue;
            }
            if(i==last_index)
                System.out.print(conso[t]);
            else 
                System.out.print(b[i]);
        }
        
    }
}