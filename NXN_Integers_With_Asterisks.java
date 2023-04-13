// The program must accept an integer N as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Example Input/Output 1:
// Input:
// 3

// Output:
// **1
// *23
// 456

// Example Input/Output 2:
// Input:
// 4

// Output:
// ***1
// **23
// *456
// 78910


import java.util.*;
public class NXN_Integers_With_Asterisks
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=a-1,t=1,index=1;
        for(int i=0;i<a;i++)
        {
            for(int j=b;j>=1;j--)
                System.out.print("*");
            for(int k=0;k<index;k++)
            {
                System.out.print(t);
                t++;
            }
            System.out.println();
            b--;
            index++;
            
        }
    }
}