// The program must accept an integer matrix containing only 1 's and O's as the
// input The program must sort the rows of the matrix based on the decimal
// equivalent of each row. Then the program must print the modified matrix as the
// output.

// Boundary Condition(s):
// 2 <= R, c <= 25

// Input Format:
// The first line contains R and C separated by a space.
// The next R lines, each contain C integers separated by a space.

// Output Format:
// The first R lines, each contain C integers separated by a space.

// Example Input/Output 1:
// Input:
// 5 3
// 1 1 1
// 0 1 0
// 0 1 0
// 1 0 0
// 0 1 1

// Output:
// 0 1 0
// 0 1 0
// 0 1 1
// 1 0 0
// 1 1 1

// Explanation:
// The decimal equivalent of the ISt row (1 1 1) is 7.
// The decimal equivalent of the 2nd row (0 1 0) is 2.
// The decimal equivalent of the 3rd row (0 1 0) is 2.
// The decimal equivalent of the 4th row (1 0 0) is 4.
// The decimal equivalent of the 5th row (0 1 1) is 3.
// After sorting the rows based on their decimal equivalent, the matrix becomes
// 0 1 0
// 0 1 0
// 0 1 1
// 1 0 0
// 1 1 1
// Example Input/Output 2:
// Input:
// 25
// 1 0 1 0 1
// 0 0 1 1 1

// Output:
// 0 0 1 1 1
// 1 0 1 0 1


import java.util.*;
public class Sort_Rows_Binary_Matrix 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        int row=obj.nextInt(),col=obj.nextInt();
        int[][] mat=new int[row][col];
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                mat[i][j]=obj.nextInt();
        for(int i=0;i<row;i++)
        {
            String temp="";
            for(int j=0;j<col;j++)
                temp+=String.valueOf(mat[i][j]);
            int val=Integer.valueOf(temp,2);
            list.add(val);
        }
        int val=1;
        while(val<=list.size())
        {
            int min=Integer.MAX_VALUE,index=-1;
            for(int i=0;i<list.size();i++)
            {
                if(list.get(i)<min)
                {
                    min=list.get(i);
                    index=i;
                }
            }
            list.set(index,Integer.MAX_VALUE);
            for(int i=0;i<col;i++)
                System.out.print(mat[index][i]+" ");
            System.out.println();
            val++;
        }
    }
}