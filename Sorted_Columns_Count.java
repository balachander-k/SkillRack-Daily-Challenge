// The program must accept an integer matrix of size RxC as the input. The program must
// print the count of columns in the matrix where the integers are sorted in descending order
// as the output.

// Boundary Condition(s):
// 2 <= R, c <=50

// Input Format:
// The first line contains R and C separated by a space.
// The next R lines, each contains C integers separated by a space.

// Output Format:
// The first line contains the count of columns where the integers are sorted in descending
// order in the matrix.

// Example Input/Output 1:
// Input:
// 5 4 
// 12 100 67 89
// 61 88 59 79
// 86 35 46 65
// 37 30 25 36
// 32 25 13 32

// Output:
// 3

// Explanation:
// 12 100 67 89
// 61 88 59 79
// 86 35 46 65
// 37 30 25 36
// 32 25 13 32
// In the given 5x4 matrix, the integers in the 2 , 3 and 4
// columns are in descending order.
// So 3 is printed as the output.

// Example Input/Output 2:
// Input:
// 4 4
// 31 73 29 87
// 77 44 66 46
// 90 9 10 44
// 3 1 39 34

// Output:
// 2


import java.util.*;
public class Sorted_Columns_Count 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int r=obj.nextInt(),c=obj.nextInt(),d=0;
        int[][] mat=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                mat[i][j]=obj.nextInt();
        for(int i=0;i<c;i++)
        {
            int count=0;
            for(int j=0;j<r-1;j++)
                if(mat[j][i]>mat[j+1][i])
                    count++;
            if(count==r-1)d++;
        }
        System.out.print(d);
    }
}