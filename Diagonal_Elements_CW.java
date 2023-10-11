// The program must accept an integer matrix of size NXN as the input. The program
// must print all the diagonal elements of the matrix in circularly clockwise direction
// as the output.

// Boundary Condition(s):
// 2 <= N <= 100

// Input Format:
// The first line contains N.
// The next N lines contain N integers each separated by a space.

// Output Format:
// The first line contains all the diagonal elements of the matrix separated by a space.

// Example Input/Output 1:
// Input:
// 4
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16

// Output:
// 1 4 16 13 6 7 11 10

// Explanation:
// In the 4x4 matrix, all the diagonal elements are highlighted below
// 1 2 3 4 
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16
// So the diagonal elements are printed in the circularly clockwise direction.
// Hence the output is 1 4 16 13 6 7 11 10

// Example Input/Output 1:
// Input:
// 3
// 10 20 30
// 40 50 60
// 70 80 90

// Output:
// 10 30 90 70 50

import java.util.*;
public class Diagonal_Elements_CW
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[][] mat=new int[n][n];
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                mat[i][j]=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                    list.add(mat[i][j]);
                if((i+j==n-1) && (i!=j))
                    list.add(mat[i][j]);
                   
            }
        }
        int i=0,j=list.size()-1;
        while(i<j)
        {
            System.out.print(list.get(i)+" "+list.get(i+1)+" ");
            System.out.print(list.get(j)+" "+list.get(j-1)+" ");
            i=i+2;
            j=j-2;
        }
        if(n%2!=0)
            System.out.print(list.get(i));
    }
}