// The program must accept an integer N as the input. The program must print the
// sum of factorial of the digits in N as the output.

// Boundary Condition(s):
// 10 <= N <= 10^17

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the sum of factorial of the digits in N.

// Example Input/Output 1:
// Input:
// 147

// Output:
// 5065

// Explanation:
// 1!+ 4! + 7! = 1 + 24 + 5040 = 5065

// Example Input/Output 2:
// Input:
// 2986

// Output:
// 403922
import java.util.*;
public class Sum_Of_Factorial_Of_Digits 
{
    public static int Factorial(int v)
    {
        int fact=1;
        for(int j=1;j<=v;j++)
            fact*=j;
        return fact;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        int sum=0;
        for(int i=0;i<s.length;i++)
            sum+=Factorial(Integer.valueOf(s[i])-'0');
        System.out.print(sum);
    }
}