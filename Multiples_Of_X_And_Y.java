// The program must accept two integers X and Y as the input. The program must
// print the first 10 multiples of X if X is greater than Y. Else the program must print
// the multiples of Y as the output.

// Boundary Condition(s):
// 1 <= x, Y <= 100

// Input Format:
// The first line contains the value of X and Y separated by a space.

// Output Format:
// The first line contains the first 10 multiples of either X or Y separated by a space.

// Example Input/Output 1:
// Input:
// 45 34

// Output:
// 45 90 135 180 225 270 315 360 405 450

// Explanation:
// Here 45 is greater than 34.
// Hence the first 10 multiples of 45 are printed as the output.

// Example Input/Output 2:
// Input:
// 6 4

// Output:
// 6 12 18 24 30 36 42 48 54 60

import java.util.*;
public class Multiples_Of_X_And_Y
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt(),y=obj.nextInt(),mulx=x,muly=y,count=0;
        if(x>y)
        {
            while(count!=10)
            {
                System.out.print(mulx+" ");
                mulx=mulx+x;
                count++;
            }
        }
        else 
        {
            while(count!=10)
            {
                System.out.print(muly+" ");
                muly=muly+y;
                count++;
            }
        }
    }
}