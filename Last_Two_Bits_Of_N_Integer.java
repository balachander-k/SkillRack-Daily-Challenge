// The program must accept N integers as the input. The program must form a
// binary representation B by concatenating the last two bits of each integer among
// the N integers (left to right). Then the program must print the decimal equivalent
// of B as the output.

// Boundary Condition(s):
// 2 <= Each integer value <= 10^5

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains the decimal equivalent of B.

// Example Input/Output 1:
// Input:
// 4
// 7 5 8 2

// Output:
// 210

// Explanation:
// The last two bits in the binary representation of 7 is 11.
// The last two bits in the binary representation of 5 is 01.
// The last two bits in the binary representation of 8 is 00.
// The last two bits in the binary representation of 2 is 10.
// So the obtained binary representation B is 11010010.
// The decimal equivalent of 11010010 is 210.
// Hence the output is 210

// Example Input/Output 2:
// Input:
// 3
// 12 10 32

// Output:
// 8

import java.util.*;
public class Last_Two_Bits_Of_N_Integer 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        String con="";
        for(int i=0;i<size;i++)
        {
            String t=Integer.toBinaryString(obj.nextInt()),r="";
            for(int j=t.length()-1;j>=t.length()-2;j--)
                r=t.charAt(j)+r;
            con=con+r;
        }
        System.out.print(Long.parseLong(con,2));
    }
}