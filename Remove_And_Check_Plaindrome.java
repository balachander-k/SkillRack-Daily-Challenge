// The program must accept a string S containing only lower case alphabets as the
// input The program must print YES if the string S is a palindrome after removing
// any one alphabet from it. Else the program must print NO as the output.

// Boundary Condition(s):
// 2 <= Length of S <= 100

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains YES or NO.

// Example Input/Output 1:
// Input:
// abkcddcba

// Output:
// YES

// Explanation:
// After removing the alphabet Io from ab cddcba, the string becomes abcddcba
// which is a palindrome.
// Hence the output is YES

// Example Input/Output 2:
// Input:
// madam

// Output:
// YES

// Example Input/Output 3:
// Input:
// abcdfdeba

// Output:
// NO

import java.util.*;
public class Remove_And_Check_Plaindrome
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next(),rev="";
        int count=0;
        for(int i=a.length()-1;i>=0;i--)
            rev=rev+a.charAt(i);
        if(a.equals(rev))
        {
            System.out.print("YES");
            count++;
        }
        else 
        {
            for(int i=0;i<a.length();i++)
            {
                String temp="",frev="";
                for(int j=0;j<a.length();j++)
                    if(i!=j)
                        temp=temp+a.charAt(j);
                for(int j=temp.length()-1;j>=0;j--)
                        frev=frev+temp.charAt(j);
                if(temp.equals(frev))
                {
                    System.out.print("YES");
                    count++;
                    break;
                }
            }
        }
        if(count==0)System.out.print("NO");
            
    }
}