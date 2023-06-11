// The program must accept an integer N as the input. The program must print YES
// if the binary representation of N is a palindrome. Else the program must print NO
// as the output.

// Boundary Condition(s):
// 1 <= N <=10^9

// Input Format:
// The first line contains the value of N.

// Output Format:
// The first line contains either YES or NO.

// Example Input/Output 1:
// Input:
// 5

// Output:
// YES

// Explanation:
// The binary representation of 5 is 101.
// Here 101 is a palindrome.
// Hence the output is YES

// Example Input/Output 2:
// Input:
// 10

// Output:
// NO

import java.util.*;
public class Palindrome_Binary_Representation 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int value=obj.nextInt();
        String binary=Integer.toBinaryString(value);
        String rev="";
        for(int i=binary.length()-1;i>=0;i--)
            rev=rev+binary.charAt(i);
        System.out.print((binary.equals(rev))?"YES":"NO");
    }
}