
// The program must accpet an integer N as the input. The program must print the desired pattern as show in the Example Input/Output section.

// Boundary Condition(s);
// 1<=N<=100

// Input Format:
// The first line contains the value of N/

// Output Format:
// The N lines containing the desired pattern as shown in the Example Input/Output section.

// Example Input/Output 1:
// Input:
// 4

// Output:
// 1 2 3 4
// 2 3 4
// 3 4
// 4

// Example Input/Output 2:
// Input:
// 7

// Output:
// 1 2 3 4 5 6 7
// 2 3 4 5 6 7
// 3 4 5 6 7
// 4 5 6 7
// 5 6 7
// 6 7
// 7

import java.util.*;
public class Left_Upper_Triangle
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=i;j<=a;j++)
            {
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
}