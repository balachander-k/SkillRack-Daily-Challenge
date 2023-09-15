// The program must accept the binary representation of two integers X and Y as the
// input. The program must print the result of the bitwise XOR operation of the two
// binary representations (X A Y) as the output.

// Note: The number of bits in the binary representation of X and Y are always equal.

// Boundary Condition(s):
// 1 <= Length of each binary representation <= 63

// Input Format:
// The first line contains the binary representation of X.
// The second line contains the binary representation of Y.

// Output Format:
// The first line contains the binary representation of X ^ Y.

// Example Input/Output 1:
// Input:
// 1010100
// 0100101

// Output:
// 1110001

// Example Input/Output 2:
// Input:
// 1110
// 1010

// Output:
// 0100

import java.util.*;
public class Binary_XOR_OPeration 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt(),y=obj.nextInt();
        String val="";
        while(x!=0)
        {
            int rem1=x%10,rem2=y%10;
            if(rem1==0 && rem2==0)
                val="0"+val;
            if(rem1==1 && rem2==1)
                 val="0"+val;
            if(rem1==1 && rem2==0)
                 val="1"+val;
            if(rem1==0 && rem2==1)
                 val="1"+val;
            x=x/10;
            y=y/10;
        }
        System.out.print(val);
    }
}