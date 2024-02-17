// The program must accept N string values as the input. The program must print the
// length of the longest palindromic string among the N string values as the output.
// Note:
// - Each string value contains only lower case alphabets.
// - At least one palindromic string is always present in the given N string values.

// Boundary Condition(s):
// 1 <= N < = 100
// 1 <= Length of each string <= 1000

// Input Format:
// The first line contains N.
// The next N lines, each containing a string value.

// Output Format:
// The first line contains the length of the longest palindromic string among the N
// string values.

// Example Input/Output 1:
// Input:
// 5
// abcdefg
// eye
// engine
// madam
// environment

// Output:
// 5

// Explanation:
// Here, the palindromic string values are eye and madam.
// madam is the longest palindromic string whose length is 5, so 5 is printed as the
// output.

// Example Input/Output 2:
// Input:
// 4
// book
// redder
// rotor
// wow

// Output:
// 6


import java.util.*;
public class Longest_Plaindromic_String
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),max=Integer.MIN_VALUE;
        String[] arr=new String[N];
        for(int i=0;i<N;i++)
            arr[i]=obj.next();
        for(int i=0;i<N;i++)
        {
            char[] temp=arr[i].toCharArray();
            String first="",second="";
            for(int j=0;j<temp.length;j++)
                first+=String.valueOf(temp[j]);
            for(int j=temp.length-1;j>=0;j--)
                second+=String.valueOf(temp[j]);
            if(first.equals(second))
                if(first.length()>max)
                    max=first.length();
            
        }
        System.out.print(max);
    }
}