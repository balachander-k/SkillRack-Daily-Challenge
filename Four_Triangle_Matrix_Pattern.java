// The program must accept an even integer N as the input. The program must print
// the desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 4 <= N < = 50

// Input Format:
// The first line contains N.
// Output Format:
// The first N lines contain the pattern as shown in the Example Input/Output section.

// Example Input/Output 1:
// Input:
// 4

// Output:
// * * * +
// # * + + 
// # # - +
// # - - - 

// Example Input/Output 2:
// Input:
// 6

// Output:
// * * * * * +
// # * * * + + 
// # # * + + +
// # # # - + +
// # # - - - +
// # - - - - - 

import java.util.*;
public class Four_Triangle_Matrix_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt(),part=size/2,temp=part;
        int hash=0,star=size-1,plus=1,mins=1;
        for(int i=1;i<=part;i++)
        {
            for(int j=1;j<=star;j++)
            {
                if(hash>=j)
                    System.out.print("#"+" ");
                else
                    System.out.print("*"+" ");
            }
            for(int j=1;j<=i;j++)
                System.out.print("+"+" ");
            star--;
            hash++;
            System.out.println();
        }
        for(int i=1;i<=part;i++)
        {
            for(int j=1;j<=temp;j++)
                System.out.print("#"+" ");
            for(int j=1;j<=mins;j++)
                System.out.print("-"+" ");
            if(star!=0)
                for(int j=1;j<=star;j++)
                    System.out.print("+"+" ");
            star--;
            temp--;
            mins=mins+2;
            System.out.println();
        }
    }
}