// The program must accept two positive integers N and D as the input. Then the
// program must print the decimal value represented by the last D bits in the binary
// representation of N.

// Note: Always D will be less than or equal to the total number of bits in the binary
// representation of N.

// Boundary Condition(s):
// 1 <= N <=10^18
// 1 <= D <= 57

// Input Format:
// The first line contains the values of N and D separated by a space.

// Output Format:
// The first line contains the decimal equivalent of last D bits in the binary
// representation of N.

// Example Input/Output 1:
// Input:
// 10 3

// Output:
// 2
// Explanation:
// The binary representation of 10 is 1010.
// Last 3 bits are 010 whose decimal value is 2.


// Example Input/Output 2:
// Input:
// 63 4

// Output:
// 15

import java.util.*;
public class Last_D_Bits_Decimal_Value
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        long a=obj.nextLong();
        int b=obj.nextInt();
        String val=Long.toBinaryString(a);
        String s=val.substring(val.length()-b);
        long deci=Long.parseLong(s);
        System.out.print(deci);
    }
}