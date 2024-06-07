// The program must accept an integer matrix of size NXN and a string S as the input. The
// program must traverse the matrix spirally in the anti-clockwise direction and replace all the
// odd integers with the alphabets in S. If the number of odd integers is greater than the
// length of S, the program starts replacing the odd integers with the alphabets in S
// circularly(i.e., after the last character, start replacing from the first character in S). Finally, the
// program must print the modified matrix as the output.

// Boundary Condition(s):
// 2 <= N <= 50
// 1 <= Length of S <= 100

// Input Format:
// The first line contains N.
// The next N lines, each contains N integers separated by a space.
// The (N +2)nd line contains S.

// Output Format:
// The first N lines contain the modified matrix separated by a space.

// Example Input/Output 1:
// Input:
// 3
// 7 8 9
// 6 3 4
// 1 5 7
// rock

// Output:
// r 8 r
// 6 o 4
// o c k 

// Explanation:
// In the given 3x3 matrix, the odd integers are highlighted below.
// 7 8 9
// 6 3 4
// 1 5 7
// The number odd integers in the matrix is 6 which is greater than the length of the string
// rock.
// Therefore, when traversing the matrix spirally in the anti-clockwise direction, the odd
// integers and their replacement characters are given below.
// 70k
// 9 -> r (after the last character, start replacing from the first character in S)
// So the matrix becomes
// r 8 r
// 6 o 4
// o c k 
// Example Input/Output 2:
// Input:
// 6
// 12 23 34 4 6 89
// 31 55 45 15 87 91
// 63 74 32 44 98 86
// 23 43 56 87 99 54
// 11 34 56 88 98 45
// 34 44 46 88 67 54
// ENVIRONMENT

// Output:
// 12 E 34 4 6 M
// E N I V N N
// N 74 32 44 98 86
// V T 56 R E 54
// 1 34 56 88 98 0
// 34 44 46 88 R 54

// Example Input/Output 3:
// Input:
// 2
// 65 71
// 23 16
// Apple

// Output:
// A  p
// p 16


import java.util.*;
public class Spiral_Replacement_Odd_Integers
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),index=0;
        String[][] mat=new String[N][N];
        for(int i=0;i<N;i++)
            for(int j=0;j<N;j++)
                mat[i][j]=obj.next();
        char[] s=obj.next().toCharArray();
        int rowlower=0,rowupper=N-1,collower=0,colupper=N-1;
        while(collower<=colupper && rowlower<=rowupper)
        {
            for(int i=rowlower;i<=rowupper;i++)
            {
                if(Integer.valueOf(mat[i][collower])%2!=0)
                {
                    if(index>=s.length)index=0;
                    mat[i][collower]=String.valueOf(s[index++]);
                }
            }
            collower++;
            for(int i=collower;i<=rowupper;i++)
            {
                if(Integer.valueOf(mat[rowupper][i])%2!=0)
                {
                    if(index>=s.length)index=0;
                    mat[rowupper][i]=String.valueOf(s[index++]);
                }
            }
            rowupper--;
            for(int i=rowupper;i>=rowlower;i--)
            {
                if(Integer.valueOf(mat[i][colupper])%2!=0)
                {
                    if(index>=s.length)index=0;
                    mat[i][colupper]=String.valueOf(s[index++]);
                }
            }
            colupper--;
            for(int i=colupper;i>=collower;i--)
            {
                if(Integer.valueOf(mat[rowlower][i])%2!=0)
                {
                    if(index>=s.length)index=0;
                    mat[rowlower][i]=String.valueOf(s[index++]);
                }
            }
            rowlower++;
        }
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }
    }
}