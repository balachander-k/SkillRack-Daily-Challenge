// The program must accept an integer matrix of size RxC as the input. The program
// must print the number of rows containing the integers in ascending order in the
// matrix.

// Boundary Condition(s):
// 3 <= R, c <=50

// Input Format:
// The first line contains R and C separated by a space.
// The next R lines each contain C integers separated by a space.

// Output Format:
// The first lines contain the number of rows containing the integers in ascending
// order in the matrix.

// Example Input/Output 1:
// Input:
// 4 5
// 4 6 7 8 19
// 1 3 5 7 8
// 3 5 6 12 6
// 5 7 8 9 13

// Output:
// 3

// Explanation:
// In the 4x5 matrix, the integers in the first row, the second row and the fourth row
// are sorted in ascending order.
// First Row = 4678 19
// Second Row = 1 3 5 78
// Fourth Row = 5 78 9 13
// Hence the output is 3

// Example Input/Output 2:
// Input:
// 3 3
// 37 68 79
// 65 52 31
// 56 79 25

// Output:
// 1

import java.util.*;
public class Matrix_Count_Sorted_Rows 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int row=obj.nextInt(),col=obj.nextInt();
        int[][] mat=new int[row][col];
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                mat[i][j]=obj.nextInt();
        for(int i=0;i<row;i++)
        {
            int asc=0;
            for(int j=0;j<col-1;j++)
            {
                if(mat[i][j]<mat[i][j+1])
                    count++;
            }
            if(count==col-1)
                asc++;
        }
        System.out.print(asc);
    }
}