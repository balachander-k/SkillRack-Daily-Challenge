// The program must accept an integer N as the input. The program must print the number of
// even integers that can be formed from the digits of N without changing the order of their
// occurrences.

// Note: There are no leading zeroes in the even integers.

// Boundary Condition(s):
// 1 <= N <=10^8

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the number of even integers that can be formed from the digits of N.

// Example Input/Output 1:
// Input:
// 5234

// Output:
// 6

// Explanation:
// All possible even integers that can be formed from the digits of 5234 are given below.
// 52
// 5234
// 2
// 234
// 34
// 4
// The number of possible even integers is 6. So 6 is printed as the output.

// Example Input/Output 2:
// Input:
// 20406
// Output:
// 9

// Explanation:
// All possible even integers that can be formed from the digits of 20406 are given below.
// 2
// 20
// 204
// 2040
// 20406
// 4
// 406
// 6
// The number of possible even integers is 9. So 9 is printed as the output.

// Example Input/Output 3:
// Input:
// 2424

// Output:
// 10

import java.util.*;
public class Integer_Count_Of_Even_Integers
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int count=0;
        char[] s=obj.next().toCharArray();
        for(int i=0;i<s.length;i++)
        {
            String temp="";
            for(int j=i;j<s.length;j++)
            {
                temp+=String.valueOf(s[j]);
                if(temp.charAt(0)!='0')
                {
                    int val=Integer.valueOf(temp);
                        if(val!=0 && val%2==0)
                            count++;
                }
            }
        }
        System.out.print(count);
    }
}