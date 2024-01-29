// The program must accept two string values Sl and S2 containing only lower case
// alphabets as the input. The program must print the missing lower case alphabets
// among the alphabets in Sl and S2 in alphabetical order. If all the lower case
// alphabets are present in Sl and S2, the program must print -1 as the output.

// Boundary Condition(s):
// 1 <= Length ofS1, S2 <= 100

// Input Format:
// The first line contains Sl.
// The second line contains S2.

// Output Format:
// The first line contains the missing alphabets or -1.

// Example Input/Output 1:
// Input:
// hello
// skillrack

// Output:
// bdfgjmnpqtuvwxyz

// Explanation:
// The missing lower case alphabets in "hello" and "skillrack" are b, d, f, g, j, m, n,
// p, q, t, u, v, w, x, y and z.
// Hence the output is bdfgjmnpqtuvwxyz

// Explanation:
// The missing lower case alphabets in "hello" and "skillrack" are b, d, f, g, j, m, n,
// p, q, t, u, v, w, x, y and z.
// Hence the output is bdfgjmnpqtuvwxyz

// Example Input/Output 2:
// Input:
// abcdefghijklmn
// opqrstuvwxyz

// Output:
// -1

import java.util.*;
public class Missing_Lower_Case_Alphabets
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s1=obj.next().toCharArray();
        char[] s2=obj.next().toCharArray();
        int arr[]=new int[26];
        int count=0;
        for(int i=0;i<s1.length;i++)
        {
            int ascii=(int)s1[i]-97;
            int avail=arr[ascii];
            arr[ascii]=++avail;
        }
        for(int i=0;i<s2.length;i++)
        {
            int ascii=(int)s2[i]-97;
            int avail=arr[ascii];
            arr[ascii]=++avail;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                System.out.print((char)(i+97));
                count++;
            }
        }
        if(count==0)
            System.out.print("-1");
    }
}