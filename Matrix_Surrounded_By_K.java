// The program must accept an integer matrix of size NXN and an integer K as the
// input The program must surround each integer in the matrix with K and print the
// matrix as shown in the Example Input/Output section.

// Boundary Condition(s):
// 2 <= N <= 25
// 0 <= Each integer value <= 1000

// Input Format:
// The first line contains N.
// The next N lines, each containing N integers separated by a space.
// The (N +2)nd line contains K.

// Output Format:
// The lines containing the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 3
// 1 2 3
// 4 5 6
// 7 8 9
// 0

// Output:
// 0 0 0 0 0 0 0
// 0 1 0 2 0 3 0
// 0 0 0 0 0 0 0
// 0 4 0 5 0 6 0
// 0 0 0 0 0 0 0
// 0 7 0 8 0 9 0
// 0 0 0 0 0 0 0 

// Example Input/Output 2:
// Input:
// 2
// 10 20
// 55 30
// 99

// Output:
// 99 99 99 99 99
// 99 10 99 20 99
// 99 99 99 99 99
// 99 55 99 30 99
// 99 99 99 99 99


import java.util.*;
public class Matrix_Surrounded_By_K
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),s=((N*2)+1),w=0;
        int[][] mat=new int[N][N];
        for(int i=0;i<N;i++)
            for(int j=0;j<N;j++)
                mat[i][j]=obj.nextInt();
        int k=obj.nextInt();
        int[][] nmt=new int[s][s];
        for(int i=0;i<s;i++)
        {
            int q=0;
            for(int j=0;j<s;j++)
            {
                if(i%2==0 || j%2==0)
                    System.out.print(k+" ");
                else 
                    System.out.print(mat[w][q++]+" ");
            }
            if(i%2!=0)w++;
            System.out.println();
        }
    }
}