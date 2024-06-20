// The program must accept an integer matrix of size RxC and a character CH as the input. The
// program must modify the matrix based on the following conditions.
// - If CH is D or d, the program must replace each row with the last row in the matrix.
// - If CH is U or u, the program must replace each row with the first row in the matrix.
// - If CH is R or r, the program must replace each column with the last column in the matrix.
// - If CH is L or I, the program must replace each column with the first column in the matrix.
// - For any other values of CH, the program must keep the matrix as it is.

// Finally, the program must print the modified matrix as the output.
// Boundary Condition(s):
// 2 <= R, c <= 50

// Input Format:
// The first line contains R and C separated by a space.
// The next R lines, each contains C integers separated by a space.
// The (R+2)nd line contains CH.

// Output Format

// The first R lines, each contains C integers separated by a space.

// Example Input/Output 1:
// Input:
// 3 3
// 1 2 3
// 4 5 6
// 7 8 9
// D

// Output:
// 7 8 9
// 7 8 9
// 7 8 9

// Explanation:
// Here CH = D.
// So each row is replaced with the last row in the matrix.
// Hence the output is
// 7 8 9
// 7 8 9
// 7 8 9

// Example Input/Output 2:
// Input:
// 4 5
// 66 23 32 59 14
// 82 72 63 41 69
// 23 43 98 59 95
// 63 34 83 13 94
// L

// Output:
// 66 66 66 66 66
// 82 82 82 82 82
// 23 23 23 23 23
// 63 63 63 63 63

// Example Input/Output 3:
// Input:
// 4 3
// 1 2 1
// 3 4 5
// 6 7 8
// 3 5 7
// w

// Output:
// 1 2 1
// 3 4 5
// 6 7 8
// 3 5 7


import java.util.*;
public class Replace_Column_Or_Matrix 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int r=obj.nextInt(),c=obj.nextInt();
        int[][] mat=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                mat[i][j]=obj.nextInt();
        char ch=obj.next().charAt(0);
        if(ch=='d' || ch=='D')
        {
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                    System.out.print(mat[r-1][j]+" ");
                System.out.println();
            }
        }
        else if(ch=='u' || ch=='U')
        {
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                    System.out.print(mat[0][j]+" ");
                System.out.println();
            }
        }
        else if(ch=='r' || ch=='R')
        {
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                    System.out.print(mat[c-1][i]+" ");
                System.out.println();
            }
        }
        else if(ch=='l' || ch=='L')
        {
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                    System.out.print(mat[i][0]+" ");
                System.out.println();
            }
        }
        else
        {
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                    System.out.print(mat[i][j]+" ");
                System.out.println();
            }
        }
    }
}