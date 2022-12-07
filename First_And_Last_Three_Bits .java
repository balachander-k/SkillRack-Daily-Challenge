// The program must accept an integer N as the input. The program must the decimal equivalent of the first three bits and the last three bits in the binary representation of N as the output.

// Boundary Condition(s);
// 4<= N <=10^8

// Input Format:
// The first line contains the value of N.

// Output Format:
// The first line contains the decimal equivalent of the first three bits and the last three bits separated by a space.

// Example Input/Output 1:
// Input:
// 86

// Output:
// 5 6

// Explanation:
// The binary representation of 86 is 1010110.
// The decimal equivalent of the first three bits(101) in the binary reprsentation of 86 is 5.
// The decimal equivalent of the last three bits(110) in the binary representation of 86 is 6.
// Hence the output is 5  6

// Example Input/Output 2:
// Input:
// 7

// Output:
// 7 7 


import java.util.*;
public class First_And_Last_Three_Bits {
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        String b=Integer.toBinaryString(a);
        char[] c=b.toCharArray();
        String temp="",val="";
        for(int i=0;i<3;i++)
            temp=temp+c[i];
        for(int i=c.length-3;i<c.length;i++)
            val=val+c[i];
        int bin1=Integer.parseInt(temp,2);
        int bin2=Integer.parseInt(val,2);
        System.out.print(bin1+" "+bin2);
    }

}
