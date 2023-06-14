// The program must accept a string value S as the input. The program must print
// the characters which are present at the odd positions if the count of vowels in S is
// odd. Else the program must print the characters which are present at the even
// positions as the output If there is no vowel in the string S then the program must
// print -1 as the output.

// Boundary Condition(s):
// 2 <= Length of S <= 100

// Input Format:
// The first line contains the string S.

// Output Format:
// The first line contains either the characters which are present at the odd or even
// positions or -1.

// Example Input/Output 1:
// Input:
// apple

// Output:
// pl

// Explanation:
// In the word apple, there are two vowels. Here the count 2 is even.
// Hence the characters at the even positions are printed.
// Hence the output is pl

// Example Input/Output 2:
// Input:
// rhythm

// Output:
// -1

import java.util.*;
public class Odd_Or_Even_Position_Characters
{
    public static int isVowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            return 1;
        return 0;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String val=obj.next();
        int count=0;
        for(int i=0;i<val.length();i++)
        {
            if(isVowel(val.charAt(i))==1)
                count++;
        }
        if(count%2==0 && count!=0)
        {
            for(int i=0;i<val.length();i++)
                if(i%2!=0)
                    System.out.print(val.charAt(i));
        }
        if(count%2!=0 && count!=0)
        {
            for(int i=0;i<val.length();i++)
                if(i%2==0)
                System.out.print(val.charAt(i));
        }
        if(count==0)
            System.out.print("-1");
            
    }
}