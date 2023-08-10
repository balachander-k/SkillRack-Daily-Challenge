// The program must accept a positive even integer N as the input. The program
// must print the desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 2 <= N <= 100

// Input Format:
// The first line contains the positive even integer N.

// Output Format:
// The lines containing the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 6

// Output:
// 1666666
// 2255555
// 3334444

// Example Input/Output 2:
// Input:
// 4

// Output:
// 14444
// 22333


import java.util.*;
public class Alternate_Repeat_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),size=N/2,temp=N;
        for(int i=1;i<=size;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(i);
            for(int j=1;j<=temp;j++)
                System.out.print(temp);
            temp--;
            System.out.println();
        }
    }
}