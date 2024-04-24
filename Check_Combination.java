// The program must accept a string S containing only C and D as the input. The
// program must print yes if the string S is formed using the following combinations
// of C and D.
// c
// CD
// CDD
// Else the program must print no as the output.

// Boundary Condition(s):
// 1 <= Length of S <= 100

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains yes or no.

// Example Input/Output 1:
// Input:
// CDCDDCCCCDD

// Output:
// yes

// Explanation:
// Here the string CDCDDCCCCDD is formed using the given combinations of C and
// D.
// C - CDCDDCCCCDD
// CD - CDCDDCCCCDD
// CDD - CDCDDCCCCDD

// Example Input/Output 2:
// Input:
// CCCCCDCDDD

// Output:
// no


import java.util.*;
public class Check_Combination
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        int count=0;
        for(int i=0;i<s.length-2;i++)
        {
            String temp="";
            int w=i,c=1;
            while(c<=3)
            {
                temp+=s[w++];
                c++;
            }
            if(temp.contains("CDD"))
                for(int j=i;j<w;j++)
                    s[j]='0';
        }
        for(int i=0;i<s.length-1;i++)
        {
            String temp="";
            int w=i,c=1;
            while(c<=2)
            {
                temp+=s[w++];
                c++;
            }
            if(temp.contains("CD"))
                for(int j=i;j<w;j++)
                    s[j]='0';
        }
        for(int i=0;i<s.length;i++)
            if(s[i]=='c')s[i]='0';
         for(int i=0;i<s.length;i++)
            if(s[i]=='0')count++;
        System.out.print((count==s.length)?"yes":"no");
    }
}