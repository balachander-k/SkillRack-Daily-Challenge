// The program must accept an integer N as the input, The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 1 <= N <= 100

// Input Format:
// The first line contains the value of N.

// Output Format:
// The first N lines contain the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 4

// Output:
// *a*b*c*d*
// -1-2-3-4-
// *e*f*g*h*
// -5-6-7-8-

// Example Input/Output 2:
// Input:
// 7

// Output:
// *a*b*c*d*e*f*g*
// -1-2-3-4-5-6-7-
// *h*i*j*k*l*m*n*
// -8-9-10-11-12-13-14-
// *o*p*q*r*s*t*u*
// -15-16-17-18-19-20-21-
// *v*w*x*y*z*a*b*


import java.util.*;
public class Alphabets_And_Number_Alternate_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),temp=1,ascii=97;
        for(int i=1;i<=a;i++)
        {
            if(i%2==0)
            {
                for(int j=1;j<=a;j++)
                {
                    System.out.print("-"+temp);
                    temp++;
                }
                System.out.println("-");
            }
            else 
            {
                for(int j=1;j<=a;j++)
                {
                    if(ascii>122)
                        ascii=97;
                    System.out.print("*"+(char)ascii);
                    ascii++;
                }
                System.out.println("*");
            }
        }
    }
}