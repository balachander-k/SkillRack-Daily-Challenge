// The program must accept an integer N as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 2 <= N <= 100

// Input Format:
// The first line contains the value of N.

// Output Format:
// The lines containing the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 3

// Output:
// 0 0 1
// 0 2 1
// 3 2 1

// Example Input/Output 2:
// Input:
// 4

// Output:
// 0 0 0 1
// 0 0 2 1
// 0 3 2 1
// 4 3 2 1


import java.util.*;
public class Leading_zeros_Reverse_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),temp=a-1,zero=0;
        for(int i=0;i<a;i++)
        {
            int t=0,rev=a;
            for(int j=0;j<a;j++)
            {
                if(t<temp)
                    System.out.print(zero+" ");
                else 
                    System.out.print(rev+" ");
                rev--;
                t++;
            }
            temp--;
            System.out.println();
        }
    }
}