// The program must accept a string S containing only lower case alphabets as the
// input The program must remove the repeated vowels in the string S. Then the
// program must print the modified string S as the output.

// Boundary Condition(s):
// 1 <= Length of S 10^4

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the modified string S.

// Example Input/Output 1:
// Input:
// conditioner

// Output:
// cndtner

// Explanation:
// The vowels o and i are repeated in the string "conditioner". So they are removed
// from the string "conditioner".
// Hence the output is cndtner

// Example Input/Output 2:
// Input:
// skillrack

// Output:
// skillrack

import java.util.*;
public class Remove_Repeated_Vowels
{
    public static boolean isVowel(char c)
    {
        char ch=Character.toLowerCase(c);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            return true;
        return false;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] val=obj.next().toCharArray();
        int[] arr=new int[26];
        for(int i=0;i<val.length;i++)
        {
            if(isVowel(val[i]))
            {
                int ascii=(int)val[i]-97;
                int temp=arr[ascii];
                arr[ascii]=++temp;
            }
        }
        for(int i=0;i<val.length;i++)
        {
             if(isVowel(val[i]))
            {
                int ascii=(int)val[i]-97;
                int temp=arr[ascii];
                if(temp!=0 && temp<2)
                    System.out.print(val[i]);
            }
            else 
                System.out.print(val[i]);
        }
    }
}