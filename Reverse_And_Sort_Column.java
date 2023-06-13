// The program must accept an integer matrix of size RxC as the input. The program
// must reverse each integer in the matrix and then the program must sort the integers
// in each column of the matrix in ascending order. Finally, the program must print the
// modified matrix as the output.

// Boundary Condition(s):
// 2 <= R, c <= 100

// Input Format:
// The first line contains two integers R and C separated by a space.
// The next R lines contain C integers separated by space(s).

// Output Format:
// The first R lines contain C integers separated by a space.

// Example Input/Output 1:
// Input:
// 3 4
// 19 23 89 22
// 87 34 45 38
// 100 23 47 29

// Output:
// 1 32 54 22
// 78 32 74 83
// 91 43 98 92

// Explanation:
// After reversing each integer, the matrix becomes
// 91 32 98 22
// 78 43 54 83
// 1 32 74 92

// After sorting each column, the matrx becomes
// 1 32 54 22
// 78 32 74 83
// 91 43 98 92

// Example Input/Output 2:
// Input:
// 5 3
// 26 75 23
// 14 90 25
// 92 48 95
// 80 62 91
// 54 39 24

// Output:
// 8 9 19
// 29 26 32
// 41 57 42
// 45 84 52
// 62 93 59

import java.util.*;
public class Reverse_And_Sort_Column
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int row=obj.nextInt(),col=obj.nextInt();
        int[][] mat=new int[row][col];
        int[][] store=new int[col][row];
        int h=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                mat[i][j]=obj.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                int temp=mat[i][j];
                int rem=0,rev=0;
                while(temp!=0)
                {
                    rem=temp%10;
                    rev=(rev*10)+rem;
                    temp=temp/10;
                }
                mat[i][j]=rev;
            }
            
        }
        for(int i=0;i<col;i++)
        {
            int[] sort=new int[row];
            int k=0,l=0;
            for(int j=0;j<row;j++)
            {
                sort[k]=mat[j][i];
                k++;
            }
            Arrays.sort(sort);
            for(int j=0;j<k;j++)
                store[h][j]=sort[j];
            h++;
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(store[j][i]+" ");
            }
            System.out.println();
        }
    }
}