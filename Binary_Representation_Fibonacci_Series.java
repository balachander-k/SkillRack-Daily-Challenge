// The program must accept a positive integer N as the input. The program must
// consider the first N numbers in the Fibonacci series. For each number M in the
// Fibonacci series, the program must print the binary representation of M as the
// output.

// Boundary Condition(s):
// 1 <= N <=45

// Input Format:
// The first line contains the integer N.

// Output Format:
// The first line contains the binary representation of the first N numbers in the
// Fibonacci series separated by a space.

// Example Input/Output 1:
// Input:
// 6

// Output:
// 0 1 1 1 0 11 101
// Explanation:
// The first 6 numbers in the fibonacci series are 0 1 1 2 3 5.
// So the binary representation of the fibonacci series is O, I, I, IO, 11, 101.
// Hence the output is 0 1 1 IO 11 101.

// Examplel Input/Output 2:
// Input:
// 3

// Output:
// 0 1 1 

import java.util.*;
public class Binary_Representation_Fibonacci_Series
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),first=0,second=1;
        for(int i=1;i<=a;i++)
        {
            int temp=first;
            System.out.print(Integer.toBinaryString(temp)+" ");
            int next=first+second;
            first=second;
            second=next;
        }
    }
}