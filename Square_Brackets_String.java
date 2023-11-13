// The program must accept a string S with spaces as the input. The program must
// convert all the alphabets between each pair of square brackets [ ] to upper case
// alphabets. Finally, the program must print the modified string S as the output.

// Boundary Condition(s):
// 3 <= Length of S <=1000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the modified string S.

// Example Input/Output 1:
// Input:
// uhuu [ntu e]tuhnt[uheo

// Output:
// uhuu [NTU E]tuhnt[uheo

// Explanation:
// In the string uhuu [ntu e]tuhnt[uheo, the alphabets within the pair of square
// brackets are n t u e.
// After coverting those alphabets into uppercase the string becomes uhuu [NTU
// Eltuhnt[uheo.
// Hence the output is uhuu [NTU E]tuhnt[uheo


// Example Input/Output 2:
// Input:
// [robert [was] a good [king]

// Output:
// [robert [WAS] a good [KING]

// Example Input/Output 3:
// Input:
// [as[df]er]

// Output:
// [as[DF]er]

import java.util.*;
public class Square_Brackets_String
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.nextLine().toCharArray();
        int fin=-1;
        for(int i=0;i<s.length;i++)
        {
            if(s[i]=='[')
                fin=i;
            if(s[i]==']' && fin!=-1)
            {
                for(int j=i-1;j>fin;j--)
                    s[i]=Character.toUpperCase(s[i]);
                fin=-1;
            }
        }
        System.out.print(String.valueOf(s));
    }
}