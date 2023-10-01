// The program must accept a string S containing only alphabets as the input. The
// program must toggle the case of alternate alphabets in the string S. Then the
// program must print the modified string S as the output.

// Boundary Condition(s):
// 2 <= Length of S <= 10^5

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the modified string S.

// Example Input/Output 1:
// Input:
// SkillRack

// Output:
// skilLRAcK

// Explanation:
// The alternate alphabets in the string k IR c are 'S', 'i',
// So the case of the alternate alphabets are toggled.
// Hence the output is skllLRAcK

// Example Input/Output 2:
// Input:
// yellow

// Output:
// YeLlOw

import java.util.*;
public class Toggle_Case_Alternate_Alphabets 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        for(int i=0;i<s.length;i=i+2)
        {
            if(Character.isLowerCase(s[i]))
                s[i]=Character.toUpperCase(s[i]);
            else 
                s[i]=Character.toLowerCase(s[i]);
        }
        System.out.print(String.valueOf(s));
    }
}