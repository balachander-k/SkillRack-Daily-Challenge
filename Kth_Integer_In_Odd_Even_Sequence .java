// The program must accept two integers N and K as the input. The program must
// generate a sequence of integers containing all the odd integers from 1 to N
// followed by all the even integers from 1 to N. Then the program must print the
// Kth integer in sequence as the output.

// Boundary Condition(s):
// 1 <= K <= 10^5

// Input Format:
// The first line contains N and K separated by a space.

// Output Format:
// The first line contains the Kth integer in sequence.

// Example Input/Output 1:
// Input:
// 10 3

// Output:
// 5

// Explanation:
// Here N = 10, so the sequence is 1 3 5 7 9 2 4 6 8 10.
// The third integer in the sequence is 5, so it is printed as the output.

// Example Input/Output 2:
// Input:
// 7 7

// Output:
// 6

import java.util.*;
public class Kth_Integer_In_Odd_Even_Sequence 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),k=obj.nextInt(),j=0;
        int[] arr=new int[N];
        for(int i=1;i<=N;i++)
            if(i%2!=0)
                arr[j++]=i;
        for(int i=1;i<=N;i++)
            if(i%2==0)
                arr[j++]=i;
        System.out.print(arr[k-1]);
    }
}