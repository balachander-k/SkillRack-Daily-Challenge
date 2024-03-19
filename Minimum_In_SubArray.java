// The program must accept an integer array of size N and Q queries as the input.
// Each query contains two integers representing the starting position S and the
// ending position E of a sub-array. For each query, the program must print the
// minimum integer in the subarray specified by the query as the output.

// Boundary Condition(s):
// 1 <= N <= 100
// 1 <= Q <= 1000
// 1 <= S <= E <= N

// Input Format:
// The first line contains N and Q separated by a space.
// The second line contains N integers separated by a space.
// The next Q lines, each containing two integers (S and E) separated by a space.

// Output Format:
// The first Q lines, each containing the minimum integer in the sub-array specified
// by the query.

// Example Input/Output 1:
// Input:
// 6 3
// 9 5 3 4 6 2
// 1 3
// 2 6
// 3 5

// Output:
// 3
// 2
// 3

// Explanation:
// Here and Q=3,
// ISt query: The integers in the sub-array are 9, 5 and 3. Here the minimum integer
// is 3, so 3 is printed.
// 2nd query: The integers in the sub-array are 5, 3, 4, 6 and 2. Here the minimum
// integer is 2, so 2 is printed.
// 3rd query: The integers in the sub-array are 3, 4 and 6. Here the minimum integer
// is 3, so 3 is printed.

// Example Input/Output 2:
// Input:
// 9 3
// 94 22 25 79 70 52 11 12 73
// 1 9
// 3 7
// 6 6

// Output:
// 11
// 11
// 52

import java.util.*;
public class Minimum_In_SubArray
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),Q=obj.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
            arr[i]=obj.nextInt();
        for(int i=0;i<Q;i++)
        {
            int start=obj.nextInt(),end=obj.nextInt();
            int min=Integer.MAX_VALUE;
            for(int j=start-1;j<end;j++)
                if(arr[j]<min)
                    min=arr[j];
            System.out.println(min);
        }
    }
}