// The program must accept an integer N as the input. The program must print the pattern
// which contains N lines based on the following conditions.
// In the first line, N integers are printed and the value starts from 1 and increments each value
// by N, N-1, N-2 and so on.
// In the second line, N-1 integers are printed and the value starts from 2 and increments each
// value by N, N-1, N-2 and so on.
// In the third line, N-2 integers are printed and the value starts from 3 and increments each
// value by N, N-1, N-2 and so on.
// Similarly, the remaining lines of the pattern are printed as the output.

// Boundary Condition(s):
// 3 N 50

// Input Format:
// The first line contains N.

// Output Format:
// The first N lines, each contains the integer value(s) based on the given conditions.

// Example Input/Output 1:
// Input:
// 6

// Output:
// 1 7 12 16 19 21
// 2 8 13 17 20
// 3 9 14 18
// 4 10 15
// 5 11
// 6

// Explanation:
// Here N = 6.
// The first line contains 6 integers and they are 1, 7(1 +6), 12(7+6-1), 16(12+6-2), 19(16+6-3),
// 21(19+6-4).
// 1712 16 1921
// The second line contains 5 integers and they are 2, 8(2+6), 13(8+6-1), 17(13+6-2), 20(17+6-
// 3).
// 28 13 17 20
// The third line contains 4 integers and they are 3, 9(3+6), 14(9+6-1), 18(14+6-2).
// 3914 18
// The fourth line contains 3 integers and they are 4, 10(4+6), 15(10+6-1).
// 4 10 15
// The fifth line contains 2 integers and they are 5, 11(5+6).
// 5 11
// The sixth line contains 1 integer and it is 6.
// 6

// Example Input/Output 2:
// Input:
// 10

// Output:
// 1 11 20 28 35 41 46 50 53 55
// 2 12 21 29 36 42 47 51 54
// 3 13 22 30 37 43 48 52
// 4 14 23 31 38 44 49
// 5 15 24 32 39 45
// 6 16 25 33 40
// 7 17 26 34
// 8 18 27
// 9 19
// 10


import java.util.*;
public class Top_To_Bottom_Triangle_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        for(int i=0;i<N;i++)
        {
            int sum=0,mins=-1;
            for(int j=0;j<N-i;j++)
            {
                System.out.print((j==0)?(sum+=(i+1))+" ":(sum+=(N-mins))+" ");
                mins++;
            }
            System.out.println();
        }
    }
}