// The program must accept N integers as the input. The program must print the odd
// integers which are present in the even positions and print the even integers which
// are present in the odd positions among the N integers. If there is no such integer,
// the program must print -1 as the output.

// Boundary Condition(s):
// 1 <= N <= 100
// -10^5 <= Each integer value <=10^5

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains the integers or -1 as per the given condition.

// Example Input/Output 1:
// Input:
// 5
// 80 82 26 -27 25

// Output:
// 80 26 -27

// Explanation:
// The integer 80 is even which is present in the odd position. So 80 is printed.
// The integer 82 is even which is present in the even position. So 82 is NOT printed.
// The integer 26 is even which is present in the odd position. So 26 is printed.
// The integer -27 is odd which is present in the even position. So -27 is printed.
// The integer 25 is odd which is present in the odd position. So 25 is NOT printed.

// Example Input/Output 2:
// Input:
// 4
// 1 2 3 8

// Output:
// -1

import java.util.*;
public class Integers_And_Positions_Odd_Even
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),co=0;
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
            arr[i]=obj.nextInt();
        for(int i=0;i<N;i++)
        {
            if((arr[i]%2!=0 && (i+1)%2==0) || (arr[i]%2==0 && (i+1)%2!=0))
            {
                System.out.print(arr[i]+" ");
                co++;
            }
        }
        if(co==0)System.out.print("-1");
    }
}