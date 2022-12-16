// The program must accept an integer matrix of size NxN and an integer K as the input. The program must remove the first K rows and the first K columns from the matrix. Then the program must print the modified matrix as the output.

// Boundary Condition(s);
// 2<= N <=50
// -999 <= Each element of the matrix <=999
// 1<= K <=N

// Input Format:
// The first line contains the value of N.
// The next N line each contain N integers separated by space(s).
// The (N+2)th line contains the value of K.

// Output Format:
// The first N-K lines each contain N-K integers of the modified matrix  separated by a space.

// Example Input/Output 1:
// Input:
// 4
// 20 2 10 16
// 20 17 11 6
// 14 16 1 3
// 10 2 17 4
// 2

// Output:
// 1 3 
// 17 4

// Explanation:
// Here the value of K is 2. So remove the first 2 rows and the first 2 columns from the matrix.
// Hence the output is
// 1 3
// 17 4

// Example Input/Output 2:
// Input:
// 5 
// 77 62 21 47 44
// 45 64 61 91 64 
// 44 12 63 22 57
// 31 58 57 99 44
// 72 40 34 29 61
// 1

// Output:
// 64 61 91 64 
// 12 63 22 57
// 58 57 99 44
// 40 34 29 61



import java.util.*;
public class Remove_First_K_Rows_And_Columns
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int[][] matrix=new int[a][a];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                matrix[i][j]=obj.nextInt();
            }
        }
        int num=obj.nextInt();
        int check=0;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                if((i<num) || (j<num))
                    continue;
                else 
                {
                    System.out.print(matrix[i][j]+" ");
                    check=1;
                }
            }
            if(check==1) System.out.println();
            check=0;
        }
    }
}