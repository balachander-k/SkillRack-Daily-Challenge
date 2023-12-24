// The program must accept an integer N as the input. The program must print the
// maximum possible integer which is formed by removing exactly one bit from the
// binary representation of N as the output.

// Boundary Condition(s):
// 2 <= N <=2^31

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the maximum possible integer which is formed by removing
// exactly one bit from the binary representation of N.

// Example Input/Output 1:
// Input:
// 5

// Output:
// 3
// Explanation:
// The binary representation of 5 is 101.
// All possible combinations after removing exactly one bit from 101 are given below.
// The decimal equivalent of 10 is 2.
// The decimal equivalent of 11 is 3.
// The decimal equivalent of 01 is 1.
// Here the maximum integer value is 3, so it is printed as the output.

// Example Input/Output 2:
// Input:
// 31

// Output:
// 15


import java.util.*;
public class Maximum_Possible_Integer_Binary
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),max=Integer.MIN_VALUE;
        String bin=Integer.toBinaryString(N);
        for(int i=0;i<bin.length();i++)
        {
            String con="";
            for(int j=0;j<bin.length();j++)
                if(i!=j)
                    con=con+bin.charAt(j);
            int num=Integer.parseInt(con,2);
            if(num>max)
                max=num;
        }
        System.out.print(max);
    }
}