// The program must accept an integer N as the input. The program must find the
// factors of N and print the desired pattern as shown in the Example Input/Output
// section.

// Boundary Condition(s):
// 1 <= N <=1000

// Input Format:
// The first line contains N.

// Output Format:
// The lines contain the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 6

// Output:
// 1 1 1 1 1 1 1 
// 1 2 2 2 2 2 1
// 1 2 3 3 3 2 1
// 1 2 3 6 3 2 1
// 1 2 3 3 3 2 1
// 1 2 2 2 2 2 1
// 1 1 1 1 1 1 1 

// Example Input/Output 2:
// Input:
// 7

// Output:
// 1 1 1
// 1 7 1
// 1 1 1

import java.util.*;
public class Factors_Box_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),count=0,o=1,odd=1;
        for(int i=1;i<=N;i++)
            if(N%i==0)count++;
        while(o<count)
        {
            odd+=2;
            o++;
        }
        int[][] mat=new int[odd][odd];
        int f=0,l=odd,r1=0,c2=odd-1,h=odd/2;
        for(int i=1;i<=N;i++)
        {
            if(N%i==0)
            {
                int q=r1,c1=r1,v=r1,k=r1;
                while(q<l)
                    mat[r1][q++]=i;
                while(c1<l)
                    mat[c1++][f]=i;
                while(v<l)
                    mat[v++][c2]=i;
                while(k<l)
                    mat[c2][k++]=i;
                r1++;
                f++;
                c2--;
                l--;
            }
        }
        for(int i=0;i<odd;i++)
        {
            for(int j=0;j<odd;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }
    }
}