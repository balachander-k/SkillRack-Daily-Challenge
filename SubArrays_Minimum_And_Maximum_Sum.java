// The program must accept N integers and an integer K as the input. The program must print
// the integers in the subarray of size K having the minimum sum. Then the program must
// print the integers in the subarray of size K having the maximum sum. If two or more
// subarrays of size K have the same minimum sum or the maximum sum, the program must
// print the first occurring subarray as the output.

// Boundary Condition(s):
// 1 < = K <= N <= 1000
// 1 <= Each integer value <= 1000

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.
// The third line contains K.

// Output Format:
// The first line contains K integers representing the integers in the subarray having the
// minimum sum.
// The second line contains K integers representing the integers in the subarray having the
// maximum sum.

// Example Input/Output 1:
// Input
// 7
// 7 2 1 4 5 3 6
// 2

// Output:
// 2 1
// 7 2

// Explanation:
// Here K = 2.
// There is only one subarray having the minimum sum 3 is 2 and 1. So they are printed in the
// first line.
// There are two subarrays having the same maximum sum 9, they are 7 2 and 3 6. So the
// integers in the first occurring subarray (7 2) are printed in the second line.

// Example Input/Output 2:
// Input
// 6
// 25 16 14 78 19 12
// 4

// Output:
// 14 78 19 12
// 25 16 14 78


import java.util.*;
public class SubArrays_Minimum_And_Maximum_Sum
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),minindex=0,maxindex=0,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
            arr[i]=obj.nextInt();
        int k=obj.nextInt();
        for(int i=0;i<=N-k;i++)
        {
            int sum=0;
            for(int j=0;j<k;j++)
                sum+=arr[i+j];
            if(sum<min)
            {
                min=sum;
                minindex=i;
            }
            if(sum>max)
            {
                max=sum;
                maxindex=i;
            }
        }
        for(int i=minindex;i<minindex+k;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        for(int i=maxindex;i<maxindex+k;i++)
            System.out.print(arr[i]+" ");
    }
}