// The program must accept an integer matrix of size NXN as the input. The program
// must print the number of rows, where the sum of the integers in the rows is equal
// to the sum of the integers in its corresponding column.

// Boundary Condition(s):
// 1 <= N <=50

// Input Format:
// The first line contains N.
// The next N lines each contain N integers separated by a space.

// Output Format:
// The first line contains an integer as per the given condition.

// Example Input/Output 1:
// Input:
// 3
// 1 2 3
// 3 2 1
// 2 1 4

// Output:
// 1

// Explanation:
// The sum of integers in the ISt row is 6 (1+2+3).
// The sum of integers in the ISt column is 6 (1+3+2).
// The sum of integers in the 2nd row is 6 (3+2+1).
// The sum of integers in the 2nd column is 5 (2+2+1).
// The sum of integers in the 3rd row is 7 (2+1+4).
// The sum of integers in the 3rd column is 8 (3+1+4).
// Here the ISt row and the ISt column have the equal sum. So the count is 1.
// Hence the output is 1

// Example Input/Output 2:
// Input:
// 2
// 1 2
// 2 1

// Output:
// 2

import java.util.*;
public class Count_Of_Rows_And_Columns_Equal_sum[RWD] 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),count=0;
        int[][] mat=new int[N][N];
        for(int i=0;i<N;i++)
            for(int j=0;j<N;j++)
                mat[i][j]=obj.nextInt();
        for(int i=0;i<N;i++)
        {
            int row=0,col=0;
            for(int j=0;j<N;j++)
            {
                row+=mat[i][j];
                col+=mat[j][i];
            }
            if(row==col)
                count++;
        }
        System.out.print(count);
    }
}