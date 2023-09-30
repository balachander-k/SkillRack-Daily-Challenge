
// The program must accept an integer matrix of size RxC as the input. The program
// must print YES if all the integers in the border of the matrix are even. Else the
// program must print NO as the output.

// Boundary Condition(s):
// 2 <= R, c <= 100

// Input Format:
// The first line contains R and C.
// The next R lines each contain C integers separated by a space.

// Output Format:
// The first line contains YES or NO.

// Example Input/Output 1:
// Input:
// 3 4
// 86 76 78 10
// 84 21 83 38
// 44 10 94 36

// Output:
// YES

// Explanation:
// In the 3x4 matrix, all the integers in the border of the matrix are even.
// 86 76 78 10
// 84 21 83 38
// 44 1O 94 36
// Hence the output is YES

// Example Input/Output 2:
// Input:
// 5 4
// 2 3 7 9
// 4 4 2 5
// 5 8 8 2
// 2 4 3 8
// 7 2 1 3

// Output:
// NO

import java.util.*;
public class Even_Border_Matrix
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int row=obj.nextInt(),col=obj.nextInt(),border=0,even=0;
        int[][] mat=new int[row][col];
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                mat[i][j]=obj.nextInt();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(j==0 || i==0 || j==col-1 || i==row-1)
                {
                    border++;
                    if(mat[i][j]%2==0)
                        even++;
                }
                
            }
        }
        System.out.print((border==even)?"YES":"NO");
    }
}