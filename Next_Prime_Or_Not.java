// The program must accept two prime numbers X and Y as the input. The program
// must print YES if Y is the next immediate prime number of X. Else the program
// must print NO as the output.

// Boundary Condition(s):
// 2 <= X <=10^6

// Input Format:
// The first line contains X and Y separated by a space.

// Output Format:
// The first line contains YES or NO.

// Example Input/Output 1:
// Input:
// 2 3

// Output:
// YES

// Example Input/Output 2:
// Input:
// 7 11

// Output:
// YES

// Example Input/Output 3:
// Input:
// 13 19

// Output:
// NO


import java.util.*;
public class Next_Prime_Or_Not
{
    public static boolean isPrime(int x)
    {
        if(x<=1)
            return false;
        for(int i=2;i<=Math.sqrt(x);i++)
            if(x%i==0)
                return false;
        return true;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt(),y=obj.nextInt(),temp=0;
        ++x;
        for(int i=x;i<=y;i++)
        {
            if(isPrime(i))
            {
                temp=i;
                break;
            }
        }
        System.out.print((temp==y)?"YES":"NO");
    }
}