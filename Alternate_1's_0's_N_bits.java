// The program must accept an integer N as the input. The program must form a
// binary representation B of length N (i.e., B has N bits) by concatenating Is and 0s
// alternatively. Then the program must print the decimal equivalent of B as the
// output.

// Boundary Condition(s):
// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the decimal equivalent of B.

// Example Input/Output 1:
// Input:
// 5

// Output:
// 21

// Explanation:
// Here N=5, so the binary representation B is 10101 (alternate Is and 0s of length
// 5).
// The decimal equivalent of 10101 is 21.
// Hence the output is 21

// Example Input/Output 2:
// Input:
// 8

// Output:
// 170

// Explanation:
// Here N=8, so the binary representation B is 10101010 (alternate Is and 0s of
// length 8).
// The decimal equivalent of 10101010 is 170.
// Hence the output is 170


import java.util.*;
public class Alternate_1's_0's_N_bits
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        String bin="";
        for(int i=1;i<=n;i++)
            bin+=(i%2!=0)?"1":"0";
        System.out.print(Long.parseLong(bin,2));
        
    }
}