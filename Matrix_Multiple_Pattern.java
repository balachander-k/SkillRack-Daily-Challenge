// The program must accept an integer N as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 1 <= N <= 50

// Input Format:
// The first line contains the value of N.

// Output Format:
// The first N lines containing the desired pattern as shown in the Example

// Input/Output section.
// Example Input/Output 1:
// Input:
// 4

// Output:
// 1 2 3 4
// 2 4 6 8
// 3 6 9 12
// 4 8 12 16

// Example Input/Output 2:
// Input:
// 5

// Output:
// 1 2 3 4 5 
// 2 4 6 8 10
// 3 6 9 12 15
// 4 8 12 16 20
// 5 10 15 20 25

import java.util.*;
public class Matrix_Multiple_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        for(int i=1;i<=size;i++)
        {
            for(int j=1;j<=size;j++)
                System.out.print((i*j)+" ");
            System.out.println();
        }
    }
}