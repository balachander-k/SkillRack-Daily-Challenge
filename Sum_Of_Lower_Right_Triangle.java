// The program must accpet an integer matrix of size MxN as the input. The program must print the sum of elements in the lower right triangle o the matrix as the output.

// Boundary Condition(s);
// 2<= N <=50
// 1<= Matrix Element Value <=999

// Input Format:
// The first line contains the integer N.
// The next N lines each contain N integers separated by sapce(s).

// Output Format:
// The first line contains the sum of elements in the lower right triangle of the matrix.

// Example Input/Output 1:
// Input:
// 3
// 1 2 3
// 4 5 6
// 7 8 9


// Output:
// 38

// Explanation:
// The elements in the lower right triangle of the matrix are
// * * 3
// * 5 6
// 7 8 9
// The sum of elements in the lower right triangle of the matrix is 38(3+5+6+7+8+9).
// Hence the output is 38

// Example Input/Output 2:
// Input:
// 4
// 4 7 1 1
// 5 4 9 8
// 5 7 0 5
// 2 9 8 3

// Output:
// 52



import java.util.*;
public class Sum_Of_Lower_Right_Triangle
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int[][] mat=new int[a][a];
        int val=0,sum=0;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                mat[i][j]=obj.nextInt();
            }
        }
        for(int i=a-1;i>=0;i--)
        {
            for(int j=val;j<a;j++)
            {
                sum=sum+mat[i][j];
            }
            val++;
        }
        System.out.print(sum);
    }
}