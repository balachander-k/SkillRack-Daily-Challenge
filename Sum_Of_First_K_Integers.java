// The program must accept N integers and an integer K as the input. The program
// must find the sum of the first K integers as S. The program must consider the last
// K integers and for each integer X among the last K integers, the program must
// print difference between S and X as the output.

// Boundary Condition(s):
// 1 <= N <= 10^5
// 1 <= K <= N

// Input Format:
// The first line contains the two integers N and K separated by a space.
// The second line contains N integers separated by spaces.

// Output Format:
// The first line contains K integers separated by space(s).

// Example Input/Output 1:
// Input:
// 7 5
// 10 20 30 40 50 60 70

// Output:
// 120 110 100 90 80

// Explanation:
// The first 5 integers are 10, 20, 30, 40 and 50 and their sum is 150 (10 + 20 + 30 +
// 40 + 50).
// The last 5 integers are 30, 40, 50, 60 and 70.
// For integer 30, the difference between 150 and 30 is 120 (150-30). So 120 is
// printed.
// For integer 40, the difference between 150 and 40 is 110 (150-40). So 110 is
// printed.
// For integer 50, the difference between 150 and 50 is 100 (150-50). So 100 is
// printed.
// For integer 60, the difference between 150 and 60 is 90 (150-60). So 90 is printed.
// For integer 70, the difference between 150 and 70 is 80 (150-70). So 80 is printed.

// Example Input/Output 2:
// Input:
// 4 2
// 10 5 12 20

// Output:
// 3 -5

import java.util.*;
public class Sum_Of_First_K_Integers
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt(),key=obj.nextInt(),j=size-key,sum=0;
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=obj.nextInt();
            if(i<key)
                sum=sum+arr[i];
        }
        for(int i=j;i<size;i++)
            System.out.print((sum-arr[i])+" ");
    }
}