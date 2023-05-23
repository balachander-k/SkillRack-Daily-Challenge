// The program must accept an integer N as the input The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 1 <= N <= 100

// Input Format:
// The first line contains the value of N.

// Output Format:
// The first N lines containing the desired pattern as shown in the Example

// Input/Output section.
// Example l:
// Input:
// 5

// Output:
// 1*2*3*4*5
// -*2*3*4*
// --2*3*4
// ---*3*
// ----3

// Example Input/Output 2:
// Input:
// 4

// Output:
// 1*2*3*4
// -*2*3*
// --2*3
// ---*


import java.util.*;
public class Inverted_Triangle_Number_With_Asterik 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),temp=a-1,val=2,count=0,inc=0,s=0;
        for(int i=1;i<=a;i++)
        {
            System.out.print(i);
            if(i!=a)
                System.out.print("*");
        }
        System.out.println();
        for(int i=1;i<=a-1;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print("-");
            if(i%2!=0)
            {
                inc=val;
                for(int j=1;j<=temp;j++)
                {
                    System.out.print("*");
                    if(j!=temp)
                    System.out.print(inc);
                    inc++;
                }
                count++;
            }
            if(i%2==0)
            {
                s=val;
                for(int j=1;j<=temp;j++)
                {
                    if(j!=temp)
                    {
                        System.out.print(s);
                        s++;
                    }
                    if(j<temp-1)
                    System.out.print("*");
                }
                count++;
            }
            if(count==2)
            {
                val++;
                temp=temp-2;
                count=0;
            }
            System.out.println();
        }
        
    }
}