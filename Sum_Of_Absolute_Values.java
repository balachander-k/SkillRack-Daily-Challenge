// The program must accept N integers as the input. The program must print the sum of
// absolute values of all the integers as the output.

// Boundary Condition(s):

// 1 100
// -IOA5 <= Each integer value <= IOA5

// Input Format:
// The first line contains N.
// The second line contains N integers separated by space.

// Output Format:
// The first line contains the sum of absolute values of all the integers.

// Example Input/Output 1:
// Input
// 4
// 12 -54 89 -45

// Output:
// 200


// Explanation:
// The sum of absolute values is 12 + 54 + 89 + 45 = 200

// Example Input/Output 2:
// Input:
// 5
// 57 5 -214 68 -77

// Output:
// 421



import java.util.*;
public class Sum_Of_Absolute_Values 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),sum=0;
        for(int i=0;i<a;i++)
        {
            int b=obj.nextInt();
            sum=sum+Math.abs(b);
        }
        System.out.print(sum);
    }
}