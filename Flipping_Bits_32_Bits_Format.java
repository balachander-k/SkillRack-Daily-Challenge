// The program must accept N positive integers as the input. For each integer X among the
// given N integers, the program must find the binary representation of X in 32 bits. Then the
// program must toggle the 32 bits and print its decimal equivalent as the output.

// Boundary Condition(s):
// 1 <= N <= 1000
// 1 <= Each integer value <= 10^9

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.
// Output Format:
// The first N lines, each contains an integer.
// Example Input/Output 1:
// Input:
// 2
// 399861 7

// Output:
// 4294567434
// 4294967288

// Explanation:
// The decimal equivalent of the above binary representation is 4294567434. So it is printed.
// The binary representation of 7 in 32 bits is oooooooooooooooooooooooooooool 11.
// The decimal equivalent of the above binary representation is 4294967288. So it is printed.
// The binary representation of 7 in 32 bits is oooooooooooooooooooooooooooool 11.
// The decimal equivalent of the above binary representation is 4294967288. So it is printed.
// Example Input/Output 2:
// Input:
// 3
// 52568330 45 82730988

// Output:
// 4242398965
// 4294967250
// 4212236307



import java.util.*;
public class Flipping_Bits_32_Bits_Format
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        for(int i=1;i<=N;i++)
        {
            String bin=Integer.toBinaryString(obj.nextInt());
            int[] bit_32=new int[32];
            char[] binarr=bin.toCharArray();
            int len=Math.abs(bin.length()-32),y=0;
            String toggle="";
            for(int j=0;j<bit_32.length;j++)
            {
                if(j<len)
                    bit_32[j]=0;
                else 
                    bit_32[j]=Integer.valueOf(binarr[y++])-'0';
            }
            for(int j=0;j<bit_32.length;j++)
            {
                if(bit_32[j]==1)
                    toggle+=String.valueOf("0");
                else 
                    toggle+=String.valueOf("1");
            }
            long equi=Long.valueOf(toggle,2);
            System.out.println(equi);
        }
    }
}