// The program must accept an integer matrix of size NXN as the input. The program
// must reverse the integers in the opposite diagonal of the matrix. Finally, the
// program must print the modified matrix as the output.

// Boundary Condition(s):
// 2 <= N <=50

// Input Format:
// The first line contains the integer N.
// The next N lines contain N integers separated by space(s).
// Output Format:
// The first N lines contain N integers separated by space.

// Example Input/Output 1:
// Input:
// 4
// 1 2 3 8
// 5 6 2 8
// 3 7 4 5
// 4 6 4 3

// Output:
// 1 2 3 4
// 5 6 7 8
// 3 2 4 5
// 8 6 4 3

// Explanation:
// The integers in the opposite diagonal are
// 1 2 3 8
// 5 6 2 8
// 3 7 4 5
// 4 6 4 3
// After the reversing the integers in the opposite diagonal, the output matrix is
// 1 2 3 4
// 5 6 7 8
// 3 2 4 5
// 8 6 4 3


// Example Input/Output 2:
// Input:
// 3
// 1 2 3
// 4 5 6
// 7 8 9


// Output:
// 1 2 7 
// 4 5 6
// 3 8 9



import java.util.*;
public class Reverse_Opposite_Diagonal
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        int[][] mat=new int[N][N];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                mat[i][j]=obj.nextInt();
            }
        }
        int row=N-1,col=0;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                if((i+j)==N-1)
                    System.out.print(mat[row][col]+" ");
                else 
                    System.out.print(mat[i][j]+" ");
            }
            row--;
            col++;
            System.out.println();
        }
    }
}