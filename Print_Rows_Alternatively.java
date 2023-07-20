// The program must accept two integer matrices of size RxC as the input. The
// program must print the first row in the first matrix, the second row in the second
// matrix, the third row in the first matrix, the fourth row in the second matix and so
// on.

// Boundary Condition(s):
// 2 <= R, c <= 100

// Input Format:
// The first line contains two integers R and C separated by a space.
// The next 2*R lines contain C integers separated by space(s).

// Output Format:
// The first R lines contain C integers separated by a space.

// Example Input/Output 1:
// Input:
// 4 5
// 1 0 5 12 5
// 4 8 2 6 2
// 7 6 9 5 6
// 10 2 3 4 7
// 4 10 5 5 0
// 2 9 7 1 2
// 12 5 6 0 4
// 7 8 12 4 8

// Output:
// 1 0 5 12 5
// 2 9 7 1 2
// 7 6 9 5 6
// 7 8 12 4 8

// Explanation:
// The ISt row elements in the first matrix are printed as.
// The 2nd row elements in the second matrix are printed as.
// The 3rd row elements in the first matrix are printed as.
// The 4th row elements in the second matrix are printed as.
// Example Input/Output 2:
// Input:
// 3 2
// 8 12
// 22 45
// 8 12
// 10 20
// 40 50
// 70 80

// Output:
// 8 12
// 40 50
// 8 12

import java.util.*;
public class Print_Rows_Alternatively
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int row=obj.nextInt(),col=obj.nextInt();
        int[][] mat1=new int[row][col];
        int[][] mat2=new int[row][col];
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                mat1[i][j]=obj.nextInt();
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                mat2[i][j]=obj.nextInt();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i%2==0)
                    System.out.print(mat1[i][j]+" ");
                else 
                    System.out.print(mat2[i][j]+" ");
            }
            System.out.println();
        }
    }
}