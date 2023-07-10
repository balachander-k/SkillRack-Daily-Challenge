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
// 1*2*3
// *1*2*
// **1**

// Example Input/Output 2:
// Input:
// 6

// Output:
// 1*2*3*4*5*6
// *1*2*3*4*5*
// **1*2*3*4**
// ***1*2*3***
// ****1*2****
// *****1*****

import java.util.*;
public class // The program must accept an integer N as the input. The program must print the
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
// 1*2*3
// *1*2*
// **1**

// Example Input/Output 2:
// Input:
// 6

// Output:
// 1*2*3*4*5*6
// *1*2*3*4*5*
// **1*2*3*4**
// ***1*2*3***
// ****1*2****
// *****1*****

import java.util.*;
public class Number_And_Asterik_V_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int val=obj.nextInt(),temp=val-1;
        for(int i=1;i<=val;i++)
        {
            if(i==1)
            {
                for(int j=1;j<=val;j++)
                {
                    System.out.print(j);
                    if(j!=val)
                        System.out.print("*");
                }
            }
            else 
            {
                for(int j=1;j<i;j++)
                    System.out.print("*");
                for(int j=1;j<=temp;j++)
                {
                    System.out.print(j);
                    if(j!=temp)
                        System.out.print("*");
                }
                for(int j=1;j<i;j++)
                    System.out.print("*");
                temp--;
            }
            System.out.println();
        }
    }
}
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int val=obj.nextInt(),temp=val-1;
        for(int i=1;i<=val;i++)
        {
            if(i==1)
            {
                for(int j=1;j<=val;j++)
                {
                    System.out.print(j);
                    if(j!=val)
                        System.out.print("*");
                }
            }
            else 
            {
                for(int j=1;j<i;j++)
                    System.out.print("*");
                for(int j=1;j<=temp;j++)
                {
                    System.out.print(j);
                    if(j!=temp)
                        System.out.print("*");
                }
                for(int j=1;j<i;j++)
                    System.out.print("*");
                temp--;
            }
            System.out.println();
        }
    }
}