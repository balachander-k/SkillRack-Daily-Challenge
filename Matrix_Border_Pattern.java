// The program must accept an integer N as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 1<= N <= 50

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
// 2 * * 3
// 3 * * 4
// 4 3 2 1 

// Example Input/Output 2:
// Input:
// 5

// Output:
// 1 2 3 4 5
// 2 * * * 4
// 3 * * * 3
// 4 * * * 2
// 5 4 3 2 1




import java.util.*;
public class Matrix_Border_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),first=2,last=a-1;
        for(int i=1;i<=a;i++)
            System.out.print(i+" ");
        System.out.println();
        for(int i=2;i<=a-1;i++)
        {
            for(int j=0;j<a;j++)
            {
                if(j==0)
                    System.out.print(i+" ");
                else if(j==a-1)
                    System.out.print(last+" ");
                else 
                    System.out.print("*"+" ");
            }
            System.out.println();
            last--;
        }
        for(int i=a;i>=1;i--)
            System.out.print(i+" ");
    }
}