// The program must accept the value of a string S as the input. The program must
// print the maximum number of alphabets between any two consecutive same
// alphabets in the string as the output. If there is no such repeated alphabet, then the
// program must print -1 as the output.

// Note: The string S contains only lowercase alphabets.
// Boundary Condition(s):
// 3 Length of String S < = 99

// Input Format:
// The first line contains the value of S.

// Output Format:
// The first line contains the maximum number of characters between two same
// alphabets.

// Example Input/Output 1:
// Input:
// helloh

// Output:
// 4

// Explanation:
// There are two repeated alphabets I and h.
// The number of alphabets between I is 0.
// The number of alphabets between h is 4.
// Hence 4 is printed.

// Example Input/Output 2:
// Input:
// xyz

// Output:
// -1

import java.util.*;
public class Maximum_Number_Of_Characters 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next();
        char[] b=a.toCharArray();
        int[] freq=new int[26];
        int val=0,max=Integer.MIN_VALUE;
        for(int i=0;i<b.length;i++)
        {
            int temp=(int)b[i]-97;
            int curr=freq[temp];
            freq[temp]=++curr;
        }
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]>1)
            {
                int t=i+97;
                val++;
                char s=(char)t;
                int count=0;
                for(int j=0;j<a.length();j++)
                {
                    if(a.charAt(j)==s)
                    {
                        int v=j+1;
                        for(int k=v;k<a.length();k++)
                        {
                            if(a.charAt(k)==s)
                            {
                                j=a.length();
                                break;
                            }
                            else 
                                count++;
                        }
                    }
                }
                if(count>max)
                    max=count;
            }
        }
        System.out.print((val!=0)?max:"-1");
    }
}