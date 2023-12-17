// The program must accept N integers (where N is always a multiple of 3) as the
// input. The program must print the minimum sum among the sum of every three
// integers as the output.

// Boundary Condition(s):
// 3 <= N <= 99
// 1 <= Each integer value <= 10^5

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains the minimum sum among the sum of every three integers.

// Example Input/Output 1:
// Input:
// 6
// 45 10 90 1 50 25

// Output:
// 76

// Explanation:
// Here the 6 integers are 45 10 90 1 50 and 25.
// The sum of the first three integers is 145.
// The sum of the last three integers is 76.
// Here the minimum sum is 76, so it is printed as the output.


// Example Input/Output 2:
// Input:
// 9
// 10 37 27 100 57 42 15 46 76

// Output:
// 74

import java.util.*;
public class Minimum_Sum_Of_Every_Three_Integers
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),t=n/3,min=Integer.MAX_VALUE;
        for(int i=1;i<=t;i++)
        {
            int sum=0;
            for(int j=1;j<=3;j++)
            {
                int value=obj.nextInt();
                sum=sum+value;
            }
            if(sum<min)
                min=sum;
        }
        System.out.print(min);
    }
}