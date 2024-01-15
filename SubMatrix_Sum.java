// The program must accept an integer matrix of size RxC and four integers X 1, YI,
// X2 and Y2 as the input. X 1, YI, X2 and Y2 represent the indices of the top-left
// integer and bottom-right integer of a submatrix. The program must print the
// submatrix that can be formed using the given indices and the sum of the integers
// in the submatrix as the output. If it is not possible to form such a submatrix, the
// program must print -1 as the output.
// Note: The index of the top-left integer in the given RxC matrix is always (0, 0).

// Boundary Condition(s):
// 2 <= R, c < = 100
// -1000 <= Matrix element value <= 1000
// 0 <= Xl,Y1,X2,Y2 <= 100

// Input Format:
// The first line contains R and C separated by a space.
// The next R lines, each containing C integers separated by a space.
// The (R+2)nd line contains X 1, YI, X2 and Y2 separated by a space.

// Output Format:
// The lines contain the integer value(s) based on the given conditions.

// Example Input/Output 1:
// Input:
// 4 5
// 1 2 3 4 6
// 5 3 8 1 2
// 4 6 7 5 5
// 2 4 8 9 4
// 2 0 3 4

// Output:
// 4 6 7 5 5
// 2 4 8 9 4
// 5 4

// Explanation:
// The index of the top-left integer in the submatrix is (2, O).
// The index of the bottom-right integer in the submatrix is (3, 4).
// So the integers in the submatrix are 4, 6, 7, 5, 5, 2, 4, 8, 9 and 4.
// The sum of integers in the submatrix is 54.

// Example Input/Output 2:
// Input:
// 4 3
// 1 6 8
// 8 9 7
// 4 6 6
// 0 0 2
// 1 1 2 3

// Output:
// -1

import java.util.*;
public class SubMatrix_Sum
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>(); 
        int r=obj.nextInt(),c=obj.nextInt(),sum=0,s=0;
        int[][] mat=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                mat[i][j]=obj.nextInt();
        int x1=obj.nextInt(),y1=obj.nextInt(),x2=obj.nextInt(),y2=obj.nextInt();
        for(int i=0;i<r;i++)
        {
            ArrayList<Integer> temp=new ArrayList<Integer>();
            for(int j=0;j<c;j++)
            {
                if((i>=x1 && j>=y1) && (i<=x2 && j<=y2))
                    temp.add(mat[i][j]);
                if((i==x1 && j==y1)||(i==x2 && j==y2))
                    s++;
            }
            if(!temp.isEmpty())
                list.add(temp);
        }
        if(s==2)
        {
            for(int i=0;i<list.size();i++)
            {
                for(int j=0;j<list.get(i).size();j++)
                {
                    sum+=list.get(i).get(j);
                    System.out.print(list.get(i).get(j)+" ");
                }
                System.out.println();
            }
            System.out.print(sum);
        }
        else 
            System.out.print("-1");
    }
}