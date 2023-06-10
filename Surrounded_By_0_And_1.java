// The program must accept an integer matrix of size NXN containing only 0's and I's
// as the input The program must print the count of 0's which are surrounded by 1 's
// on all four sides and the count of I's which are surrounded by 0's on all four sides
// as the output.

// Boundary Condition(s):
// 1 <= N <= 100

// Input Format:
// The first line contains N.
// The next N lines contain N integers each separated by a space.

// Output Format:
// The first line contains two integers separated by a space as the per the given
// condition.

// Example Input/Output 1:
// Input:
// 5
// 0 1 0 1 0
// 1 0 1 0 1
// 0 1 0 1 0
// 0 0 1 0 0
// 0 0 0 0 0

// Output:
// 3 4
// Explanation:
// The 0's which are surrounded by four I's are at the following postions (2,2), (2,4)
// and (3,3).
// The I's which are surrounded by four 0's are at the following positions (2,3), (3,2),
// (3,4) and (4,3).
// Example Input/Output 2:
// Input:
// 6
// 0 0 1 1 1 0
// 0 1 0 1 0 1
// 1 0 1 1 0 1
// 0 1 1 0 0 0
// 1 1 1 0 1 0
// 0 1 0 0 0 0

// Output:
// 2 2

import java.util.*;
public class Surrounded_By_0_And_1
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt(),zero=0,one=0;
        int[][] mat=new int[size][size];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                mat[i][j]=obj.nextInt();
            }
        }
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                int value=mat[i][j];
                if((j!=0 && j!=size-1) && (i!=0 && i!=size-1))
                {
                    if(value==0)
                    {
                        if(mat[i-1][j]==1 && mat[i+1][j]==1 && mat[i][j-1]==1 && mat[i][j+1]==1)
                            zero++;
                    }
                    if(value==1)
                    {
                        if(mat[i-1][j]==0 && mat[i+1][j]==0 && mat[i][j-1]==0 && mat[i][j+1]==0)
                            one++;
                    }
                }
            }
        }
        System.out.print(zero+" "+one);
    }
}