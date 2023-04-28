// The program must accept an integer matrix of size RxC as the input. The program
// must print the matrix in the vertical zig-zag direction as shown in the Example
// Input/Output section.

// Boundary Condition(s):
// 2 <= N <=50

// Input Format:
// The first line contains the values of R and C separated by a space.
// The next R lines contain C integers each separated by space(s).

// Output Format:
// The list of lines containing the integers of the matrix separated by a space as
// shown in the Example Input/Output section.

// Example Input/Output 1:
// Input:
// 3 4
// 1 2 3 4
// 5 6 7 8
// 9 1 2 3

// Output:
// 1 5 9
// 1 6 2
// 3 7 2
// 3 8 4

// Example Input/Output 2:
// Input:
// 6 4
// 89 85 12 65
// 47 37 33 80
// 63 31 85 56
// 28 42 84 76
// 71 17 30 53
// 31 64 85 38

// Output:
// 89 47 63 28 71 31
// 64 17 42 31 37 85
// 12 33 85 84 30 85
// 38 53 76 56 80 65

import java.util.*;
public class Vertical_Zig_Zag_Traversal
{

    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=obj.nextInt();
        int[][] mat=new int[a][b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
                mat[i][j]=obj.nextInt();
        }
        for(int i=0;i<b;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<a;j++)
                    System.out.print(mat[j][i]+" ");
            }
            else 
            {
                for(int k=a-1;k>=0;k--)
                        System.out.print(mat[k][i]+" ");
            }
            System.out.println();
        }
    }
}