// The program must accept an integer matrix of size NXN as the input. The matrix is
// set to be a symmetric matrix if the transpose Of the original matrix is equal to the
// original matrix. The program must print YES if the given matrix is a symmetric matrix.
// Else the program must print NO as the output.

// Boundary Condition(s):
// 1 <= N <= 100

// Input Format:
// The first line contains the integer N.
// The next N lines contain N integers separated by space.

// Output Format:
// The first line contains either YES or NO.

// Example Input/Output 1:
// Input:
// 4
// 2 5 9 1
// 5 4 0 7
// 9 0 8 6
// 1 7 6 3

// Output:
// YES

// Explanation:
// The original matrix 		The Transposed Matrix
// 2 5 9 1							2 5 9 1
// 5 4 0 7 							5 4 0 7
// 9 0 8 6 							9 0 8 6
// 1 7 6 3 							1 7 6 3

// Both the matrices are equal.
// Hence the output is YES

// Example Input/Output 2:
// Input:
// 3
// 3 9 4
// 9 2 1
// 4 8 2

// Output
// NO



import java.util.*;
public class Symmertric_Matrix
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),trans=0,count=0;
        int[][] matrix=new int[a][a];
        int[][] transpose=new int[a][a];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                matrix[i][j]=obj.nextInt();
            }
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                transpose[i][j]=matrix[j][i];
            }
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                if(matrix[i][j]==transpose[i][j])
                    count++;
            }
            if(count==a)
                trans++;
            count=0;
        }
        if(trans==a)System.out.print("YES");
        else System.out.print("NO");
    }
}