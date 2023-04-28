// The program must accept an integer matrix of size NXN as the input. The program
// must find the sum S of elements in the main diagonal and the opposite diagonal
// of the matrix. Then the program must replace all the elements in the main
// diagonal and the opposite diagonal by S. Finally, the program must print the
// modified matrix as the output.

// Boundary Condition(s):
// 2 <= N <= 50

// Input Format:
// The first line contains N.
// The next N lines contain N integers each separated by space(S).

// Output Format:
// The first N lines contain N integers of the modified matrix each separated by
// space(s).

// Example Input/Output 1:
// Input:
// 4
// 17 28 47 40
// 24 43 40 43
// 50 38 44 33
// 44 22 46 41

// Output:
// 307 28 47 307
// 24 307 307 43
// 50 307 307 33
// 307 22 46 307

// Explanation:
// The elements in the main diagonal are 17 43 44 and 41
// The elements in the opposite diagonal are 40 40 38 and 44.
// The sum of elements in the main diagonal and the opposite diagonal is 307.
// So all the elements in the main diagonal and the opposite diagonal are replaced
// by 307.

// Hence the output is
// 307 28 47 307
// 24 307 307 43
// 50 307 307 33
// 307 22 46 307

// Example Input/Output 2:
// Input:
// 3
// 49 32 22
// 50 39 23
// 24 47 40

// Output:
// 174 32 174
// 50 174 23
// 17447 174


import java.util.*;
public class Replace_Diagonal_Sum
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),sum=0;
        int[][] mat=new int[a][a];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
                mat[i][j]=obj.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                if((i==j) || (i+j==a-1))
                    sum=sum+mat[i][j];
            }
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                if((i==j) || (i+j==a-1))
                    System.out.print(sum+" ");
                else 
                    System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}