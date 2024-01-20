// The program must accept an integer N as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 1 <= N <=50

// Input Format:
// The first line contains N.

// Output Format:
// The lines contain the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 3

// Output:
// 1 2 3 + 3 2 1
// 1 2 3 + 3 2 1
// 1 2 3 + 3 2 1
// + + + + + + + 
// 1 2 3 + 3 2 1
// 1 2 3 + 3 2 1
// 1 2 3 + 3 2 1

// Example Input/Output 2:
// Input:
// 4

// Output:
// 1 2 3 4 + 4 3 2 1 
// 1 2 3 4 + 4 3 2 1 
// 1 2 3 4 + 4 3 2 1 
// 1 2 3 4 + 4 3 2 1 
// + + + + + + + + +
// 1 2 3 4 + 4 3 2 1 
// 1 2 3 4 + 4 3 2 1 
// 1 2 3 4 + 4 3 2 1 
// 1 2 3 4 + 4 3 2 1 


import java.util.*;
public class Print_Plus_Pattern_[RWD] 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        String plus="+ ";
        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=N;j++)
                System.out.print(j+" ");
            System.out.print("+"+" ");
            for(int j=N;j>=1;j--)
                System.out.print(j+" ");
            System.out.println();
        }
        System.out.println(plus.repeat((N*2)+1));
        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=N;j++)
                System.out.print(j+" ");
            System.out.print("+"+" ");
            for(int j=N;j>=1;j--)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}