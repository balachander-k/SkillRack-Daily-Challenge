// The program must accept an integer N as the input. The program must print the desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s);
// 1<=N<=100

// Input Format:
// The first line contains the value of N.

// Output Format:
// The first N lines containing the desired pattern as shown in the Example Input/Output section.

// Example Input/Output 1:
// Input:
// 5

// Output:
// 1
// 22
// 3*3
// 4**4
// 5***5

// Example Input/Output 2:
// Input:
// 7

// Output:
// 1
// 22
// 3*3
// 4**4
// 5***5
// 6****6
// 7*****7


import java.util.*;
public class Asterisk_Triangle_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int temp=1;
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((j==1) ||(j==i))
                    System.out.print(temp);
                else
                    System.out.print("*");
            }
            temp++;
            System.out.println();
        }
    }
}