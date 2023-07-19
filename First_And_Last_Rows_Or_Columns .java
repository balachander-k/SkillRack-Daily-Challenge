// The program must accept an integer matrix of size NXN as the input. If N is odd
// then the program must print the integers in the first and last rows of the matrix as
// the output. Else the program must print the integers in the first and last columns
// of the matrix as the output.

// Boundary Condition(s):
// 2 <= N <= 100

// Input Format:
// The first line contains the integer N.
// The next N lines contain N integers separated by space(s).

// Output Format:
// The first line contains either first row or first column integers in the matrix.
// The second line contains either last row or last column integers in the matrix.

// Example Input/Output 1:
// Input:
// 4
// 10 20 40 50
// 90 30 80 70
// 25 45 35 65
// 60 55 15 85

// Output:
// 10 90 25 60
// 50 70 65 85

// Explanation:
// N = 4, Here 4 is even.
// So the first column elements 10, 90, 25 and 60 are printed.
// Then the last column elements are 50, 70, 65 and 85 are printed.

// Example Input/Output 2:
// Input:
// 3
// 9 8 2
// 6 2 3
// 4 7 5

// Output:
// 9 8 2
// 4 7 5

import java.util.*;
public class First_And_Last_Rows_Or_Columns 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int[][] mat=new int[size][size];
        for(int i=0;i<size;i++)
            for(int j=0;j<size;j++)
                mat[i][j]=obj.nextInt();
        if(size%2==0)
        {
            for(int i=0;i<size;i++)
            {
                for(int j=0;j<size;j++)
                    if(i==0 || i==size-1)
                        System.out.print(mat[j][i]+" ");
                if(i==0 || i==size-1)
                    System.out.println();
            }
        }
        else 
        {
            for(int i=0;i<size;i++)
            {
                for(int j=0;j<size;j++)
                    if(i==0 || i==size-1)
                        System.out.print(mat[i][j]+" ");
                if(i==0 || i==size-1)
                    System.out.println();
            }
        }
    }
}