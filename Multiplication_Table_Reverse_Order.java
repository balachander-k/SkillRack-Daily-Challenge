// The program must accept the value fortwo positive integers N and T and must
// print the multiplication table for N till the Tth multiple in reverse order.

// Boundary Condition(s):
// 1 <= N <=20
// 1 <= T <= 1000

// Input Format:
// The first line contains N and T separated by a space.

// Output Format:
// The lines containing the multiplication table for N till the Tth multiple in reverse
// order as shown in the Example Input/Output section.

// Example Input/Output 1:
// Input:
// 7 10

// Output:
// 10 * 7 = 70
// 9 * 7 = 63
// 8 * 7 = 56
// 7 * 7 = 49
// 6 * 7 = 42
// 5 * 7 = 35
// 4 * 7 = 28
// 3 * 7 = 21
// 2 * 7 = 14
// 1 * 7 = 7


// Example Input/Output 2:
// Input:
// 5 10

// Output:
// 10 * 5 =50
// 9 * 5 = 45
// 8 * 5 = 40
// 7 * 5 = 35
// 6 * 5 = 30
// 5 * 5 = 25
// 4 * 5 = 20
// 3 * 5 = 15
// 2 * 5 = 10
// 1 * 5 = 5

import java.util.*;
public class Multiplication_Table_Reverse_Order
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int first=obj.nextInt(),second=obj.nextInt();
        for(int i=second;i>=1;i--)
            System.out.println(i+" * "+first+" = "+(i*first));
    }
}