// The program must accept a string S and replace each vowel with the previous occurring vowel in S. Similarly the program must replace each consonant with the previous occurring consonant. The first occurring vowel or consonant remain unchanged.

// Boundary Condition(s);
// 1<= Length of S <=1000

// Input Format:
// The first line contains the value of S.

// Output Format:
// The first line contains the modified value of S.


// Example Input/Output 1:
// Input:
// apple

// Output:
// apppa

// Explanation:
// a is vowel and is the first. So it remains unchanged.
// p is a consonant and is the second. So it remains unchanged.
// p is then replaced and is a consonant. The previous occurring consonant is p.
// l is a consonant and previous occurring vowel is p.
// e is a vowel and previous occurring vowel is a.

// Example Input/Output 2:
// Input:
// manager

// Output:
// mamanag


import java.util.*;
public class Previous_Occurring_Vowel_Consonant 
{
    public static int isVowel(char ch)
    {
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
            return 1;
        else 
            return 0;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char[] b=a.toCharArray();
        char vowel='0',cons='0';
        for(int i=0;i<a.length();i++)
        {
            if(isVowel(b[i])==1)
            {
                if(vowel=='0')
                    System.out.print(b[i]);
                else 
                    System.out.print(vowel);
                vowel=b[i];
            }
            else 
            {
                if(cons=='0')
                    System.out.print(b[i]);
                else 
                    System.out.print(cons);
                cons=b[i];
                
            }
        }
    }
}