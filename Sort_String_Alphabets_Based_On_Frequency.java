// The program must accept a string S containing only alphabets as the input. The
// program must sort the alphabets in the string S based on the frequency (i.e., the
// number of occurrences) of the alphabets in descending order. If more than one
// alphabets have the same frequency, the program must sort those alphabets in
// alphabetical order. Finally, the program must print the modified string as the output.

// Boundary Condition(s):
// 1 <= Length of S < = 1000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the modified string S.

// Example Input/Output 1:
// Input:
// aaajbbbcccc

// Output:
// ccccaaabbbj

// Explanation:
// Here the string is aaajbbbcccc.
// The frequency of a is 3.
// The frequency of j is 2.
// The frequency of b is 3.
// The frequency of c is 4.
// After sorting the alphabets in the string aaajbbbcccc based on frequency, the string
// becomes ccccaaabbbj.

// Example InpuVOutput 2:
// Input;
// skillrack

// Output:
// kkllacirs

// Example Input/Output 3:
// Input:
// aaaB BBcCdddd

// Ouptut:
// ddddBBBaaaCc


import java.util.*;
public class Sort_String_Alphabets_Based_On_Frequency
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        int c=0,t=0;
        int[] arr=new int[256];
        for(int i=0;i<s.length;i++)
        {
            if(Character.isLowerCase(s[i]))
            {
                int temp=Integer.valueOf(s[i]);
                int val=arr[temp];
                arr[temp]=++val;
            }
            else 
            {
                int caps=Integer.valueOf(s[i]);
                int v=arr[caps];
                arr[caps]=++v;
            }
        }
        for(int i=0;i<arr.length;i++)if(arr[i]!=0)c++;
        while(t<c)
        {
            int max=Integer.MIN_VALUE,pos=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]!=0)
                {
                    if(arr[j]>max)
                    {
                        max=arr[j];
                        pos=j;
                    }
                }
            }
            for(int j=0;j<max;j++)
                System.out.print((char)pos);
            arr[pos]=0;
            t++;
        }
    }
}