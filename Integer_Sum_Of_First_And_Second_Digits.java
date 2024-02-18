// The program must accept an integer N as the input. The program must print yes if
// the sum of the first and third digits is present in N. Else the program must print no
// as the output.

// Boundary Condition(s):
// 100 <= N <= 10^8

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains yes or no.

// Example Input/Output 1:
// Input:
// 968172

// Output:
// yes

// Explanation:
// The sum of the first and third digits in 968172 is 17.
// The sum 17 is present in the integer 968172.
// Hence the output is yes

// Example Input/Output 2:
// Input:
// 747134

// Output:
// no


import java.util.*;
public class Integer_Sum_Of_First_And_Second_Digits
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String N=obj.next();
        int first=Integer.valueOf(N.charAt(0)-48),second=Integer.valueOf(N.charAt(2)-48),sum=first+second;
        System.out.print(N.contains(String.valueOf(sum))?"yes":"no");
    }
}