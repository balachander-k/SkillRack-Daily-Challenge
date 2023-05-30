// The program must accept an integer N as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 2 <= N <=100

// Input Format:
// The first line contains the integer N.

// Output Format:
// The first N lines contain the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 4

// Output:
// 1 2 3 4 3 2 1
// * 2 3 4 3 2
// * * 3 4 3
// * * * 4

// Example Input/Output 2:
// Input:
// 5

// Output:
// 1 2 3 4 5 4 3 2 1
// * 2 3 4 5 4 3 2
// * * 3 4 5 4 3
// * * * 4 5 4 
* * * * 5


import java.util.*;
public class Inverted_Pyramid
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),star=1,rev=1;
        for(int i=1;i<=a;i++)
        {
            int temp=i;
            if(i>1)
            {
                for(int j=1;j<=star;j++)
                    System.out.print("*"+" ");
                star++;
            }
            for(int j=i;j<=a;j++)
            {
                System.out.print(temp+" ");
                temp++;
            }
            for(int j=a-1;j>=rev;j--)
                System.out.print(j+" ");
            rev++;
            System.out.println();
        }
    }
}