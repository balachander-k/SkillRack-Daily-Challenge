// The program must accept an integer N as the input. The program must print the N row in
// Pascal's triangle as the output. Pascal's triangle is a triangular array constructed by summing
// adjacent integers in preceding rows.

// Boundary Condition(s):
// 1 <= N <= 50

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the N

// Example Input/Output 1:
// Input:
// 5

// Output:
// 1 4 6 4 1

// Explanation:
// row in Pascal's triangle.
// The first 5 rows of Pascal's triangle are given below.
// 1
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1
// The 5th row in Pascal's triangle is 1 4 64 1. So they are printed as the output.

// Example Input/Output 2:
// Input
// 10

// Output:
// 1 9 36 84 126 126 84 36 9 1


import java.util.*;
public class Nth_Row_Pascal_Triangle 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<ArrayList<Long>> list=new ArrayList<ArrayList<Long>>();
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            ArrayList<Long> row=new ArrayList<Long>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                    row.add((long)1);
                else 
                    row.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }
            list.add(row);
        }
        for(int i=0;i<list.size();i++)
            System.out.print(list.get(list.size()-1).get(i)+" ");
    }
}