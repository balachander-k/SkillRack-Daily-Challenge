// The program must accept an NXN matrix as the input. The program must print yes if the sum of each column in the matrix is equal to 0. Else the program must print no as the output.

//  Boundary Condition(s);
// 1<= N <=100

// Input Format:
// The first line contains N
// The next N lines contain N integers each separated by space.


// Output Format:
// The first line contains yes or no.

// Example Input/Output 1:
// Input:
// 3
// 10 -1 7
// -1 8 1
// -9 9 -8

// Output:
// yes

// Explanation:
// The sum of elements in the first column is 10 + (-1) + (-9) = 0.
// The sum of elements in the second column is (-1) + (-8) + 9 = 0.
// The sum of elements in the third column is 7 + 1 + (-8) = 0.

// Example Input/Output 2:
// Input:
// 5
// 1 0 -3 -7 3
// 5 2 -7 -6 -4
// 8 -10 -6 -3 9
// -10 -5 -9 3 -10
// -4 12 25 13 2

// Output:
// no


import java.util.*;
public class Zero_Sum_Columns 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),count=0,sum=0;
        int[][] b=new int[a][a];
        
        for(int i=0;i<a;i++)
            for(int j=0;j<a;j++)b[i][j]=obj.nextInt();
                
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)sum=sum+b[j][i];
            if(sum==0)count++;
        }
        if(count==a)System.out.print("yes");
        else System.out.print("no");
    }
}