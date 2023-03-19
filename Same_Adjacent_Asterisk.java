// The program must accept a string S as the input. The program must print YES if the
// adjacent characters of each asterisk (*) are same. Else the program must print NO as the
// output.

// Note: The string does not contain any continuous asterisks.

// Boundary Condition(s):
// 1 <= Length of S <= 100

// Input Format:
// The first line contains the string S.

// Output Format:
// The first line contains either YES or NO

// Example Input/Output 1:
// Input
// ab*bkt*tz

// Output:
// YES

// Explanation:
// The adjacent characters of the first * are b and b. Here the adjacent characters are same.
// The adjacent characters of the second * are t and t. Here the adjacent characters are same.
// Hence the output is YES

// Example Input/Output 2:
// Input:
// cp*pl*l*h

// Output:
// NO


import java.util.*;
public class Same_Adjacent_Asterisk
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char[] b=a.toCharArray();
        int asterisk=0,count=0;
        for(int i=0;i<a.length();i++)
        {
            if(b[i]=='*')
                asterisk++;
        }
        for(int i=0;i<a.length();i++)
        {
            if(b[i]=='*')
            {
                if(i==0 || i==a.length()-1)count++;
                else 
                {
                    if(b[i-1]==b[i+1])count++;
                }
            }
        }
        if(count==asterisk)System.out.print("YES");
        else System.out.print("NO");
    }
}