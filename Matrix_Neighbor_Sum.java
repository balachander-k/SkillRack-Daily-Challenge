// The program must accept an integer matrix of size NXN as the input. The program must
// replace each integer in the matrix by the sum of all four adjacent integers. Finally, the
// program must print the modified matrix as the output.
// If any of the four adjacent integers are not available then the integer must be printed
// without any change.

// Boundary Condition(s):
// 2 <= N <= 50

// Input Format:
// The first line contains N.
// The next N lines each contain N integers separated by space(s).

// Output Format:
// The first N lines each contain N integers separated by a space.

// Example Input/Output 1:
// Input:
// 4
// 14 18 15 16
// 3 16 5 10
// 4 9 12 2
// 9 4 13 4

// Output:
// 14 18 15 16
// 3 35 53 10
// 4 36 29 2
// 9 4 13 4

// Explanation:
// There are four integers having all 4 adjacent integers.
// The sum of adjacent for the elements 16 is 18 + 3 + 9 + 5 = 35
// The sum of adjacent for the elements 5 is 15 + 16 + 12 + 10 = 53
// The sum of adjacent for the elements 9 is 16 + 4 + 4 + 12 = 36
// The sum of adjacent for the elements 12 is 5 + 9 + 13 + 2 = 29


// Example Input/Output 2:
// Input:
// 5
// 16 13 22 38 45
// 13 48 50 15 17
// 24 49 23 48 38
// 38 38 41 31 45
// 42 23 27 33 35

// Output:
// 16 13 22 38 45
// 13 125 108 153 17
// 24 133 188 107 38
// 38 151 119 167 45
// 42 23 27 33 35


import java.util.*;
public class Matrix_Neighbor_Sum
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),sum=0;
        int[][] mat=new int[a][a];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                mat[i][j]=obj.nextInt();
            }
        }
        int len=a-2;
        for(int i=0;i<=0;i++)
        {
            for(int j=0;j<a;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=len;i++)
        {
            for(int j=0;j<a;j++)
            {
                if(j==0 || j==a-1)
                {
                    System.out.print(mat[i][j]+" ");
                }
                else 
                {
                    sum=mat[i+1][j]+mat[i-1][j]+mat[i][j+1]+mat[i][j-1];
                    System.out.print(sum+" ");
                }
            }
            System.out.println();
        }
        int l=a-1;
        for(int i=l;i<=l;i++)
        {
            for(int j=0;j<a;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}