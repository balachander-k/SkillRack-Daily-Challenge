// The program must accept two string values Sl and S2 containing only alphabets
// as the input The program must print yes if all the 26 alphabets (case insensitive)
// are present across the string values Sl and S2. Else the program must print no as
// the output.

// Boundary Condition(s):
// 1 <= Length of Sl, S2 <= 100

// Input Format:
// The first line contains Sl.
// The second line contains S2.

// Output Format:
// The first line contains yes or no.

// Example Input/Output 1:
// Input:
// abcdEFGHlJk
// LMNOpqrstuvwwxxxYYYzzz

// Output:
// yes

// Explanation:
// All the 26 alphabets (case insensitive) are present across the string values Sl and
// So yes is printed.

// Example Input/Output 2:
// Input:
// zzzxyyWvvUUUTTSr
// qponmllkjihgfedcba

// Output:
// yes

// Example Input/Output 3:
// Input:
// ABCDEF
// jklmnopqrst

// Output:
// no

import java.util.*;
public class All_Alphabets_Upper_Lower_Case
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s1=obj.next().toCharArray();
        char[] s2=obj.next().toCharArray();
        int[] arr=new int[26];
        int count=0;
        for(int i=0;i<s1.length;i++)
        {
            char ch=Character.toLowerCase(s1[i]);
            int temp=Integer.valueOf(ch)-97;
            int val=arr[temp];
            arr[temp]=++val;
        }
        for(int i=0;i<s2.length;i++)
        {
            char ch=Character.toLowerCase(s2[i]);
            int temp=Integer.valueOf(ch)-97;
            int val=arr[temp];
            arr[temp]=++val;
        }
        for(int i=0;i<arr.length;i++)
            if(arr[i]!=0)
                count++;
        System.out.print((count==26)?"yes":"no");
    }
}