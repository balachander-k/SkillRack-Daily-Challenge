// The program must accept an integer matrix of size RxC as the input. For each
// integer in the matrix, the program must replace all the prime numbers by 1 and all
// the non-prime numbers by 0. Then the program must print the modified matrix as
// the output.

// Boundary Condition(s):
// 1 <= R, C <=100
// 2 <= Each Integer Value <= 10000

// Input Format:
// The first line contains two integers R and C separated by a space.
// The next R lines contain C integers each separated by space(s).

// Output Format:
// The first line R lines contain C integers each separated by a space.

// Example Input/Output 1:
// Input:
// 2 3
// 2 5 9
// 6 8 3

// Output:
// 1 1 0
// 0 0 1

// Explanation:
// In the ISt row and the ISt column of the matrix, 2 is a prime number. So 1 is
// printed.
// In the ISt row and the 2nd column of the matrix, 5 is a prime number. So 1 is
// printed.
// In the ISt row and the 3rd column of the matrix, 9 is not a prime number. So 0 is
// printed.
// In the 2nd row and the ISt column of the matrix, 6 is not a prime number. So 0 is
// printed.
// In the 2nd row and the 2nd column of the matrix, 8 is not a prime number. So 0 is
// printed.
// In the 2nd row and the 3rd column of the matrix, 3 is a prime number. So 1 is
// printed.

// Example Input/Output 2:
// Input:
// 3 4
// 10 20 30 40
// 29 37 73 91
// 50 57 52 53

// Output:
// 0 0 0 0
// 1 1 1 0
// 0 0 0 1

import java.util.*;
public class Prime_Or_Not_Matrix
{
    public static int IsPrime(int x)
    {
        int count=0;
        for(int i=1;i<=x;i++)
            if(x%i==0)
                count++;
        if(count==2)
            return 1;
        return 0;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int row=obj.nextInt(),col=obj.nextInt();
        int[][] mat=new int[row][col];
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                mat[i][j]=obj.nextInt();
                
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                int temp=mat[i][j];
                System.out.print((IsPrime(temp)==1)?"1 ":"0 ");
            }
            System.out.println();
        }
    }
    
}