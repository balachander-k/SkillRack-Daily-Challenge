// The program must accept an integer N as the input. The program must print the
// sum of digits in the octal representation of N as the output.

// Boundary Condition(s):
// 1 <= N <= 10^8

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the sum of digits in the octal representation of N.

// Example Input/Output 1:
// Input:
// 12

// Output:
// 5

// Explanation:
// The octal representation of 12 is 14.
// The sum of digits in 14 is 5.
// Hence the output is 5

// Example Input/Output 2:
// Input:
// 9

// Output:
// 2


import java.util.*;
public class Sum_Octal_Representation
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt(),sum=0;
        while(num!=0)
        {
            int t=num%8;
            sum=sum+t;
            num=num/8;
        }
        System.out.print(sum);
    }
}