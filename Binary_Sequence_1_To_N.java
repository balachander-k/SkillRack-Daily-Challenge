// The program must accept an integer N as the input. The program must print the
// binary representation of the integers from 1 to N as the output.

// Boundary Condition(s):
// 1 <= N < = 100

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the binary representation of the integers from 1 to N.

// Example Input/Output 1:
// Input:
// 8

// Output:
// 1 10 11 100 101 110 111 1000

// Explanation:
// The binary representation of the integers from 1 to 8 are 1, 10, 11, 100, 101, 110,
// 111 and 1000.

// Example Input/Output 2:
// Input:
// 17

// Output:
// 1 10 11 100 101 110 111 1000 1001 1010 1011 1100 1101 1110 1111 10000 10001


import java.util.*;
public class Binary_Sequence_1_To_N
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        for(int i=1;i<=N;i++)
            System.out.print((Integer.toBinaryString(i))+" ");
    }
}