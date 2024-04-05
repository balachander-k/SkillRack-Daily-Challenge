// The program must accept an integer matrix of size NXN as the input. The program
// must print the product of the sum of integers in the diagonals (left and right
// diagonals) of the matrix as the output.

// Boundary Condition(s):
// 3 <= N <= 50

// Input Format:
// The first line contains N.
// The next N lines, each containing N integers separated by a space.

// Output Format:
// The first line contains the product of the sum of integers in the diagonals (left and
// right diagonals) of the matrix.

// Example Input/Output 1:
// Input:
// 4
// 6 7 9 2
// 2 4 4 1
// 9 3 9 1
// 1 3 9 9

// Output:
// 280

// Explanation:
// The sum of integers in the left diagonal is 28 (6 + 4 + 9 + 9).
// The sum of integers in the right diagonal is 10 (2 + 4 + 3 +1).
// So the product of 28 and 10 is 280.
// Hence the output is 280

// Example Input/Output 2:
// Input:
// 3
// 1 2 3
// 4 5 6
// 7 8 9

// Output:
// 225


import java.util.*;
public class Product_Sum_Of_Diagonals
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),right=0,left=0;
        int[][] mat=new int[N][N];
        for(int i=0;i<N;i++)
            for(int j=0;j<N;j++)
                mat[i][j]=obj.nextInt();
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                if(i==j)
                    right+=mat[i][j];
                if((i+j)==N-1)
                    left+=mat[i][j];
            }
        }
        System.out.print(right*left);
    }
}