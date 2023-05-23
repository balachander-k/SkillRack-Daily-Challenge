// The program must accept two integers X and N as the input. The program must
// form a series of N integers based on the following conditions.
// - The first term of the series must be the binary representation of X.
// - The second term of the series must be the octal representation of X+ 1.
// - The third term of the series must be the binary representation of X+2.
// - The fourth term of the series must be the octal representation of X+3 and so on.
// Finally, the program must print the series of N integers as the output.

// Boundary Condition(s):
// 1 <= X,N <= 10^5

// Input Format:
// The first line contains the values of X and N separated by a space.

// Output Format:
// The first line contains the first N terms of the series separated by a space as per
// the given conditions.

// Example Input/Output 1:
// Input:
// 5 6

// Output:
// 101 6 111 10 1001 12


// Explanation:
// The ISt term of the series is the binary representation of 5 (101)2.
// The 2nd term of the series is the octal representation of 6 (6)8.
// The 3rd term of the series is the binary representation of 7 (1 11)2.
// The 4th term of the series is the octal representation of 8 (10)8.
// The 5th term of the series is the binary representation of 9 (1001)2.
// The 6th term of the series is the octal representation of 10 (12)8.

// Example Input/Output 2:
// Input:
// 150 5 

// Output:
// 10010110 227 10011000 231 10011010


import java.util.*;
public class Binary_Octal_Mixed_Series
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=obj.nextInt();
        for(int i=1;i<=b;i++)
        {
            if(i%2!=0)
                System.out.print(Integer.toBinaryString(a)+" ");
            if(i%2==0)
                System.out.print(Integer.toOctalString(a)+" ");
            a++;
        }
    }
}