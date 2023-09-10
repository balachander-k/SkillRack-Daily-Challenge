// The program must accept a string S as the input. The program must print the
// maximum number of consonants between the alternate vowels in S as the output.
// Note: The string S always contains atleast two vowels.

// Boundary Condition(s):
// 3 <= Length of S <= 1000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the maximum number of consonants between the alternate
// vowels.

// Example Input/Output 1:
// Input:
// skillrackCODlNGPLATFORM

// Output:
// 4

// Explanation:
// The number of consonants between the vowels 'i' and 'a' in the string
// ski I ackCODlNGPLATFORM is 3.
// The number of consonants between the vowels 'a' and 'O' in the string
// skillra ODINGPLATFORM is 3.
// The number of consonants between the vowels 'O' and 'l' in the string
// skillrackCO INGPLATFORM is 1.
// The number of consonants between the vowels 'l' and 'A' in the string
// skillrackCODI
// ATFORM is 4.
// The number of consonants between the vowels 'A' and 'O' in the string
// skillrackCODlNGPLA ORM is 2.
// Here the maximum number of consonants is 4.
// Hence the output is 4

// Example Input/Output 2:
// Input:
// aaao

// Output:
// 0

import java.util.*;
public class Maximum_Consonants_Alternate_Vowels 
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
        String input=obj.next();
        int consonants=0,max=0;
        for(int i=0;i<input.length();i++)
        {
            if(isVowel(input.charAt(i)))
            {
                for(int j=i+1;j<input.length();j++)
                {
                    if(!isVowel(input.charAt(j)))
                        consonants++;
                    if(isVowel(input.charAt(j)))
                    {
                        if(consonants>max)
                            max=consonants;
                        i=--j;
                        consonants=0;
                        break;
                    }
                }
            }
        }
        System.out.print(max);
    }
}