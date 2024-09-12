// The program must accept an integer matrix of size NXN as the input. The integers in the
// first row of the matrix are always unique and their values range from 1 to N. For each
// integer X in the first row of the matrix, the program must print the row as a column as
// the output.

// Boundary Condition(s):
// 2 <= N <= 50

// Input Format:
// The first line contains N.
// The next N lines, each contains N integers separated by a space.

// Output Format:
// The first N lines, each contains N integers separated by a space.

// Example Input/Output 1:
// Input:
// 3
// 3 1 2
// 8 9 10
// 4 2 6

// Output:
// 4 3 8
// 2 1 9  
// 6 2 10

// Explanation:
// The integers in the first row are 3, 1 and 2.
// Thel integer is 3, so the 3rd row is printed as the ISt column.
// The 2nd integer is 1, so thel row is printed as the 2nd column.
// The 3rd integer is 2, so the 2nd row is printed as the 3rd column.

// Example Input/Output 2:
// Input:
// 5
// 3 5 4 1 2
// 8 2 6 19 7
// 1 9 6 6 2
// 11 54 12 39 12
// 8 9 2 3 4

// Output:
// 1 8 11 3 8
// 9 9 54 5 2
// 6 2 12 4 6
// 6 3 39 1 19
// 2 4 12 2 7

// Explanation:
// The integers in the first row are 3, 5, 4, 1 and 2.
// Thel integer is 3, so the 3rd row is printed as the ISt column.
// The 2nd integer is 5, so the 5th row is printed as the 2nd column.
// The 3rd integer is 4, so the 4th row is printed as the 3rd column.
// The 4th integer is 1, so thel row is printed as the 4th column.
// The 5th integer is 2, so the 2nd row is printed as the 5 column.

// Example Input/Output 3:
// Input:
// 4
// 2 3 1 4
// 16 57 13 66
// 30 96 15 30
// 10 71 54 50

// Output:
// 16 30 2 10
// 57 96 3 71
// 13 15 1 54 
// 66 30 4 50 


import java.util.*;
public class Matrix_Row_To_Columns
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        int[][] mat=new int[N][N],chan=new int[N][N];
        for(int i=0;i<N;i++)
            for(int j=0;j<N;j++)
                mat[i][j]=obj.nextInt();
        for(int i=0;i<N;i++)
        {
            int temp=mat[0][i];
            for(int j=0;j<N;j++)
                chan[j][i]=mat[temp-1][j];
        }
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }
    }
}