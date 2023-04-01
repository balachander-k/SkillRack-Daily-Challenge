// The program must accept an integer matrix of size RxC as the input. For each
// integer, the program must print the sum of the elements which are present on its
// right and below the current element as the output. The elements in the last
// column have no element on their right and the elements in the last row have no
// elements below them. So consider the available elements to print the sum. The
// element which is present in the Rth row and Cth column has no element on its
// right and below it, so print the same as the output.

// Boundary Condition(s):
// 2 <= R, c <= 100

// Input Format:
// The first line contains two integers R and C separated by a space.
// The next R lines contain C integers separated by space(s).

// Output Format:
// The first R lines contain C integers separated by space.

// Example Input/Output 1:
// Input:
// 3 3
// 10 20 30
// 15 25 35
// 80 70 60

// Output:
// 35 55 35
// 105 105 60
// 70 60 60

// Explanation:
// For element 10, the right side and the below elements are 20 and 15 and their
// sum is 35. So 35 is printed.
// For element 20, the right side and the below elements are 30 and 25 and their
// sum is 55. So 55 is printed.
// For element 30, the element present below is 35. So 35 is printed.
// For element 1 5, the right side and the below elements are 25 and 80 and their
// sum is 105. So 105 is printed.
// For element 25, the right side and the below elements are 35 and 70 and their
// sum is 105. So 105 is printed.
// For element 35, the below element is 60. So 60 is printed.
// For element 80, the right side element is 70. So 70 is printed.
// For element 70, the right side element is 60. So 60 is printed.
// For element 60, there is no element on its right and down. So 60 is printed.

// Example Input/Output 2:
// Input:
// 5 4
// 10 20 30 40
// 11 12 13 14
// 50 60 70 80
// 21 22 23 24
// 15 25 35 45

// Output:
// 31 42 53 14
// 62 73 84 80
// 81 92 103 24
// 37 48 59 45
// 25 35 45 45


import java.util.*;
public class Sum_Of_Right_And_Below_Elements
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=obj.nextInt(),sum=0,num1=0,num2=0;
        int[][] mat=new int[a][b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                mat[i][j]=obj.nextInt();
            }
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                try 
                {
                    if(j+1>=b)
                        sum=mat[i+1][j];
                    if(i+1>=a)
                        sum=mat[i][j+1];
                    if((i+1<a) && (j+1<b))
                        sum=mat[i+1][j]+mat[i][j+1];
                    System.out.print(sum+" ");
                }
                catch(Exception e)
                {
                    System.out.print(mat[a-1][b-1]);
                }
            }
            sum=0;
            System.out.println();
        }
    }
}