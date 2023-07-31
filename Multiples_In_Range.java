// The program must accept five integers A, B, X, Y and Z as the input. The program
// must print the multiples of X, Y and Z in the range from A to B (inclusive of A and
// B) as the output.

// Boundary Condition(s):
// 1 <= A <= X,Y,Z <= B 10^5

// Input Format:
// The first line contains the values of A and B separated by space(s).
// The second line contains the values of X, Y and Z separated by space(s).

// Output Format:
// The first line contains the multiples of X, Y and Z in the range from A to B
// (inclusive of A and B) separated by a space.

// Example Input/Output 1:
// Input:
// 2 15
// 3 4 6

// Output:
// 3 4 6 8 9 12 15

// Example Input/Output 2:
// Input:
// 20 50
// 24 30 41

// Output:
// 24 30 41 48

import java.util.*;
public class Multiples_In_Range
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=obj.nextInt();
        int x=obj.nextInt(),y=obj.nextInt(),z=obj.nextInt();
        for(int i=a;i<=b;i++)
            if(i%x==0 || i%y==0 || i%z==0)
                System.out.print(i+" ");
    }
}