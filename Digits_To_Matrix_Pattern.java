// The program must accept an integer N as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 1 <= N <=10^8

// Input Format:
// The first line contains N.

// Output Format:
// The lines containing the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 2987

// Output:
// 22998877
// 22998877

// Example Input/Output 2:
// Input:
// 32145

// Output:
// 333222111444555
// 333222111444555
// 333222111444555

// Example Input/Output 3:
// Input:
// 6010

// Output:
// 666666000000111111000000
// 666666000000111111000000
// 666666000000111111000000
// 666666000000111111000000
// 666666000000111111000000
// 666666000000111111000000


import java.util.*;
public class Digits_To_Matrix_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] N=obj.next().toCharArray();
        int temp=Integer.valueOf(N[0]-'0');
        for(int i=0;i<temp;i++)
        {
            int r=0;
            for(int j=0;j<N.length;j++)
            {
                String val=String.valueOf(N[j]);
                System.out.print(val.repeat(temp));
            }
            System.out.println();
        }
    }
}