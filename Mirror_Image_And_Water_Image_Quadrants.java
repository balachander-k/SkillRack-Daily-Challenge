// The program must accept an integer matrix of size RxC as the input. The program must
// modify the matrix based on the following conditions.
// - The top-right quadrant of the matrix is replaced with the mirror image of the top-left
// quadrant.
// - Then the bottom-left quadrant of the matrix is replaced with the water image of the top-
// left quadrant.
// - Then the bottom-right quadrant of the matrix is replaced with the mirror image of the
// bottom-left quadrant.
// Finally, the program must print the modified matrix as the output.
// Note: The values of R and C are always even.

// Boundary Condition(s):
// 2 <= R, C <= 50

// Input Format:
// The first line contains R and C separated by a space.
// The next R lines, each contains C integers separated by a space.

// Output Format:
// The first R lines, each contains C integers separated by a space.

// Example Input/Output 1:
// Input:
// 4 6
// 49 16 50 47 28 50
// 43 44 12 32 37 12
// 33 26 37 48 25 37
// 31 48 41 19 16 16

// Output:
// 49 16 50 50 16 49
// 43 44 12 12 44 43
// 43 44 12 12 44 43
// 49 16 50 50 16 49

// Explanation:
// After replacing the top-right quadrant of the matrix with the mirror image of the top-left
// quadrant, the matrix becomes
// 49 16 50 50 16 49
// 43 44 12 12 44 43
// 33 26 37 48 25 37
// 31 48 41 19 16 16

// After replacing the bottom-left quadrant of the matrix with the water image of the top-left
// quadrant, the matrix becomes
// 49 16 50 50 16 49
// 43 44 12 12 44 43
// 43 44 12 48 25 37
// 49 16 50 19 16 16

// After replacing the bottom-right quadrant of the matrix with the mirror image of the
// bottom-left quadrant, the matrix becomes
// 49 16 50 50 16 49
// 43 44 12 12 44 43
// 43 44 12 12 44 43
// 49 16 50 50 16 49


// Example Input/Output 2:
// Input
// 6 6
// 65 35 64 63 88 85
// 45 14 17 54 45 33
// 46 58 32 35 76 54
// 88 71 39 92 20 86
// 71 66 96 34 96 57
// 59 10 46 62 22 22

// Output:
// 65 35 64 64 35 65
// 45 14 17 17 14 45
// 46 58 32 32 58 46
// 46 58 32 32 58 46
// 45 14 17 17 14 45
// 65 35 64 64 35 65

import java.util.*;
public class Mirror_Image_And_Water_Image_Quadrants
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int r=obj.nextInt(),c=obj.nextInt(),qr=r/2,qc=c/2,u=qr,g=qr;
        int[][] mat=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                mat[i][j]=obj.nextInt();
        for(int i=0;i<qr;i++)
        {
            int t=qc;
            for(int j=qc;j<c;j++)
                mat[i][j]=mat[i][--t];
        }
        for(int i=qr;i<r;i++)
        {
            u=u-1;
            for(int j=0;j<qc;j++)
                mat[i][j]=mat[u][j];
        }
        for(int i=qr;i<r;i++)
        {
            g=g-1;
            for(int j=qc;j<c;j++)
                mat[i][j]=mat[g][j];
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }
    }
}