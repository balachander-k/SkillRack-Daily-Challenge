// The program must accept an integer matrix of size RxC as the input. The program
// must modify the matrix based on the following conditions.

// - If an integer X in a column contains at least one O, then all the integers in that
// column must be incremented by 1 except the integer X.
// - If there are two or more such integers in a column, then the column will remain
// the same.
// Finally, the program must print the modified matrix as the output.

// Boundary Condition(s):
// 2 <= R, c <= 100
// 1 <= Matrix element value <= 10^5

// Input Format:
// The first line contains R and C separated by a space.
// The next R lines, each contains C integers separated by a space.

// Output Format:
// The first R lines, each contains C integers separated by a space.

// Example Input/Output 1:
// Input:
// 3 4
// 841 535 297 203
// 978 881 700 815
// 290 927 615 280

// Output:
// 842 535 298 203
// 979 881 700 815
// 290 927 616 280

// Explanation:
// In the ISt column, the only integer 290 has the digit 0. So all the integers in the ISt
// column are incremented by 1 except 290.
// In the 2nd column, there is no integer having the digit 0. So the 2nd column
// remains the same.
// In the 3rd column, the only integer 700 has two Os. So all the integers in the 3rd
// column are incremented by 1 except 700.
// In the 4th column, there are two integers (203 and 280) having the digit 0. So the
// 4th column remains the same.
// Hence the output is
// 842 535 298 203
// 979 881 700 815
// 290 927 616 280

// Example Input/Output 2:
// Input:
// 6 6
// 793 455 615 940 715 913
// 815 207 605 974 954 898
// 979 351 722 335 43 763
// 771 155 653 901 890 489
// 366 876 316 104 88 281
// 328 550 391 677 66 429

// Output:
// 793 455 616 940 716 913
// 815 207 605 974 955 898
// 979 351 723 335 44 763
// 771 155 654 901 890 489
// 366 876 317 104 89 281
// 328 550 392 677 67 429


import java.util.*;
public class Matrix_Column_Blast
{
    public static int findX(int num)
    {
        int zero=0;
        if(num==0)
            return -1;
        else{
            while(num!=0)
            {
                int rev=num%10;
                if(rev==0)
                    zero++;
                num=num/10;
            }
        return zero;
        }
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int r=obj.nextInt(),c=obj.nextInt();
        int[][] mat=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                mat[i][j]=obj.nextInt();
        for(int i=0;i<c;i++)
        {
            int s=0,tt=0;
            for(int j=0;j<r;j++)
            {
                int temp=mat[j][i];
                s=findX(temp);
                if(s>0)
                    tt++;
            }
            if(tt==1)
            {
                for(int j=0;j<r;j++)
                {
                    int temp=mat[j][i];
                    s=findX(temp);
                    if(s==0 || s==-1)
                        mat[j][i]=++mat[j][i];
                }
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }
    }
    
}