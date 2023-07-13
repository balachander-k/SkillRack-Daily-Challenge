// The program must accept two integers X and Y as the input. The program must
// print the integers having the sum of the tenth digit and unit digit as even from X
// to Y as the output.

// Boundary Condition(s):
// 10 <= X,Y <= 10^8

// Input Format:
// The first line contains the value of X and Y separated by a space.

// Output Format:
// The first line contains the integers having the sum of the tenth digit and unit digit
// as even separated by space(s)

// Example Input/Output 1:
// Input:
// 10 15

// Output:
// 11 13 15

// Explanation:
// The integers from 10 to 15 are 10, 11, 12, 13, 14 and 15.
// The integers 11, 13 and 15 have the sum of the last two digits as even.
// Hence 11 13 15 are printed.

// Example Input/Output 2:
// Input:
// 20 30

// Output:
// 20 22 24 26 28

import java.util.*;
public class Even_Sum_Of_Unit_Digit_And_Tenth_Digit
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int first=obj.nextInt(),second=obj.nextInt();
        for(int i=first;i<=second;i++)
        {
            int unit=i%10;
            int tenth=(i%100)/10;
            if((unit+tenth)%2==0)
                System.out.print(i+" ");
        }
    }
}