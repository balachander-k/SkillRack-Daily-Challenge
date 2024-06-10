// The program must accept an integer matrix of size NXN as the input. The program must
// find the maximum number of digits M among the integers in the matrix. For each row, the
// program must separate the digits in all the integers and the integers with less number of
// digits than M must be padded with asterisks. Then the program must form a new matrix of
// size (M*N)x(M*N) based on the following conditions.
// - For each row, the integers in the row are printed M times (in a separate line).
// - In the first line, the first row is printed as it is.
// - In the second line, each digit in the integer is replaced with the next digit and the last digit
// is replaced with an asterisk.
// - In the third line, each digit in the integer is replaced with the next digit and the last digit is
// replaced with an asterisk and so on.
// - In the (M+1)St line, the second row is printed as it is.
// - In the (M+2) line, each digit in the integer is replaced with the next digit and the last
// digit is replaced with an asterisk and so on.
// Boundary Condition(s):
// 2 <= N <= 50
// 1 <= Matrix element value <=10^9

// Input Format:
// The first line contains N.
// The next N lines, each contains N integers separated by a space.

// Output Format:
// The first M*N lines containing the new matrix.

// Example Input/Output 1:
// Input:
// 3
// 6 70 42
// 13 4 576
// 76 100 15

// Output:
// 6 * * 7 0 * 4 2 * 
// * * * 0 * * 2 * * 
// * * * * * * * * *
// 1 3 * 4 * * 5 7 6 
// 3 * * * * * 7 6 * 
// * * * * * * 6 * * 
// 7 6 * 1 0 0 1 5 *
// 6 * * 0 0 * 5 * * 
// * * * 0 * * * * * 

// Explanation:
// In the given 3x3 matrix, the integers with the maximum number of digits are 576 and 100.
// So the value of M = 3.
// After separating the digits and padding asterisks in each integer, the matrix becomes

// Explanation:
// In the given 3x3 matrix, the integers with the maximum number of digits are 576 and 100.
// So the value of M = 3.
// 3
// 6** 70* 42*
// 13* 4** 576
// 76* 100 15*

// 6 * * 7 0 * 4 2 * 
// * * * 0 * * 2 * * 
// * * * * * * * * *
// 1 3 * 4 * * 5 7 6 
// 3 * * * * * 7 6 * 
// * * * * * * 6 * * 
// 7 6 * 1 0 0 1 5 *
// 6 * * 0 0 * 5 * * 
// * * * 0 * * * * * 




import java.util.*;
public class Digit_sub_Matrix_Pattern 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),max=Integer.MIN_VALUE;
        String[][] mat=new String[N][N];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                mat[i][j]=obj.next();
                if(mat[i][j].length()>max)
                    max=mat[i][j].length();
            }
        }
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                String temp="";
                if(mat[i][j].length()<max)
                {
                    for(int k=1;k<=Math.abs(mat[i][j].length()-max);k++)
                        temp+="*";
                    mat[i][j]=mat[i][j]+temp;
                }
            }
        }
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<max;j++)
            {
                for(int k=0;k<N;k++)
                {
                    String t=mat[i][k];
                    if(j==0)
                        for(int r=0;r<t.length();r++)
                            System.out.print(t.charAt(r)+" ");
                    else 
                    {
                        int c=0;
                        if(t.charAt(j)!='*')
                        {
                            for(int r=j;r<t.length();r++)
                            {
                                System.out.print(t.charAt(r)+" ");
                                c++;
                            }
                            for(int r=c;r<=max;r++)
                                System.out.print("*"+" ");
                        }
                        else 
                            for(int r=0;r<max;r++)
                                System.out.print("*"+" ");
                    }
                }
                System.out.println();
            }
        }
    }
}