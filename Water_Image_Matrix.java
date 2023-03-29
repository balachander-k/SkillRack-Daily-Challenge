// The program must accept an integer matrix of size RxC as the input. The program
// must print YES if the elements in the first row are equal to the elements in the last
// row in their positions and the elements in the second row are equal to the
// elements in the last but second row in their positions and so on. Else the program
// must print NO as the output.

// Boundary Condition(s):
// 2 <= R, c <= 50

// Input Format:
// The first line contains R and C separated by a space.
// The next R lines contain C integers each separated by space(s).

// Output Format:
// The first line contains either YES or NO.

// Example Input/Output 1:
// Input:
// 44
// 20 25 40 55
// 45 50 65 60
// 45 50 65 60
// 20 25 40 55

// Output:
// YES

// Explanation:
// The elements in the first row are 20 30 40 and 50.
// The elements in the fourth row are 20 30 40 and 50.
// Here the elements in the first row are equal to the elements in the fourth row.
// The elements in the second row are 45 50 65 and 60.
// The elements in the third row are 45 50 65 and 60.
// Here the elements in the second row are equal to the elements in the third row.
// Hence the output is YES

// Example Input/Output 2:
// Input:
// 75
// 460 193 550 462 595
// 957 998 754 798 130
// 450 291 853 564 468
// 226 650 420 866 541
// 900 793 594 753 534
// 874 174 669 162 530
// 460 193 550 462 595

// Output:
// NO

import java.util.*;
public class Water_Image_Matrix
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=obj.nextInt(),div=a/2,t=a-1,matcount=0,count=0;
        int[][] mat=new int[a][b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                mat[i][j]=obj.nextInt();
            }
        }
        for(int i=0;i<div;i++)
        {
            for(int j=0;j<b;j++)
            {
                if(mat[i][j]==mat[t][j])
                    matcount++;
            }
            if(matcount==b)
                count++;
            matcount=0;
            t--;
        }
        if(count==div)
            System.out.print("YES");
        if(count!=div)
            System.out.print("NO");
    }
}