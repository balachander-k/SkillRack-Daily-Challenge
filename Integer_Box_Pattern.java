// The program must accept an integer N as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 1 <= N <= 10^17

// Input Format:
// The first line contains N.

// Output Format:
// The first three lines contain the desired pattern as shown in the Example
// Input/Output section.

// Example Input/Output 1:
// Input:
// 45

// Output:
// +--+
// |45|
// +--+

// Example Input/Output 2:
// Input:
// 12045

// Output:
// +-----+
// 12045
// +-----+

import java.util.*;
public class Integer_Box_Pattern 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String num=obj.next();
        int len=num.length()+2;
        for(int i=1;i<=len;i++)
            System.out.print((i==1 || i==len)?"+":"-");
        System.out.print("\n"+"|"+num+"|"+"\n");
        for(int i=1;i<=len;i++)
            System.out.print((i==1 || i==len)?"+":"-");
    }
}