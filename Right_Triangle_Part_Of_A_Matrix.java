// The program must accept an integer matrix of size NXN as the input. The program
// must print the right-triangle part of the matrix as shown in the Example
// Input/Output section.

// Note: The value of N is always odd.
// Boundary Condition(s):
// 3 <=N < = 49

// Input Format:
// The first line contains N.
// The next N lines each contain N integers separated by a space.

// Output Format:
// The first N lines contain the right-triangle part of the matrix as shown in the
// Example Input/Output section.

// Example Input/Output 1:
// Input:
// 5
// 1 6 8 9 4
// 9 2 7 7 4
// 5 1 5 7 2
// 8 5 9 6 3
// 3 5 9 6 4

// Output:
// * * 4
// * 7 4
// 5 7 2
// * 6 3
// * * 4

// Example Input/Output 2:
// Input:
// 7
// 71 89 28 62 17 21 36
// 94 41 22 15 60 92 23
// 18 37 84 78 73 39 97
// 50 50 94 41 90 58 44
// 66 44 68 23 62 87 37
// 43 79 25 51 83 66 12
// 51 19 68 99 61 60 66

// Output:
// * * * 36
// * * 92 23
// * 73 39 97
// 41 90 58 44 
// * 62 87 37
// * * 66 12
// * * * 66

import java.util.*;
public class Right_Triangle_Part_Of_A_Matrix 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),s=(n/2)+1,t=1;
        int[][] mat=new int[n][n];
        
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                mat[i][j]=obj.nextInt();
                
        for(int i=0;i<s;i++)
        {
            int k=n-t;
            for(int j=s-1;j>1;j--)
                System.out.print("*"+" ");
            for(int j=0;j<=i;j++)
            {
                System.out.print(mat[i][k]+" ");
                k++;
            }
            t++;
            System.out.println();
        }
        int r=s,q=n/2;
        for(int i=1;i<=s-1;i++)
        {
            int k=n-q;
            for(int j=1;j<=s-1;j++)
                System.out.print("*"+" ");
            for(int j=1;j<=s-i;j++)
            {
                System.out.print(mat[r][k]+" ");
                k++;
            }
            r++;
            q--;
            System.out.println();
        }
    }
}