// The program must accept a string S (containing special characters and alphabets)
// and print the minimum number of toggles T required to convert all alphabets in S
// either to upper or to lower case as the output.

// Note: At least one alphabet is always present in the string S.

// Boundary Condition(s):
// 1 <= Length of S <= 1000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains T.

// Example Input/Output 1:
// Input:
// skill_RaCk

// Output:
// 2

// Explanation:
// In the string skill_RaCk, the count of lower case alphabets is 7.
// In the string skill_RaCk, the count of upper case alphabets is 2.
// The minimum number of toggles required is 2.
// So the alphabets R and C must be toggled to lower case so that all alphabets are
// in lower case.
// Hence the output is 2

// Example Input/Output 2:
// Input:
// aBCD!ef#

// Output:
// 3

// Example Input/Output 3:
// Input:
// PINK

// Output:
// 0


import java.util.*;
public class Same_Toggle_Case_Count 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        int upper=0,lower=0;
        for(int i=0;i<s.length;i++)
        {
            if(Character.isAlphabetic(s[i]))
            {
                if(Character.isUpperCase(s[i]))
                    upper++;
                else 
                    lower++;
            }
        }
        System.out.print(Math.min(upper,lower));
    }
}