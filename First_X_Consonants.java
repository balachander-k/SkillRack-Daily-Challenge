// The program must accept a string S and an integer X as the input. The program
// must print the first X consonants in the string S as the output. If the number
// of consonants in the string S is less than X then the program must print -1 as the
// output.

// Note: The string S contains only alphabets.

// Boundary Condition(s):
// 1 <= Length of S <= 100
// 1 X <= Length of S

// Input Format:
// The first line contains the string S.
// The second line contains the value of X.

// Output Format:
// The first line contains either the first X consonants in S or -1.

// Example Input/Output 1:
// Input:
// SkillRack
// 5

// Output:
// SkilR

// Explanation:
// The first 5 consonants in the string "SkillRack" are S, k, l, I and R.
// So they are printed as the output.

// Example Input/Output 2:
// Input:
// Dengue
// 6

// Output:
// -1

import java.util.*;
public class First_X_Consonants
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
        String a=obj.next(),val="";
        int b=obj.nextInt(),count=0;
        for(int i=0;i<a.length();i++)
        {
            if(isVowel(a.charAt(i))==0)
            {
                if(count==b)
                    break;
                if(count!=b)
                    val=val+a.charAt(i);
                count++;
            }
        }
        System.out.print((count==b)?val:"-1");
    }
}