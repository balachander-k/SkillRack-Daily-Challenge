// The program must accept an integer matrix of size RxC as the input. The program must sort
// the columns of the matrix based on the largest integer in the columns in ascending order. If
// more than one columns have the same largest integer then sort those columns in the order
// of their occurrence. Finally, the program must print the modified matrix as the output.

// Boundary Condition(s):
// 2 <= R, c <= 100
// 1 <= Matrix element value <= 10^4

// Input Format:
// The first line contains R and C separated by a space.
// The next R lines, each contains C integers separated by a space.

// Output Format:
// The first R lines, each contains C integers of the modified matrix separated by a space.

// Example Input/Output 1:
// Input:
// 4 5
// 3 9 8 4 3
// 2 1 3 2 1
// 7 4 8 2 1
// 4 3 8 3 6

// Output:
// 4 3 3 8 9
// 2 1 2 3 1
// 2 1 7 8 4
// 3 6 4 8 3

// Explanation:
// The largest integer in the 1
// The largest integer in the 2
// The largest integer in the 3
// The largest integer in the 4
// The largest integer in the 5
// column of the matrix is 7.
// column of the matrix is 9.
// column of the matrix is 8.
// column of the matrix is 4.
// column of the matrix is 6.
// After sorting all the columns of the matrix in ascending order based on the largest integer,
// the matrix becomes
// 4 3 3 8 9
// 2 1 2 3 1
// 2 1 7 8 4
// 3 6 4 8 3

// Example Input/Output 2:
// Input
// 3 7
// 6 7 11 20 12 13 17
// 1 10 5 4 10 16 17
// 16 18 15 8 12 3 17

// Output:
// 12 11 6 13 17 7 20
// 10 5 1 16 17 10 4
// 12 15 16 3 17 18 8




import java.util.*;
public class Column_Sort_Largest_Integer
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> asc=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> ind=new ArrayList<Integer>();
        ArrayList<Integer> num=new ArrayList<Integer>();
        int row=obj.nextInt(),col=obj.nextInt();
        int[][] mat=new int[row][col];
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                mat[i][j]=obj.nextInt();
        for(int i=0;i<col;i++)
        {
            int max=Integer.MIN_VALUE;
            for(int j=0;j<row;j++)
                if(mat[j][i]>max)
                    max=mat[j][i];
            num.add(max);ind.add(i);
        }
        while(!num.isEmpty() && !ind.isEmpty())
        {
            int index=0,min=Integer.MAX_VALUE,f=0,q=0;
            ArrayList<Integer> l=new ArrayList<Integer>();
            for(int j=0;j<num.size();j++)
            {
                if(num.get(j)<min){
                    min=num.get(j);
                    index=j;
                }
            }
            num.remove(index);
            f=ind.remove(index);
            for(int j=0;j<row;j++)
                l.add(mat[j][f]);
            asc.add(l);
        }
        int[][] dup=new int[col][row];
        for(int i=0;i<col;i++)
            for(int j=0;j<row;j++)
                dup[i][j]=asc.get(i).get(j);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
                System.out.print(mat[j][i]+" ");
            System.out.println();
        }
    }
}