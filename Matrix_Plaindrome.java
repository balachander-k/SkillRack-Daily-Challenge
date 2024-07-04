// The program must accept an integer matrix of size RxC as the input. The program must
// print YES if every row and every column of the matrix is a palindrome. Else the program
// must print NO as the output.

// Boundary Condition(s):
// 2 <= R, c <= 50
// 1 <= Matrix element value <= 1000

// Input Format:
// The first line contains R and C separated by a space.
// The next R lines, each contains C integers separated by a space.

// Output Format:
// The first line contains the string value "YES" or "NO".

// Example Input/Output 1:
// Input:
// 4 4
// 1 2 2 1
// 2 3 3 2
// 2 3 3 2
// 1 2 2 1

// Output:
// YES

// Explanation:
// In the given 4x4 matrix, every row and every column is a palindrome.
// So YES is printed.

// Example Input/Output 2:
// Input:
// 3 5
// 2 4 3 4 2
// 3 7 8 7 3
// 5 6 1 6 5

// Output:
// NO

// Example Input/Output 3:
// Input:
// 67 77 77 67
// 48 74 74 48
// 53 95 95 53
// 48 74 74 48
// 67 77 77 67

// Output:
// YES


import java.util.*;
public class Matrix_Plaindrome
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int r=obj.nextInt(),c=obj.nextInt(),rowplain=0,colplain=0;
        int[][] mat=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                mat[i][j]=obj.nextInt();
        for(int i=0;i<r;i++)
        {
            String row="",rowr="";
            for(int j=0;j<c;j++)
                row+=String.valueOf(mat[i][j]);
            for(int j=c-1;j>=0;j--)
                rowr+=String.valueOf(mat[i][j]);
            if(row.equals(rowr))rowplain++;
        }
        for(int i=0;i<c;i++)
        {
            String col="",colp="";
            for(int j=0;j<r;j++)
                col+=String.valueOf(mat[j][i]);
            for(int j=r-1;j>=0;j--)
                colp+=String.valueOf(mat[j][i]);
            if(col.equals(colp))colplain++;
        }
        System.out.print((rowplain==r) && (colplain==c)?"YES":"NO");
    }
}