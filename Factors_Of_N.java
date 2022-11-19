// The program must accept an integer N as the input. The program must print the factors of N in descending order as the output.

// Boundary Condition(s):
// 1<= N <= 1000

// Input Format:
// The first line contains the value of N.

// Output Format:
// The first line contains the factors of N in descending order separated by space(s).

// Example Input/Output 1:
// Input:
// 24

// Output:
// 24 12 8 6 4 3 2 1

// Explanation:
// The factors of 24 in descending order are 24, 12, 8, 6, 4, 3, 2 and 1.
// Hence the output is 24 12 8 6 4 3 2 1

// Example Input/Output 2:
// Input:
// 11

// Output:
// 11 1



import java.util.*;
public class Factors_Of_N
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        for(int i=a;i>=1;i--)
        {
            if(a%i==0)
                System.out.print(i+" ");
        }
    }
}