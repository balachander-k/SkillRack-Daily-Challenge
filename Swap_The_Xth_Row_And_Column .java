// The program must accept an integer matrix of size NXN and an integer X as the
// input The program must swap the integers in the row and the column in
// the matrix. Then the program must print the modified matrix as the output.

// Boundary Condition(s):
// 2 <= N < = 50
// 1 < X <= N

// Input Format:
// The first line contains N.
// The next N lines, each containing N integers separated by a space.
// The (N+2)nd line contains X.

// Output Format:
// The first N lines, each containing N integers of the modified matrix.

// Example Input/Output 1:
// Input:
// 4
// 1 3 0 7
// 2 4 6 8
// 9 1 7 5
// 7 0 0 6
// 2

// Output:
// 1 2 0 7
// 3 4 1 0
// 9 6 7 5
// 7 8 0 6

// Explanation:
// In the given 4x4 matrix, the integers in the 2nd row and the 2nd column are
// highlighted below.
// 1 3 0 7
// 2 4 6 8
// 9 1 7 5
// 7 0 0 6

// After swapping the 2nd row and the 2nd column of the matrix, the matrix becomes
// 1 2 0 7
// 3 4 1 0
// 9 6 7 5
// 7 8 0 6

// Example Input/Output 2:
// Input:
// 5
// 82 62 15 12 57
// 21 65 21 63 11
// 38 56 58 53 67
// 18 59 53 25 35
// 74 30 34 74 33
// 5

// Output:
// 82 62 15 12 74
// 21 65 21 63 30
// 38 56 58 53 34
// 18 59 53 25 74
// 57 11 67 35 33


import java.util.*;
public class Swap_The_Xth_Row_And_Column 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        int[][] mat=new int[N][N];
        for(int i=0;i<N;i++)
            for(int j=0;j<N;j++)
                mat[i][j]=obj.nextInt();
        int x=obj.nextInt();
        for(int i=0;i<N;i++)
        {
            if((i+1)==x)
                for(int j=0;j<N;j++)
                    System.out.print(mat[j][i]+" ");
            else 
            {
                for(int j=0;j<N;j++)
                {
                    if((j+1)==x)
                        System.out.print(mat[j][i]+" ");
                    else 
                        System.out.print(mat[i][j]+" ");
                    
                }
            }
            System.out.println();
        }
    }
}