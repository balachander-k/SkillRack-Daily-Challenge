// The program must accept an integer matrix of size RxC and an integer X as the
// input The program must reverse last X integers in each row. Finally, the program
// must print the modified matrix as the output.

// Boundary condition(s):
// 1 < = 100

// Input Format:
// The first line contains two integers R and C separated by a space.
// The next R lines contain C integers separated by space(s).
// The last line contains the integer X.

// Output Format:
// The first R lines contain C integers separated by space(s).

// Example Input/Output 1:
// Input:
// 35
// 44 12 12 47 37
// 18 18 11 11 19
// 38 27 23 40 14
// 3


// Output:
// 44 12 37 47 12
// 18 18 1911 11
// 38 27 14 40 23

// Explanation:
// The Last three integers in the ISt row are 12, 47 and 37. Reverse those integers
// and then print them as the output.
// 44 12
// The Last three integers in the 2nd row are 11, 11 and 19. Reverse those integers
// and then print them as the output.
// 44 12 3747 12
// 18 18
// The Last three integers in the 3rd row are 23, 40 and 14. Reverse those integers
// and then print them as the output.
// 44 12 37 47 12
// 18 18 19 11 11
// 38 27 14 40 23

// Example Input/Output 2:
// Input:
// 3 3
// 1 2 3
// 4 5 6
// 7 8 9
// 2

// Output:
// 1 3 2
// 4 6 5
// 7 9 8



import java.util.*;
public class Reverse_Last_X_Integers
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int row=obj.nextInt(),col=obj.nextInt();
        int[][] mat=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                mat[i][j]=obj.nextInt();
            }
        }
        int key=obj.nextInt(),sub=Math.abs(key-col);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<sub;j++)
                System.out.print(mat[i][j]+" ");
            for(int k=col-1;k>=sub;k--)
                System.out.print(mat[i][k]+" ");
            System.out.println();
        }
    }
}