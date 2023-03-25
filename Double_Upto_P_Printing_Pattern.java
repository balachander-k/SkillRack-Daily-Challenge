// The program must accept two integers N and P where P <= N as input. The program must
// print the pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 1<= N <=10
// 1<= p <=N

// Input Format:
// The first line contains the value of N and P separated by a space.

// Output Format:
// The first N lines containing the desired pattern as shown in the Example Input/Output.
// section.

// Example Input/Output 1:
// Input:
// 5 3

// Output:
// 1 1
// 2 2 2 2
// 3 3 3 3 3 3
// 4 4 4 4
// 5 5 5 5 5

// Example Input/Output 2:
// Input
// 6 2

// Output:
// 1 1
// 2 2 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5
// 6 6 6 6 6 6


import java.util.*;
public class Double_Upto_P_Printing_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=obj.nextInt(),c=1,count=0;
        for(int i=1;i<=a;i++)
        {
            if(i<=b)
            {
                for(int j=1;j<=i;j++)
                    System.out.print(c+" ");
                count++;
                if(count==1)
                {
                    for(int j=1;j<=i;j++)
                        System.out.print(c+" ");
                    System.out.println();
                    count=0;
                }
            }
            else
            {
                for(int j=1;j<=i;j++)
                    System.out.print(c+" ");
                System.out.println();
            }
            c++;
        }
    }
}