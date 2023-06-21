// The program must accept an integer matrix of size RxC and an integer K as the
// input The program must print the desired pattern as shown in the Example
// Input/Output sections.

// Boundary Condition(s):
// 1 <= R, C, K <= 100

// Input Format:
// The first line contains the values of R, C and K separated by space(s).
// The next R lines contain C elements separated by space(s).

// Output Format:
// The first R*K lines contain the desired pattern as shown in the Example
// Input/Output sections.

// Example Input/Output 1:
// Input:
// 2 4 3
// 1 2 5 4
// 6 5 8 7

// Output:
// 1 1 1 2 2 2 5 5 5 4 4 4
// 1 1 1 2 2 2 5 5 5 4 4 4
// 1 1 1 2 2 2 5 5 5 4 4 4
// 6 6 6 5 5 5 8 8 8 7 7 7
// 6 6 6 5 5 5 8 8 8 7 7 7
// 6 6 6 5 5 5 8 8 8 7 7 7

// Example Input/Output 2:
// Input:
// 2 3 2
// 7 9 3
// 4 5 6

// Output:
// 7 7 9 9 3 3 
// 7 7 9 9 3 3
// 4 4 5 5 6 6 
// 4 4 5 5 6 6 

import java.util.*;
public class Expand_Matrix_K_Terms
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int row=obj.nextInt(),col=obj.nextInt(),key=obj.nextInt();
        int[][] mat=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                mat[i][j]=obj.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=1;j<=key;j++)
            {
                int c=0,q=0;
                for(int k=1;k<=(col*key);k++)
                {
                    if(c==key)
                    {
                        ++q;
                        c=0;
                        
                    }
                    System.out.print(mat[i][q]+" ");
                    c++;
                }
                System.out.println();
            }
        }
    }
}