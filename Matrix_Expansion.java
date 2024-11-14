// The program must accept an integer matrix of size RxC and two integers M, N as
// the input. The program must form a big matrix, where the number of rows is R*M
// and the number of columns is C*N. Then the program must fill each submatrix of
// size RxC in the big matrix with the given RxC matrix.

// Boundary Condition(s):
// 2 < R,C < 50
// 1 <= Matrix element value <= 1000
// 1 < M, N < 10

// Input Format:
// The first line contains R and C separated by a space.
// The first R lines, each contains C integers separated by a space.
// The (R+2)nd line contains M and N separated by a space.

// Output Format:
// The first R*M lines, each contains C*N integers separated by a space.

// Example Input/Output 1:
// Input:
// 3 3
// 6 3 1
// 3 4 7
// 3 6 8
// 2 2

// Output:
// 6 3 1 6 3 1
// 3 4 7 3 4 7
// 3 6 8 3 6 8
// 6 3 1 6 3 1
// 3 4 7 3 4 7
// 3 6 8 3 6 8

// Explanation:
// Here R = 3, C = 3, M = 2 and N = 2.
// So the size of the big matrix is 6x6 (3*2 x 3*2) and it is given below.
// 6 3 1 6 3 1
// 3 4 7 3 4 7
// 3 6 8 3 6 8
// 6 3 1 6 3 1
// 3 4 7 3 4 7
// 3 6 8 3 6 8

// Example Input/Output 2:
// Input:
// 4 2
// 82 36
// 57 43
// 58 91
// 34 63

// Output:
// 82 36 82 36 82 36 82 36
// 57 43 57 43 57 43 57 43
// 58 91 58 91 58 91 58 91
// 34 63 34 63 34 63 34 63
// 82 36 82 36 82 36 82 36
// 57 43 57 43 57 43 57 43
// 58 91 58 91 58 91 58 91
// 34 63 34 63 34 63 34 63
// 82 36 82 36 82 36 82 36
// 57 43 57 43 57 43 57 43
// 58 91 58 91 58 91 58 91
// 34 63 34 63 34 63 34 63


import java.util.*;
public class Matrix_Expansion
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int r=obj.nextInt(),c=obj.nextInt();
        int[][] mat=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                mat[i][j]=obj.nextInt();
        int m=obj.nextInt(),n=obj.nextInt(),tr=0,tc=0;
        int[][] sub=new int[r*m][c*n];
        for(int i=0;i<sub.length;i++)
        {
            if(tr>=r)
                tr=0;
            for(int j=0;j<sub[i].length;j++)
            {
                if(tc>=c)
                    tc=0;
                sub[i][j]=mat[tr][tc++];
            }
            tr++;
        }
        for(int i=0;i<sub.length;i++)
        {
            for(int j=0;j<sub[i].length;j++)
                System.out.print(sub[i][j]+" ");
            System.out.println();
        }
    }
}