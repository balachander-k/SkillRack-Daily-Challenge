// The program must accept an integer matrix of size RxC containing only I's and O's
// as the input The program must print the maximum number of 1 •s in a single row
// of the matrix as the output.
// Note: There will be at least one 1 in the matrix.

// Boundary Condition(s):
// 2 <= R, c < = 50

// Input Format:
// The first line contains R and C separated by a space.
// The next R lines, each containing C integers separated by a space.

// Output Format:
// The first line contains the maximum number of I's in a single row of the matrix.

// Example Input/Output 1:
// Input:
// 4 5
// 1 1 0 0 1
// 0 0 1 0 0
// 1 1 0 1 1
// 1 0 0 0 0

// Output:
// 4

// Explanation:
// There are four I's in the 3rd row, which is the maximum.
// Hence the output is 4

// Example Input/Output 2:
// Input:
// 6 3
// 0 1 1
// 1 0 1
// 1 1 1
// 1 0 0
// o o o
// 1 1 1

// Output:
// 3


import java.util.*;
public class Maximum_1's_In_Row 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int r=obj.nextInt(),c=obj.nextInt(),row=0;
        int max=Integer.MIN_VALUE;
        int[][] mat=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                mat[i][j]=obj.nextInt();
        for(int i=0;i<r;i++)
        {
            int one=0;
            for(int j=0;j<c;j++)
                if(mat[i][j]==1)one++;
            if(one>max)max=one;
        }
        System.out.print((max));
    }
}