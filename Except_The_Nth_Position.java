// The program must accept a string value S and an integer N as the input. The
// program must remove the characters which are present at the positions of
// multiples of N and then print the modified string as the output.

// Boundary Condition(s):
// 1 <= Length of S <= 100
// 2 <= N <= Length of <=S

// Input Format:
// The first line contains the string S and the integer N.

// Output Format:
// The first line contains the modified string.

// Example Input/Output 1:
// Input:
// SQUIRRELED 3

// Output:
// SQRELD

// Explanation:
// In the string SQ IR EL D, the characters which are present at the positions of
// multiples of 3 are U, R and E.
// So remove the characters U, R and E in the string SQUIRRELED.
// Hence the output is SQIRELD

// Example Input/Output 2:
// Input:
// Banglore 2
// Output:
// Bnlr


import java.util.*;
public class Except_The_Nth_Position
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next();
        int b=obj.nextInt(),t=b-1;
        for(int i=0;i<a.length();i++)
        {
            if(i==t)
                t=t+b;
            else 
                System.out.print(a.charAt(i));
        }
    }
}