// The program must accept an integer matrix of size NXN as the input. The program
// must print the desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 1 <= N <= 100
// 1 <= Each element in the first row of the matrix <= N

// Input Format:
// The first line contains the integer N.
// The next N lines contain N integers separated by space(s).

// Output Format:
// The first N lines containing the desired pattern as shown in the Example

// Input/Output section.
// Example Input/Output 1:
// Input:
// 3
// 3 1 2
// 8 9 10
// 4 2 6

// Output:
// 4 3 8
// 2 1 9
// 6 2 10

// Explanation:
// The first element in the ISt row of the input matrix is 3. So the 3rd row elements are
// printed as the 1st column of the output matrix.
// 4
// 2
// 6

// The second element in the ISt row of the input matrix is 1. So the ISt row elements
// are printed as the 2nd column Of the output matrix.
// 4 3
// 2 1
// 6 2

// The third element in the ISt row of the input matrix is 2. So the 2nd row elements are
// printed as the 3rd column of the output matrix.
// 4 3 8
// 2 1 9
// 6 2 10

// Example Input/Output 2:
// Input:
// 5
// 3 5 4 1 2
// 8 2 0 19 7
// 1 9 6 6 2
// 11 54 12 39 12
// 8 9 2 3 4


// Output:
// 1 8 11 3 8
// 9 9 54 5 2
// 6 2 12 4 0
// 6 3 39 1 19
// 2 4 12 2 7

import java.util.*;
public class Matrix_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        int[][] mat=new int[N][N];
        int[][] store=new int[N][N];
        int q=0,r=0;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                mat[i][j]=obj.nextInt();
            }
        }
        for(int i=0;i<N;i++)
        {
            int element=(mat[0][i])-1;
            r=0;
            for(int j=0;j<N;j++)
            {
                store[q][r]=mat[element][j];
                r++;
            }
            q++;
            
        }
        for(int i=0;i<q;i++)
        {
            for(int j=0;j<r;j++)
            {
                System.out.print(store[j][i]+" ");
            }
            System.out.println();
        }
        
    }
}