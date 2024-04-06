// The program must accept an integer matrix of size RxC and an integer K as the
// input The program must print YES if all the integers in the boundary are equal to
// K. Else the program must print NO as the output.

// Boundary Condition(s):
// 2 <= R, C <= 50
// 1 <= K, Matrix element value <= 10^5

// Input Format:
// The first line contains R, C and K separated by a space.
// The next R lines, each containing C integers separated by a space.

// Output Format:
// The first line contains either YES or NO.

// Example Input/Output 1:
// Input:
// 3 4 12
// 12 12 12 12
// 12 88 92 12
// 12 12 12 12

// Output:
// YES

// Explanation:
// Here e 12,
// In the given 3x4 matrix, the boundary integers are highlighted below.
// 12 12 12 12
// 12 88 92 12
// 12 12 12 12
// Here all the integers in the boundary are eaual to 12. so YES is printed as the output

// Example Input/Output 2:
// Input:
// 5 5 10
// 10 10 10 10 10
// 10 73 38 11 20
// 10 19 78 79 10
// 10 33 49 59 30
// 10 99 10 75 10

// Output:
// NO


import java.util.*;
public class Matrix_Boundary_Integers
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int r=obj.nextInt(),c=obj.nextInt(),k=obj.nextInt(),fr=0,lr=0,fc=0,lc=0;
        int[][] mat=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                mat[i][j]=obj.nextInt();
        for(int i=0;i<c;i++)
        {
            if(mat[0][i]==k)fr++;
            if(mat[r-1][i]==k)lr++;
        }
        for(int i=0;i<r;i++)
        {
            if(mat[i][0]==k)fc++;
            if(mat[i][c-1]==k)lc++;
        }
        System.out.print(((fr==c && lr==c) && (fc==r && lc==r))?"YES":"NO");
    }
}