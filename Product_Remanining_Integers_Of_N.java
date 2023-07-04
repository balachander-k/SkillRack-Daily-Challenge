// The program must accept N integers as the input. The program must replace each
// integer with the product of remaining integers among the N integers. Finally, the
// program must print the modified value of the N integers as the output.

// Boundary Condition(s):
// 1 <= N <=15
// 0 <= Each integer value <= 10

// Input Format:
// The first line contains N.
// The second line contains N integers separated by space(s).

// Output Format:
// The first line contains the N integers separated by a space as per the given
// condition.

// Example Input/Output 1:
// Input:
// 5
// 1 3 5 7 9

// Output:
// 945 315 189 135 105


// Explanation:
// The first integer is replaced with 3*5*7*9 = 945
// The second integer is replaced with 1*5*7*9 = 315
// The third integer is replaced with 1*3*7*9 = 189
// The fourth integer is replaced with 1*3*5*9 = 135
// The fifth integer is replaced with 1*3*5*7 = 105
// Hence the output is
// 945 315 189 135 105

// Example Input/Output 2:
// Input:
// 2
// 7 0

// Output:
// 0 7

import java.util.*;
public class Product_Remanining_Integers_Of_N
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=obj.nextInt();
        for(int i=0;i<size;i++)
        {
            int mul=1;
            for(int j=0;j<size;j++)
            {
                if(i!=j)
                {
                    mul=mul*arr[j];
                }
            }
            System.out.print(mul+" ");
        }
    }
}