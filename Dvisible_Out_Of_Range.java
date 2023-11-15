
// The program must accept three integers X, Y and Z as the input. The program
// must find and print the smallest positive integer N based on the following
// conditions.

// - N is divisible by Z.
// - N is not equal to any of the integers from X to Y (where X < Y).

// Boundary Condition(s):
// 1 <= X,Y,X <=10^8

// Input Format:
// The first line contains X, Y and Z separated by a space.

// Output Format:
// The first line contains N.

// Example Input/Output 1:
// Input:
// 2 8 2

// Output:
// 10

// Explanation:
// 10 is the smallest integer which is divisible by 2 and it is not equal to any integers
// from 2 to 8.

// Example Input/Output 2:
// Input:
// 5 10 4
// Output:
// 4
// So IO is printed as the output.

import java.util.*;
public class Dvisible_Out_Of_Range 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt(),y=obj.nextInt(),z=obj.nextInt();
        int max=Integer.MAX_VALUE;
        for(int i=1;i<=max;i++)
        {
            int count=0;
            if(i%z==0)
            {
                for(int j=x;j<=y;j++)
                    if(i==j)
                        count++;
                if(count==0)
                {
                    System.out.print(i);
                    break;
                }
            }
        }
    }
}