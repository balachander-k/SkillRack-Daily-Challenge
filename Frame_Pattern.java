// The program must accept an integer matrix of size MxN as the input. The program must print the desired pattern as shown in the Example Input/Output section.


// Boundary Condition(s);
// 1<= M,N <= 50
// 1<= Each Integer Value <=999

// Input Format:
// The first line contains the integers M and N separated by a space.
// The next M lines each contain N integers separated by space(s).

// Output Format:
// The first M+2 lines contain the desired pattern as shown in the Example Input/Output section.


// Example Input/Output 1:
// Input:
// 3 4
// 8 6 5 8
// 4 8 5 2
// 3 7 6 8

// Output:
// * * * * * *
// * 8 6 5 8 *
// * 4 8 5 2 *
// * 3 7 6 8 *
// * * * * * *

// Example Input/Output 2:
// Input:
// 5 3
// 7 2 4
// 2 5 5
// 4 9 1
// 5 2 6
// 2 9 2

// Output:
// * * * * *
// * 7 2 4 *
// * 2 5 5 *
// * 4 9 1 *
// * 5 2 6 *
// * 2 9 2 *
// * * * * *



import java.util.*;
public class Frame_Pattern 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=obj.nextInt();
        int[][] mat=new int[a][b];
        int count=b+2;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                mat[i][j]=obj.nextInt();
            }
        }
        for(int i=0;i<count;i++)
            System.out.print("*"+" ");
        System.out.println();
        for(int i=0;i<a;i++)
        {
            System.out.print("*"+" ");
            for(int j=0;j<b;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.print("*"+" ");
            System.out.println();
        }
        for(int i=0;i<count;i++)
            System.out.print("*"+" ");
    }
}