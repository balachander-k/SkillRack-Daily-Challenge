// The program must accept a string S as the input. The program must remove the subsequent alphabets in S which are in the same case. Finally, the program must print the modified string as the output.

// Boundary Condition(s);
// 1<= Length of S <=100

// Input Format:
// The first line contains the string S.

// Output Format:
// The first line contains the modified string.

// Example Input/Output 1:
// Input:
// abcDEFghi

// Output:
// aDg

// Explanation:
// The consecutive lower case and upper case alphabets in the string "abcDEFghi" are "bc","EF" and "hi".
// After removing those consecutive alphabets in "abcDEFghi", the string becomes "aDg".
// Hence the output is aDg.

// Example Input/Output 2:
// Input:
// rDFjksdfGJejJKDbfgKrSDF

// Output:
// rDjGeJbKrS



import java.util.*;
public class Remove_Consecutive_Alphabets
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] a=obj.nextLine().toCharArray();
        System.out.print(a[0]);
        for(int i=0;i<a.length;i++)
        {
            if(i+1<a.length)
            {
                if(Character.isLowerCase(a[i]) && (Character.isLowerCase(a[i+1])))
                    continue;
                else if(Character.isUpperCase(a[i]) && (Character.isUpperCase(a[i+1])))
                    continue;
                else
                    System.out.print(a[i+1]);
            }
        }
      
    }
}