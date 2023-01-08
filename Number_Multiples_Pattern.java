// The program must accept an integer N as the input. The program must print the desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s);
// 1<= N <=100

// Input Format:
// The first line contains the value of N.

// Output Format:
// The first N times containing the desired pattern as shown in the Example Input/Output section.

// Example Input/Output 1:
// Input:
// 4

// Output:
// 1 
// 2 4
// 3 6 9
// 4 8 12 16

// Example Input/Output 2:
// Input:
// 7

// Output:
// 1 
// 2 4
// 3 6 9
// 4 8 12 16
// 5 10 15 20 25
// 6 12 18 24 30 36



import java.util.*;
public class Number_Multiples_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=i;j++)System.out.print((i*j)+
            " ");
            System.out.println();
        }
    }
}