// The program must accept N integers as the input. The program must divide each
// integer by its unit digit and print the result up to two decimal places as the input
// If the unit digit of the integer is 0 then the program must print the same integer
// with the precision up to two decimal places as the output.

// Boundary Condition(s):
// 1 <= N <=1000

// Input Format:
// The first line contains the values of N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains the N integer(s) separated by a space.

// Example Input/Output 1:
// Input:
// 2
// 10 49

// Output:
// 10.00 5.44

// Explanation:
// The unit digit of 10 is 0. So the the same integer is printed as 10.00
// The unit digit of 49 is 9. Here, 49 is divided by 9 the result is The
// result is rounded up to two decimal places is 5.44.
// Hence the output is 10.00 5.44

// Example Input/Output 2:
// Input:
// 10
// 15 522 52 511 1898 158 189 29 789 230

// Output:
// 3.00 261.00 26.00 511.00 237.25 19.75 21.00 3.22 87.67 230.00


import java.util.*;
public class Divide_By_Unit_Digit 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            int inp=obj.nextInt();
            int unit=inp%10;
            if(unit==0)
                System.out.print(inp+".00"+" ");
            else 
            {
                double funit=inp%10;
                double value=inp/funit;
                System.out.format("%.2f",value);
                System.out.print(" ");
            }
        }
    }
}