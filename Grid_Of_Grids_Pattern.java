// The program must accept the size of two grids(RxC and MxN) as the input. The
// program must print the MXN grid of RxC grids of asterisks as shown in the
// Example Input/Output section.

// Boundary Condition(s):
// 2 <= R, C, M, N <= 20

// Input Format:
// The first line contains R and C separated by a space.
// The second line contains M and N separated by a space.

// Output Format:
// The lines containing the MXN grid of RxC grids of asterisks as shown in the

// Example Input/Output 1.
// Input:
// 2 3 
// 4 4

// Output:
// ***|***|***|***
// ***|***|***|***
// ---+---+---+---
// ***|***|***|***
// ***|***|***|***
// ---+---+---+---
// ***|***|***|***
// ***|***|***|***
// ---+---+---+---
// ***|***|***|***
// ***|***|***|***

// Example Input/Output 2.
// Input:
// 3 3 
// 3 2 

// Outuput:
// ***|***
// ***|***
// ***|***
// ---+---
// ***|***
// ***|***
// ***|***
// ---+---
// ***|***
// ***|***
// ***|***



import java.util.*;
public class Grid_Of_Grids_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int r=obj.nextInt(),c=obj.nextInt();
        int m=obj.nextInt(),n=obj.nextInt();
        int row=r*m,col=c*n,count=0;
        for(int i=0;i<row;i++)
        {
            int u=0,q=0;
            if(count==r)
            {
                for(int j=1;j<=col;j++)
                {
                    if(c==q)
                    {
                        System.out.print("+");
                        q=0;
                    }
                    q++;
                    System.out.print("-");
                }
                count=0;
                System.out.println();
            }
            for(int j=1;j<=col;j++)
            {
                if(c==u)
                {
                    System.out.print("|");
                    u=0;
                }
                u++;
                System.out.print("*");
            }
            System.out.println();
            count++;
        }
    }
}