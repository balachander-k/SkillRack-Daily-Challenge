// The program must accept two integers N and K as the input. The program must print the integers from N-K to as the input.

// Boundary Condition(s);
// -1000 <= N <=1000
// 1<= K <=1000

// Input Format:
// The first line contains N and K separated by a space.

// Output Format:
// The first line contains K+1 integers separated by a space.

// Example Input/Output 1:
// Input:
// 10 3

// Output:
// 7 8 9 10

// Explanation:
// The value of N-K is 10-3 = 7. So the integers from 7 t0 10 are printed as the output.

// Example Input/Output 2:
// Input:
// 3 5

// Output:
// -2 -10 0 1 2 3





import java.util.*;
public class Previous_K_Integers 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=obj.nextInt();
        int diff=a-b;
        for(int i=diff;i<=a;i++)System.out.print(i+" ");
    }
}