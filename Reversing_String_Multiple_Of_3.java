// The program must accept a string S containing only alphabets as the input. The
// program must reverse the string S. Then the program must print the alphabets
// which are present at the positions of multiples of 3 in the modified string as the
// output.

// Boundary Condition(s):
// 3 <= Length of S <=1000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the alphabets as per the given condition.

// Example Input/Output 1:
// Input:
// embezzling

// Output:
// izm

// Explanation:
// After reversing the string embezzling, the string becomes gnilzzebme.
// In the string gnilzzebme, the alphabets present at the positions of multiples of 3
// are i, z and m.
// Hence the output is izm

// Example Input/Output 2:
// Input:
// Nature

// Output:
// uN

import java.util.*;
public class Reversing_String_Multiple_Of_3 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        for(int i=0,j=s.length-1;i<j;i++,j--)
        {
            char t=s[j];
            s[j]=s[i];
            s[i]=t;
        }
        for(int i=1;i<=s.length;i++)
            if(i%3==0)
                System.out.print(s[i-1]);
    }
}