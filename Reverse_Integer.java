// The program must accept an integer N as the input. The program must reverse N and print it as the output.

// Boundary conditions:
// -10^7 <= N <= 10^7

// Input Format:
// The first line contains the integer N.

// Output Format:
// The first line contains the reversed value of N.

// Example Input/Output 1:
// Input:
// -9812

// Output:
// -2189

// Example Input/Output2:
// Input:
// 4501200

// Output:
// 21054

// Example Input/Output 3:
// Input:
// -712300

// Output:
// -3217


import java.util.*;
public class Reverse_Integer
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int rem,rev=0;
        while(a!=0)
        {
            rem=a%10;
            rev=(rev*10)+rem;
            a=a/10;
        }
        System.out.print(rev);
        }
}