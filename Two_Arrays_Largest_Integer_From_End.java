// The program must accept two integer arrays of size M and N as the input. The
// program must print the largest integer in both the array at the same position
// starting from the end. If M is greater than N, the M-N integers have no pairs so
// such integers are printed as it is as the output.

// Boundary Condition(s):
// 1 <=N <= M <=100
// 1 <= Each integer value <= 10^5

// Input Format:
// The first line contains M and N separated by a space.
// The second line contains M integers separated by a space.
// The third line contains N integers separated by a space.

// Output Format:
// The first line contains the largest integers in both the array at the same position
// starting from the end.

// Example Input/Output 1:
// Input:
// 6 4
// 10 20 30 40 50 60
// 99 30 26 100

// Output:
// 100 50 40 99 20 10

// Explanation:
// The largest integer between 60 and 100 is 100, so it is printed.
// The largest integer between 50 and 26 is 50, so it is printed.
// The largest integer between 40 and 30 is 40, so it is printed.
// The largest integer between 30 and 99 is 99, so it is printed.
// The integer 20 has no pair, so 20 is printed.
// The integer 10 has no pair, so 10 is printed.

// Example Input/Output 2:
// Input:
// 5 5
// 10 20 30 40 50
// 99 25 30 10 77

// Output:
// 77 40 30 25 99

import java.util.*;
public class Two_Arrays_Largest_Integer_From_End 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int M=obj.nextInt(),N=obj.nextInt(),temp=N-1;
        int[] arr1=new int[M];
        int[] arr2=new int[N];
        for(int i=0;i<M;i++)
            arr1[i]=obj.nextInt();
        for(int i=0;i<N;i++)
            arr2[i]=obj.nextInt();
        for(int i=M-1;i>=0;i--)
        {
            try{
                if(arr1[i]>arr2[temp])
                    System.out.print(arr1[i]+" ");
                else 
                    System.out.print(arr2[temp]+" ");
                temp--;
            }
            catch(Exception e)
            {
                System.out.print(arr1[i]+" ");
            }
        }
    }
}