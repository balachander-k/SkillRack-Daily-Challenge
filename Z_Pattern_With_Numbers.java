// The program must accept an integer N as the input. The program must print the desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s);
// 1<= N <=100

// Input Format:
// The first line contains the value of N

// Output:
// The first N lines containing the desired pattern as shown in the Example Input/Output section.

// Example Input/Output 1:
// Input:
// 5

// Output:
// 1 2 3 4 5
// * * * 4
// * * 3
// * 2
// 1 2 3 4 5

// Example Input/Output 2:
// Input:
// 8

// Output:
// 1 2 3 4 5 6 7 8
// * * * * * * 7
// * * * * * 6
// * * * * 5
// * * * 4
// * * 3
// * 2
// 1 2 3 4 5 6 7 8


import java.util.*;
public class Z_Pattern_With_Numbers
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),temp=a;
        for(int i=1;i<=a;i++)System.out.print(i+" ");
        System.out.println();
        int loop1=a-2,loop2=--a;
        for(int i=1;i<=loop1;i++)
        {
            for(int j=1;j<=loop2;j++)
            {
                if(j==loop2)System.out.print(loop2+" ");
                else System.out.print("*"+" ");
            }
            System.out.println();
            --loop2;
        }
        for(int i=1;i<=temp;i++)System.out.print(i+" ");
    }
}