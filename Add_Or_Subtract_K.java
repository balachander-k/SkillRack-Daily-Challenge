// The program must accept N integers and an integer K as the input. For each
// integer I among the N integers, the program must add K to I if the unit digit of I
// and K are equal. Else the program must subtract K from l. Then the program must
// print the modified integers as the output.

// Boundary Condition(s):
// 1 <=N <=100
// 1 <= Each integer value, K IO^7

// Input Format:
// The first line contains N and K separated by a space.
// The first line contains N integers separated by a space.

// Output Format:
// The first line contains the modified N integers.

// Example Input/Output 1:
// Input:
// 4 32
// 22 154 12 11

// Output:
// 54 122 44 -21

// Explanation:
// The unit digit of 22 and 32 are equal so they are added and printed 22 + 32 = 54.
// The unit digit of 154 and 32 are not equal so they are subtracted and printed 154 -
// 32 = 122.
// The unit digit of 12 and 32 are equal so they are added and printed 12 + 32 = 44.
// The unit digit of 11 and 32 are not equal so they are subtracted and printed 11 -
// 32 = -21.

// Example Input/Output 2:
// Input:
// 6 27
// 17 500 27 37 106 107

// Output:
// 44 473 54 64 79 134


import java.util.*;
public class Add_Or_Subtract_K
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        long a=obj.nextLong(),b=obj.nextLong();
        for(long i=0;i<a;i++)
        {
            long c=obj.nextLong();
            long uni1=b%10;
            long uni2=c%10;
            if(uni1==uni2)
                System.out.print((c+b)+" ");
            else 
                System.out.print((c-b)+" ");
        }
    }
}