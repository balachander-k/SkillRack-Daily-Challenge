// The program must accept an integer matrix of size RxC as the input. The program
// must print the count of the common elements in all the rows of a given matrix as
// the output.

// Boundary Condition(s):
// 1 <= R, c < = 100
// 1 <= Each Integer Value <= 1000

// Input Format:
// The first line contains two integers R and C separated by a space.
// The next R lines contain C integers separated by space(s).

// Output Format:
// The first line contains the count of the common elements in all the rows.

// Example Input/Output 1:
// Input:
// 3 4
// 10 11 12 15
// 12 15 30 10
// 16 10 12 11

// Output:
// 2

// Explanation:
// The common elements in the matrix are 10 and 12
// 10 11 1215
// 12 15 30 10
// 16 10 12 11
// Hence the output is 2

// Example Input/Output 2:
// Input:
// 4 4
// 10 20 30 40
// 20 40 80 50
// 15 10 35 40
// 40 30 10 15

// Output:
// 1


import java.util.*;
public class Common_Elements_All_Rows
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=obj.nextInt(),count=0;
        int[][] mat=new int[a][b];
        int[] d=new int[1000];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                int val=obj.nextInt();
                mat[i][j]=val;
                d[val]++;
            }
        }
        for(int i=0;i<1000;i++)
            if(d[i]>=a)
                count++;
        System.out.print(count);
    }
}