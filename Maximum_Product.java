// The program must accept N integers as the input. The program must print the product P of any two integers among N integers so that the values of the product is maximum.

// Boundary Condition(s);
// 2<= N <= 10^5
// 1<= Each integer value <= 10^8

// Input Format:
// The first line contains the integer N.
// The second line contains N integers separated by space(s).

// Output Format:
// The first line contains the value of P.

// Example Input/Output 1:
// Input:
// 5
// 10 5 1 7 2

// Output:
// 70

// Explanation:
// The value of the maximum product is 70(10*7).
// Hence the output is 70

// Example Input/Output 2:
// Input:
// 4
// 4 2 4 9

// Output:
// 36



import java.util.*;
public class Maximum_Product
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        long[] b=new long[a];
        for(int i=0;i<a;i++)
            b[i]=obj.nextLong();
        Arrays.sort(b);
        System.out.print(b[a-1]*b[a-2]);
    }
}