// The program must accept four integers N, A, B and C as the input. The program
// must print the integers from 1 to N which are divisible by at least two integers
// among A, B and C as the output.

// Boundary Condition(s):
// 1 <= N <= 1O^8
// 1 <= A,B,c <= N

// Input Format:
// The first line contains the values of N, A, B and C separated by a space.

// Output Format:
// The first line contains the integers from 1 to N which are divisible by at least two
// integers among A, B and C separated by a space.

// Example Input/Output 1:
// Input:
// 10 2 3 4

// Output:
// 4 6 8

// Explanation:
// 4 is divisible by both 2 and 4.
// 6 is divisible by both 2 and 3.
// 8 is divisible by both 2 and 4.
// So these integers are divisible by at least two integers among 2, 3 and 4.
// Hence the output is 4 6 8

// Example Input/Output 2:
// Input:
// 80 12 5 7

// Output:
// 35 60 70


import java.util.*;
public class Divisible_By_At_Least_2_Integers
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        long a=obj.nextLong(),b=obj.nextLong(),c=obj.nextLong(),d=obj.nextLong();
        for(int i=1;i<=a;i++)
        {
            if((i%b==0 && i%c==0) || (i%d==0 && i%c==0) || (i%d==0 && i%b==0))
                System.out.print(i+" ");
        }
    }
}