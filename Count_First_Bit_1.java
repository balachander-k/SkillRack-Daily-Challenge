// The program must accept an integer N as the input. The program must print the count of
// integers from 1 to N which are having 1 as the first bit in their binary representation. The
// number of bits to consider to find the first bit is the number of bits in the binary
// representation of N. So you must pad the leading zeros depending on the number of bits in
// the binary representation N.

// Boundary Condition(s):
// 1 < = N <= 10^6

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the count of integers from 1 to N which are having 1 as the first bit in
// their binary representation.

// Example Input/Output 1:
// Input:
// 10

// Output:
// 3

// Explanation:
// Here N = 10.
// The number of bits in the binary representation of 10 is 4. So the number of bits to consider
// to find the first bit is 4.
// The binary representation of the integers from 1 to 10 are given below.
// 0001
// 0010
// 0011
// 0100
// 0101
// 0110
// 0111
// ooo
// 001
// 010

// There are three binary representations having 1 as the first bit (1000, 1001 and 1010).
// So 3 is printed as the output.

// Example Input/Output 2:
// Input:
// 16

// Output:
// 1


import java.util.*;
public class Count_First_Bit_1
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),count=0;
        String temp=Integer.toBinaryString(N);
        for(int i=1;i<=N;i++)
        {
            String bin=Integer.toBinaryString(i),abin="";
            if(bin.length()!=temp.length())
            {
                int len=Math.abs(bin.length()-temp.length());
                for(int j=1;j<=len;j++)
                    abin+="0";
                abin+=bin;
                if(abin.charAt(0)=='1')
                    count++;
            }
            else 
                if(bin.charAt(0)=='1')count++;
        }
        System.out.print(count);
    }
}