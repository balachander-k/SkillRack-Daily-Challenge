// The program must accept an integer matrix of size RxC as the input. The program
// must print the column number which has the most number of negative numbers
// in the given matrix as the output. If more than one column have the most number
// of negative numbers then the program must print the first ocurring such column
// number as the output If the matrix does not contain any negative element then
// the program must print -1 as the output.

// Boundary Condition(s):
// I < = R, C < = 100

// Input Format:
// The first line contains two integers R and C separated by a space.
// The next R lines contain C integers separated by space(s).

// Output Format:
// The first line contains either the column number which has the most number
// of negative numbers or -1.

// Example Input/Output 1:
// Input:
// 3 4
// 10 20 11 -12
// -22 -23 89 -79
// -89 10 29 -12

// Output:
// 4

// Explanation:
// The ISt column contains 2 negative numbers.
// The 2nd column contains 1 negative number.
// The 3rd column does not contain any negative number.
// The 4th column contains 3 negative numbers.
// Here, the column 4 has the most number of negative numbers.
// Hence the output is 4.

// Example Input/Output 2:
// Input:
// 3 3
// 11 91 81
// 90 10 20
// 89 88 87

// Output:
// -1

import java.util.*;
public class Maximum_Negative_Elements_Column
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int row=obj.nextInt(),col=obj.nextInt(),count=0,neg=0,c=0;
        int[][] mat=new int[row][col];
        
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                mat[i][j]=obj.nextInt();
                
        for(int i=0;i<col;i++)
        {
            count=0;
            for(int j=0;j<row;j++)
            {
                int temp=mat[j][i];
                if(temp<0)
                    count++;
            }
            if(count>neg)
            {
                neg=count;
                c=i;
            }
        }
        System.out.print((neg==0)?"-1":(c+1));
    }
}