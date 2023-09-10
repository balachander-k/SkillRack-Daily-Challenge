// The program must accept an integer N as the input. The program must print all
// the even factors of N in ascending order as the output.

// Boundary Condition(s):
// 1 <= N <= 10^5

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains all the even factors of N separated by a space.

// Example Input/Output 1:
// Input:
// 16

// Output:
// 2 4 8 16

// Explanation:
// The factors of 16 are 1 2 4 8 16.
// The even factors of 16 are 2 4 8 16.
// So 2 4 8 16 are printed as the output.

// Example Input/Output 2:
// Input:
// 100

// Output:
// 2 4 10 20 50 100

import java.util.*;
public class Print_All_The_Even_Factors_Of_N 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        for(int i=1;i<=num;i++)
            if(num%i==0 && i%2==0)
                    System.out.print(i+" ");
    }
}