// The program must accept a string S where the length of S is always a multiple of 4
// as the input. The program must split the string S into four equal parts. Then the
// program must reverse the characters in each part. Finally, the program must print
// the modified four equal parts of the string S as the output.

// Boundary Condition(s):
// 4 <=Length of S <= 1000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the modified string S.

// Example Input/Output 1:
// Input:
// paraacetoaminophenol

// Output:
// aarap aotec ponim loneh

// Explanation:
// The four equal parts of the string S are paraa cetoa minop and henol.
// After reversing the characters in the four parts, they become aarap aotec ponim
// and Ioneh.
// Hence the output is aarap aotec ponim loneh

// Example Input/Output 2:
// Input:
// FAST

// Output:
// F A S T

import java.util.*;
public class Reverse_Four_Parts
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        int len=s.length/4,i=0;
        while(true)
        {
            try{
            String temp="";
            for(int j=0;j<len;j++)
            {
                temp=s[i]+temp;
                i++;
            }
            System.out.print(temp+" ");
            }
            catch(Exception e)
            {
                break;
            }
        }
    }
}