// The program must accept an integer N as the input. The program must form an integer
// matrix of size NxN. Then the program must fill the integers in the matrix from N to (N * N)
// + N - 1. The integers in the matrix must be filled from the top row to the bottom row,
// where each row is filled from left to right. Then the program must transpose the matrix and
// reverse the even rows of the transposed matrix. Finally, the program must print the modified
// matrix as the output.

// Boundary Condition(s):
// 100

// Input Format:
// The first line contains N.

// Output Format:
// The first N lines, each contains N integers separated by a space.

// Example Input/Output 1:
// Input:
// 3

// Output:
// 3 6 9
// 10 7 4
// 5 8 11

// Explanation:
// Here N = 3, so an integer matrix of size 3x3 is formed.
// 3 4 5 
// 6 7 8
// 9 10 11

// After transposing the matrix, it becomes
// 3 6 9
// 4 7 1
// 5 8 11


// After reversing the even rows of the transposed matrix, it becomes
// 3 6 9
// 10 7 4
// 5 8 11

// Example Input/Output 2:
// Input:
// 6

// Output:
// 6 12 18 24 30 36
// 37 31 25 19 13 7
// 8 14 20 26 32 38
// 39 33 27 21 15 9
// 10 16 22 28 3440
// 41 35 29 23 17 11


import java.util.*;
public class Transpose_Matrix_And_Reverse_Rows
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),t=n;
        int[][] mat=new int[n][n],trans=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                mat[i][j]=t++;
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                trans[i][j]=mat[j][i];
        for(int i=0;i<n;i++)
        {
            int o=0;
            if(i%2!=0)
                for(int j=n-1;j>=0;j--)
                    mat[i][o++]=trans[i][j];
            else 
                for(int j=0;j<n;j++)
                    mat[i][j]=trans[i][j];
        }
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                System.out.print((j==n-1)?mat[i][j]+"\n":mat[i][j]+" ");
    }
}