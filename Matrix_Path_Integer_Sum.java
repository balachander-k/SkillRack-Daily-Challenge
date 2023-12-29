// The program must accept an integer matrix of size RxC and a string P
// representing a path inside the matrix as the input. The string P contains the
// alphabets N, E, W and S. The path P always starts from the top-left position of the
// matrix (i.e., the first row and first column of the matrix). The program must print
// the sum of integers T which are present in the path P as the output. If the path P
// crosses a position in the matrix more than once then the integer X which is
// present in that position will not be added again to the sum T (i.e., Even if the
// position of X has crossed multiple times by the path P, the integer X is added only
// once to the sum T).

// The path movements are given below.
// N - Move one position towards North.
// E - Move one position towards East.
// W - Move one position towards West.
// S - Move one position towards South.

// Boundary Condition(s):
// 2 <= R, c <= 50
// 1 <= Length of P <= 500

// Input Format:
// The first line contains R and C separated by a space.
// The next R lines each contain C integers separated by a space.
// The (R+2)nd line contains P.

// Output Format:
// The first line contains the sum of integers T as per the given condition(s).


// Example Input/Output 1:
// Input:
// 3 3
// 1 2 3
// 4 5 6
// 7 8 9
// ESENWSSW

// Output:
// 32
// Explanation:
// The integers which are present in the path ESENWSSW are 1 2 5 6 3 2 5 8 7.
// Here the path P crossed the integers 2 and 5 twice. So they are not considered
// again to find the sum T.
// Hence the sum 32 (1+2+5+6+3+8+7) is printed as the output.

// Example Input/Output 2:
// Input:
// 4 5
// 26 94 92 15 31
// 74 67 52 56 39
// 92 68 16 31 9
// 21 29 79 39 10
// SENESEESWNN

// Output:
// 555

import java.util.*;
public class Matrix_Path_Integer_Sum
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int r=obj.nextInt(),c=obj.nextInt(),r1=0,c1=0;
        int[][] mat=new int[r][c];
        
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                mat[i][j]=obj.nextInt();
        
        char[] p=obj.next().toCharArray();
        int sum=mat[r1][c1];
        for(int i=0;i<p.length;i++)
        {
            if(p[i]=='E')
                c1++;
            if(p[i]=='N')
                r1--;
            if(p[i]=='W')
                c1--;
            if(p[i]=='S')
                r1++;
            sum=sum+mat[r1][c1];
            mat[r1][c1]=0;
        }
        System.out.print(sum);
    }
}