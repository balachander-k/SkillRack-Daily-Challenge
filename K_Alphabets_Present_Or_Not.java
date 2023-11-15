// The program must accept a string S and an integer K as the input. The program
// must print YES if the first K lower case alphabets are present atleast once in the
// string S. Else the program must print NO as the output.

// Boundary Condition(s):
// 1 <= Length of S <= 100
// 1 <= K <=26

// Input Format:
// The first line contains S.
// The second line contains K.

// Output Format:
// The first line contains either YES or NO.

// Example Input/Output 1:
// Input:
// afehijklmnopzqrcstuvdwxgyb
// 5

// Output:
// YES

// Explanation:
// Here K = 5.
// The first 5 lower case alphabets are a b c d e, which are present in the string
// afehijklmnopzqrcstuvdwxgyb.
// So YES is printed.

// Example Input/Output 2:
// Input:
// BdbAarCst
// 3

// Output:
// NO


import java.util.*;
public class K_Alphabets_Present_Or_Not
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        int k=obj.nextInt(),count=0;
        char t='a',temp='1';
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<s.length;j++)
            {
                if(s[j]==t && s[j]!=temp)
                {
                    count++;
                    temp=s[j];
                }
            }
            t++;
        }
        System.out.print((count>=k)?"YES":"NO");
    }
}