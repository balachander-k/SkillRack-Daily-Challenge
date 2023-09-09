// The program must accept two integers N and X as the input. The program must
// print the integers from 1 to N for X times as the output.

// Boundary Condition(s):
// 1 <= N <= 1000
// 1 <= X <= 100

// Input Format:
// The first line contains N and X separated by a space.

// Output Format:
// The first line contains the integers separated by a space as per the given condition.

// Example Input/Output 1:
// Input:
// 10 2

// Output:
// 1 2 3 4 5 6 7 8 9 10 1 2 3 4 5 6 7 8 9 10

// Example Input/Output 2:
// Input:
// 5 4

// Output:
// 1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 

import java.util.*;
public class Integers_-1_to_N_For_X_Times 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),x=obj.nextInt();
        for(int i=1;i<=x;i++)
            for(int j=1;j<=n;j++)
                System.out.print(j+" ");
    }
}