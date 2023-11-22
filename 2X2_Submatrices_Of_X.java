// The program must accept an integer matrix of size RxC and an integer X (where X
// has occurred at least once in the matrix) as the input. The program must print all
// submatrices of size 2x2, containing the integer X at least once as shown in the
// Example Input/Output section.

// Boundary Condition(s):
// 2 <= R, c <= 50
// 1 <= Matrix element value, X <= 1000

// Input Format:
// The first line contains R and C separated by a space.
// The next R lines each contain C integers separated by a space.
// The (R+2)nd line contains X.

// Output Format:
// The lines contain the list of 2x2 submatrices containing the integer X as shown in
// the Example Input/Output section.

// Example Input/Output 1:
// Input:
// 4 4
// 10 20 30 40
// 45 78 56 89
// 12 56 23 10
// 48 98 26 55
// 56

// Output:
// 20 30
// 78 56
// 30 40
// 56 89
// 45 78
// 12 56
// 78 56
// 56 23
// 56 89
// 23 10
// 12 56
// 48 98
// 56 23
// 98 26

// Explanation:
// Here X = 56. There are seven 2x2 submatrices containing the integer 56.
// So they are printed as the output.

// Example Input/Output 2:
// Input:
// 5 3
// 5 8 6
// 8 8 2
// 2 9 9
// 8 3 5
// 6 5 7

// Output:
// 8 6
// 8 2
// 8 3
// 6 5


import java.util.*;
public class 2X2_Submatrices_Of_X 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int row=obj.nextInt(),col=obj.nextInt();
        int[][] mat=new int[row][col];
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                mat[i][j]=obj.nextInt();
        int x=obj.nextInt();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                try{
                if(mat[i][j]==x||mat[i][j+1]==x||mat[i+1][j]==x||mat[i+1][j+1]==x)
                {
                    if((i<row&&j<col)&&(i<row&&j+1<col)&&(i+1<row&&j<col)&&(i+1<row&&j+1<col))
                    {
                        System.out.println(mat[i][j]+" "+mat[i][j+1]);
                        System.out.println(mat[i+1][j]+" "+mat[i+1][j+1]);
                    }
                }
                }
                catch(Exception e)
                {
                    break;
                }
            }
        }
    }
}