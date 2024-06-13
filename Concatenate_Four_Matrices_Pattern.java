// The program must accept an integer matrix of size NXN as the input. The program must
// form a large matrix by concatenating the given NXN matrix as four quadrants. Then the
// program must modify the large matrix based on the following conditions.
// - The program must replace the integers with asterisks which are present below the bottom-
// left to the top-right diagonal in the top-left quadrant.
// - The program must replace the integers with asterisks which are present below the top-left
// to the bottom-right diagonal in the top-right quadrant
// - The program must replace the integers with asterisks which are present above the top-left
// to the bottom-right diagonal in the bottom-left quadrant.
// - The program must replace the integers with asterisks which are present above the
// bottom-left to the top-right diagonal in the bottom-right quadrant.
// Finally, the program must print the modified large matrix as the output.

// Boundary Condition(s):
// 2 <= N <= 50
// 1 <= Matrix element value <= 100

// Input Format:
// The first line contains N.
// The next N lines, each contains N integers separated by a space.

// Output Format:
// The first 2*N lines containing the large matrix.

// Example Input/Output 1:
// Input :
// 3
// 1 2 3
// 4 5 6
// 7 8 9

// Output:
// 1 2 3 1 2 3
// 4 5 * * 5 6
// 7 * * * * 9
// 1 * * * * 3
// 4 5 * * 4 6
// 7 8 9 7 8 9 

// Explanation:
// The large matrix formed by concatenating the given 3x3 matrix is given below.
// 1 2 3 1 2 3 
// 4 5 6 4 5 6
// 7 8 9 7 8 9
// 1 2 3 1 2 3
// 4 5 6 4 5 6
// 7 8 9 7 8 9

// After replacing the integers with asterisks based on the given conditions, the large matrix
// becomes
// 1 2 3 1 2 3
// 4 5 * * 5 6
// 7 * * * * 9
// 1 * * * * 3
// 4 5 * * 4 6
// 7 8 9 7 8 9 



import java.util.*;
public class Concatenate_Four_Matrices_Pattern 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        int[][] mat=new int[N][N];
        for(int i=0;i<N;i++)
            for(int j=0;j<N;j++)
                mat[i][j]=obj.nextInt();
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
                System.out.print((i+j)>N-1?"* ":mat[i][j]+" ");
            for(int j=0;j<N;j++)
                System.out.print((j<i)?"* ":mat[i][j]+" ");
            System.out.println();
        }
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
                System.out.print((j>i)?"* ":mat[i][j]+" ");
            for(int j=0;j<N;j++)
                System.out.print((i+j)<N-1?"* ":mat[i][j]+" ");
            System.out.println();
        }
    }
}