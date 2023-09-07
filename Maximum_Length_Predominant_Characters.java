// The program must accept N string values as the input. For each string S among
// the N string values, the program must replace the string based on the following
// conditions.

// - If the count of alphabets is greater than or equal to the count of non-alphabets
// in S then replace the string by removing all the non-alphabets in S.
// - If the count of alphabets is less than the count of non-alphabets in S then
// replace the string by removing all the alphabets in S.
// Finally, the program must print the string having the maximum length among the
// N modified string values as the output. If more than one string has the maximum
// length then print the first occurring string as the output.

// Boundary Condition(s):
// 1 <= N, Length of each string <= 100

// Input Format:
// The first line contains N.
// The next N lines each contain a string value.

// Output Format:
// The first line contains a string value as per the given conditions.

// Example Input/Output 1:
// Input:
// 5
// 123Abcd###
// 99@xyz.com
// a4B3c2D1
// SDIOOFG-qw500er
// x1a2y3b4z5c6

// Output:
// SDFGqwer

// Explanation:
// After replacing the 5 string values, the string values becomes
// 123###
// xyzcom
// aBcD
// SDFGqwer
// xaybzc

// Here the string SDFGqwer is having the maximum length 8. So SDFGqwer is
// printed as the output.

// Example Input/Output 2:
// Input:
// 3
// IOOOUSD
// 7839HKD
// 1460AUD

// Output:
// 1000

import java.util.*;
public class Maximum_Length_Predominant_Characters
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt(),max=Integer.MIN_VALUE;
        String[] arr=new String[size];
        String value="";
        for(int i=0;i<size;i++)
            arr[i]=obj.next();
        for(int i=0;i<size;i++)
        {
            char[] val=arr[i].toCharArray();
            String alpha="",numbers="";
            for(int j=0;j<val.length;j++)
            {
                if(Character.isAlphabetic(val[j]))
                    alpha=alpha+val[j];
                else 
                    numbers=numbers+val[j];
            }
            if(alpha.length()>=numbers.length())
                arr[i]=alpha;
            else
                arr[i]=numbers;
        }
        for(int i=0;i<size;i++)
        {
            if(arr[i].length>max)
            {
                max=arr[i].length();
                value=arr[i];
            }
        }
        System.out.print(value);
    }
}