// The program must accept N integers as the input. The program must print the sum
// of the largest digit of each integer in the N integers as the output.

// Boundary Condition(s):
// 1 <= N <=100
// 0 <= Each integer value <= 10^18

// Input Format:
// The first line contains the integer N.
// The second line contains N integers separated by space(s).

// Output Format:
// The first line contains the sum of the largest digit of each integer in the N integers.

// Example Input/Output 1:
// Input:
// 5
// 83 610 829 9008 111

// Output:
// 33

// Explanation:
// The largest digit in 83 is 8.
// The largest digit in 610 is 6.
// The largest digit in 829 is 9.
// The largest digit in 9008 is 9.
// The largest digit in 111 is 1.
// So their sum is 33 (8 + 6+ 9 + 9 + 1).
// Hence the output is 33

// Example Input/Output 2:
// Input:
// 4
// 6097 9674 2313 4407

// Output:
// 28


import java.util.*;
public class Largest_Digit_Sum 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        long a=obj.nextLong(),large=0,rev=0,sum=0;
        for(long i=0;i<a;i++)
        {
            large=0;
            long c=obj.nextLong();
            while(c!=0)
            {
                rev=c%10;
                if(rev>large)
                    large=rev;
                c=c/10;
            }
            sum=sum+large;
        }
        System.out.print(sum);
    }
}