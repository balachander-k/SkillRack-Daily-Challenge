// The program must accept an integer matrix of size RxC as the input. The program
// must modify the matrix by swapping the rows in zig-zag fashion based on the
// following conditions.

// - The first half of the ISt row must be swapped with the second half of the Rth row.
// - The second half of the 2nd row must be swapped with the first half of the (R-l)th
// row.
// - The first half of the 3rd row must be swapped with the second half of the (R-2)th
// row.
// - The second half of the 4th row must be swapped with the first half of the (R-3)th
// row.
// - Similarly, the program must swap the remaining rows till (R/2)th row in the
// matrix.
// Finally, the program must print the modified matrix as the output.
// Note: The values of R and C are always even.

// Boundary Condition(s):
// 2 <= R, C <= 100

// Input Format:
// The first line contains R and C separated by a space.
// The next R lines, each contains C integers separated by a space.

// Output Format:
// The first R lines, each contains C integers separated by a space.



// Example Input/Output 1:
// Input:
// 6 8
// 83 27 59 55 25 13 38 80
// 40 33 13 69 72 31 39 13
// 11 13 40 51 14 27 33 50
// 54 49 31 45 10 22 75 59
// 75 47 18 60 33 20 61 68
// 73 38 14 19 28 70 76 55

// Output:
// 28 70 76 55 25 13 38 80
// 40 33 13 69 75 47 18 60
// 10 22 75 59 14 27 33 50
// 54 49 31 45 11 13 40 51
// 72 31 39 13 33 20 61 68
// 73 38 14 19 83 27 59 55

// Explanation:
// Here R = 6 and C = 8.
// The integers swapped in the rows are highlighted below.
// 28 70 76 55 25 13 38 80
// 40 33 13 69 75 47 18 60
// 10 22 75 59 14 27 33 50
// 54 49 31 45 11 13 40 51
// 72 31 39 13 33 20 61 68
// 73 38 14 19 83 27 59 55


// Example Input/Output 2:
// Input:
// 8 4
// 51 66 14 71
// 82 88 87 19
// 36 72 61 78
// 81 63 68 74
// 49 45 59 40
// 20 48 75 79
// 32 23 24 60
// 25 26 27 83

// Output:
// 27 83 14 71
// 82 88 32 23
// 75 79 61 78
// 81 63 49 45
// 68 74 59 40
// 20 48 36 72
// 87 19 24 60
// 25 26 51 66





import java.util.*;
public class Zig_Zag_Swap_Rows  
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int r=obj.nextInt(),c=obj.nextInt(),t=r;
        int[][] mat=new int[r][c],swap=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                mat[i][j]=obj.nextInt();
        for(int i=0;i<r;i++)
        {
            int row=r-i-1;
            if(i%2==0)
            {
                int sec=c/2;
                for(int j=0;j<c/2;j++)
                    swap[i][j]=mat[row][sec++];
                for(int j=c/2;j<c;j++)
                    swap[i][j]=mat[i][j];
            }
            else 
            {
                int fir=0;
                for(int j=0;j<c;j++)
                    swap[i][j]=mat[i][j];
                for(int j=c/2;j<c;j++)
                    swap[i][j]=mat[row][fir++];
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
                System.out.print(swap[i][j]+" ");
            System.out.println();
        }
    }
}