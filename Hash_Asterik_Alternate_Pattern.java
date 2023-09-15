// The program must accept an integer N as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary condition(s):
// 2 <= N <= 100

// Input Format:
// The first line contains N.

// Output Format:
// The first N lines contain the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 4

// Output:
// #*#*
// *#*#
// #*#*
// *#*#

// Example Input/Output 2:
// Input:
// 5

// Output:
// #*#*#
// *#*#*
// #*#*#
// *#*#*
// #*#*#


import java.util.*;
public class Hash_Asterik_Alternate_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        for(int i=1;i<=size;i++)
        {
            for(int j=1;j<=size;j++)
            {
                if(i%2!=0 && j%2!=0)
                    System.out.print("#");
                if(i%2!=0 && j%2==0)   
                    System.out.print("*");
                if(i%2==0 && j%2!=0)
                    System.out.print("*");
                if(i%2==0 && j%2==0)
                    System.out.print("#");
            }
            System.out.println();
        }
    }
}