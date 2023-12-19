// The program must accept two odd integers X and Y as the input. The program
// must print the desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 3 <= N <=99

// Input Format:
// The first line contains X and Y separated by a space.

// Output Format:
// The first X lines contain the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 5 5

// Output:
// * * * * * 
// * 0 * 0 * 
// * * * * * 
// * 0 * 0 * 
// * * * * * 

// Example Input/Output 2:
// Input:
// 3 5

// Output:
// * * * * * 
// * 0 * 0 * 
// * * * * * 

import java.util.*;
public class Hollow_Pattern_printing
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt(),y=obj.nextInt();
        for(int i=1;i<=x;i++)
        {
            for(int j=1;j<=y;j++)
            {
                if(i%2!=0)
                    System.out.print("*"+" ");
                else 
                {
                    if(j%2!=0)
                        System.out.print("*"+" ");
                    else
                        System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
}