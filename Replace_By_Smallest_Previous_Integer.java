// The program must accept N integers as the input. For each integer X among the N
// integers, the program must replace the value of X with the minimum of X and
// its previous integer. The first integer has no previous integer, so it remains the
// same. Finally, the program must print the N modified integers as the output.

// Boundary Condition(s):
// 2 <= N <= 100
// 1 <= Each integer value <= 10^8

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains the N integers separated by a space based on the given
// conditions.

// Example Input/Output 1:
// Input:
// 5
// 60 70 50 40 80

// Output:
// 60 60 50 40 40

// Explanation:
// The first integer 60 has no previous integer, so it remains the same.
// The second integer 70 is replaced with the minimum of 70 and 60. Now the
// integers become 60 60 50 40 80.
// The third integer 50 is replaced with the minimum of 50 and 60. Now the integers
// become 60 60 50 40 80.
// The fourth integer 40 is replaced with the minimum of 40 and 50. Now the
// integers become 60 60 50 40 80.
// The fifth integer 80 is replaced with the minimum of 80 and 40. Now the integers
// become 60 60 50 40 40.
// Hence the output is 60 60 50 40 40

// Example Input/Output 2:
// Input:
// 6
// 100 200 300 400 500 600

// Output:
// 100 100 100 100 100 100

// Example Input/Output 3:
// Input:
// 4
// 9 9 1 2

// Output:
// 9 9 1 1

import java.util.*;
public class Replace_By_Smallest_Previous_Integer
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
            arr[i]=obj.nextInt();
        for(int i=1;i<N;i++)
        {
            int temp=Math.min(arr[i-1],arr[i]);
            arr[i]=temp;
        }
        for(int i=0;i<N;i++)
            System.out.print(arr[i]+" ");
    }
}