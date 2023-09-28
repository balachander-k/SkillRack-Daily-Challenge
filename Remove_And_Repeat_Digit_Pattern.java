// The program must accept an integer N as the input. For each digit D in N, the
// program must print the digit D for X times where X is formed by removing the
// digit D from the integer N as the output.

// Note: The value of N is always not a multiple of 100.

// Boundary Condition(s):
// 101 <= N <=10^5

// Input Format:
// The first line contains N.

// Output Format:
// The lines contain the integers separated by a space.

// Example Input/Output 1:
// Input:
// 121

// Output:
// 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 
// 2 2 2 2 2 2 2 2 2 2 2
// 1 1 1 1 1 1 1 1 1 1 1 1 

// Explanation:
// For the first digit in 121, the value of X is 21. So 1 is printed for 21 times.
// For the second digit in 121, the value of X is 11. So 2 is printed for 11 times.
// For the third digit in 121, the value of X is 12. So 1 is printed for 12 times.

// Explanation:
// For the first digit in 121, the value of X is 21. So 1 is printed for 21 times.
// For the second digit in 121, the value of X is 11. So 2 is printed for 11 times.
// For the third digit in 121, the value of X is 12. So 1 is printed for 12 times.

// Example Input/Output 2:
// Input:
// 210

// Output:
// 2 2 2 2 2 2 2 2 2 2
// 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
// 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0

import java.util.*;
public class Remove_And_Repeat_Digit_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String val=obj.next();
        for(int i=0;i<val.length();i++)
        {
            String temp="";
            for(int j=0;j<val.length();j++)
                if(i!=j)
                    temp=temp+val.charAt(j);
            int num=Integer.parseInt(temp);
            for(int j=1;j<=num;j++)
                System.out.print(j==num?val.charAt(i)+"\n":val.charAt(i)+" ");
        }
    }
}