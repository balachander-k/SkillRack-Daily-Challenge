// The program must accept N integers as the input. The program must print the
// smallest factor count among these N integers.

// Boundary Condition(s):
// 1 <= N <= 100

// Input Format:
// The first line contains the value of N.
// The second line contains N integers separated by space(s).

// Output Format:
// The first line contains the smallest factor count among the N integers.

// Example Input/Output 1:
// Input:
// 4
// 10 32 100 60

// Output:
// 4

// Explanation:
// The factors of IO are 1, 2, 5 and 10. So its factor count is 4.
// The factors of 32 are 1, 2, 4, 8, 16 and 32. So its factor count is 6.
// The factors of 100 are 1, 2, 4, 5, 10, 20, 25, 50 and 100. So its factor count is 9.
// The factors of 60 are 1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 30 and 60. So its factor count is
// 12.
// Here the smallest factor count is 4.
// Hence the output is 4

// Example Input/Output 2:
// Input:
// 2
// 42 32

// Output:
// 6



import java.util.*;
public class Smallest_Factor_Count
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt(),min=Integer.MAX_VALUE;
        for(int i=0;i<size;i++)
        {
            int value=obj.nextInt();
            int count=0;
            for(int j=1;j<=value;j++)
                if(value%j==0)
                    count++;
            if(count<min)
                min=count;
        }
        System.out.print(min);
    }
}