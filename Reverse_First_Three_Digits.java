// The program must accept an integer N as the input. The program must reverse and print the first three digits of N as the output.

// Boundary Condition(s);
// 100 <= N <=10^15

// Input Format:
// The first line contains the integer N.

// Output Format:
// The first line contains the reverse of the first three digits in the integer N.

// Example Input/Output 1:
// Input:
// 32653

// Output:
// 623

// Explanation:
// The first three digits in 32653 are 3,2 and 6.
// So the reverse of 326 is 623.
// Hence the output is 623

// Example Input/Output 2:
// Input:
// 100236

// Output:
// 1



import java.util.*;
public class Reverse_First_Three_Digits{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] N=obj.next().toCharArray();
        String temp="";
        for(int i=2;i>=0;i--)
            temp=temp+N[i];
        System.out.print(Integer.parseInt((temp)));
    }
}