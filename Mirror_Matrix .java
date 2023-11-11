// The program must accept an integer matrix of size RxC as the input. The program
// must print the mirror image of the matrix as the output.

// Boundary Condition(s):
// 1 <= R,C <=100

// Input Format:
// The first line contains R and C separated by a space.
// The next R lines each contain C integers separated by a space.

// Output Format:
// The first R lines each contain C integers representing the mirror image of the
// matrix.

// Example Input/Output 1:
// Input:
// 2 3
// 1 2 3
// 4 5 6

// Output:
// 3 2 1
// 6 5 4

// Example Input/Output 2:
// Input:
// 4 4
// 10 54 78 96
// 36 59 24 87
// 82 69 23 64
// 16 26 87 12

// Output:
// 69 87 45 01
// 78 42 95 63
// 46 32 96 28
// 21 78 62 61


import java.util.*;
public class Mirror_Matrix 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int row=obj.nextInt(),col=obj.nextInt();
        String[][] mat=new String[row][col];
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                mat[i][j]=obj.next();
        for(int i=0;i<row;i++)
        {
            for(int j=col-1;j>=0;j--)
            {
                String temp=mat[i][j];
                for(int k=temp.length()-1;k>=0;k--)
                    System.out.print(temp.charAt(k));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}