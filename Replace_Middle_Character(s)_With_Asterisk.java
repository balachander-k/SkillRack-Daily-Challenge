// The program must accept a string S as the input. The program must replace the
// middle character with * in the string S if the length of the string is odd. Else the
// program must replace the 2 middle characters with * in the string S. Then the
// program must print the modified string S as the output.

// Boundary Condition(s):
// 3 <= Length of S <= 1000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the modified string S.

// Example Input/Output 1:
// Input:
// SkillRack

// Output:
// Skil*Rack

// Explanation:
// Here the length of the string skillrack is 9, which is odd.
// After replacing the middle character with *, the string becomes Skil*Rack.
// Hence the output is Skil*Rack

// Example Input/Output 2:
// Input:
// abc@1234

// Output:
// abc**234

import java.util.*;
public class Replace_Middle_Character(s)_With_*
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        if(s.length%2!=0)
        {
            for(int i=0;i<s.length;i++)
                if(s.length/2==i)
                    s[i]='*';
        }
        else 
        {
            for(int j=0;j<s.length;j++)
                if(s.length/2==j || (s.length/2)-1==j)
                    s[j]='*';
        }
        System.out.print(String.valueOf(s));
    }
}