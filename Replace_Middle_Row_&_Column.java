// The program must accept an integer matrix of size RxC (where R and C are always
// odd) as the input. The program must replace all the integers in the middle row and
// the middle column by + (plus). Then the program must print the modified matrix
// as the output.

// Boundary Condition(s):
// 3 R c < = 99
// 0 <= Each integer value <= 100

// Input Format:
// The first line contains R and C separated by a space.
// The next R lines each contain C integers separated by a space.

// Output Format:
// The first R lines contain the modified matrix based on the given conditions.

// Example Input/Output 1:
// Input:
// 5 5
// 1 2 3 4 5
// 5 4 8 6 1
// 2 4 8 6 0
// 8 7 9 5 6
// 2 3 5 4 7

// Output:
// 1 2 + 4 5
// 5 4 + 6 1
// 8 7 + 5 6
// 2 3 + 4 7

// Example Input/Output 2:
// Input:
// 3 7
// 12 45 65 98 23 75 12
// 78 86 93 74 85 53 76
// 45 98 23 56 81 92 74

// Output:
// 12 45 65 + 23 75 12
// + + + + + + +
// 45 98 23 + 81 92 74

import java.util.*;
public class Replace_Middle_Row_&_Column
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int r=obj.nextInt(),c=obj.nextInt(),rd=r/2,cd=c/2;
        int[][] mat=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                mat[i][j]=obj.nextInt();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(j==cd || i==rd)
                    System.out.print("+"+" ");
                else 
                    System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}