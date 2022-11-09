// The program must accept an integer as N as the input. The program must print the desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s);
// 1<=N<=1000

// Input Format:
// The first line contains the value of N.

// Output Format:
// The list of lines contain the desired pattern as shown in the Example Input/Output section.

// Example Input/Output 1:
// Input:
// 10

// Output:
// 1 3 5 7 9
// 2
// 4
// 6
// 8

// Example Input/Output 2:
// Input:
// 7

// Output:
// 1 3 5 7
// 2
// 4
// 6


import java.util.*;
public class Inverted_L_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        for(int i=1;i<=a;i++)
        {
            if(i%2==1)
                System.out.print(i+" ");
        }
        System.out.println();
        for(int i=2;i<a;i++)
        {
            if(i%2==0)
                System.out.println(i);
        }
    }
}