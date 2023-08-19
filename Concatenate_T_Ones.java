// The program must accept an integer N as the input. The program must find the
// number of ones T in the binary representation of N. Then the program must form
// the binary representation of an integer X by concatenating T ones. Finally, the
// program must print the integer value of X as the output.

// Boundary Condition(s):
// 2 <= N 10^8

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains X.

// Example Input/Output 1:
// Input:
// 10

// Output:
// 3
// Explanation:
// There are 2 ones present in the binary representation of 10 ( O O).
// So the binary representation of the integer X is 11.
// The decimal equivalent of 11 is 3.
// Hence the output is 3

// Example Input/Output 2:
// Input:
// 15

// Output:
// 15

import java.util.*;
public class Concatenate_T_Ones
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int value=obj.nextInt();
        String bin=Integer.toBinaryString(value);
        String s="0";
        for(int i=0;i<bin.length();i++)
            if(bin.charAt(i)=='1')
                s=s+bin.charAt(i);
        System.out.print(Integer.parseInt(s,2));
    }
}