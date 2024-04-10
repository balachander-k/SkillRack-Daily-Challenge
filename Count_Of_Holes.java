// The program must accept an integer N as the input. The program must print the
// count of holes in the digits of N as the output.
// The digits with no holes in their shape - 1, 2, 3, 5, 7
// The digits with 1 hole in their shape - O, 4, 6, 9
// The digit with 2 holes in its shape - 8

// Boundary Condition(s):
// 1 <= N <= 10^8

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the count of holes in the digits of N.

// Example Input/Output 1:
// Input:
// 541879

// Output:
// 4

// Explanation:
// Here N = 541879.
// The digits 5, 1 and 7 have no holes.
// The digits 4 and 9 have 1 hole.
// The digit 8 has 2 holes.
// So the total count of holes in the digits of 541879 is 4.
// Hence the output is 4

// Example Input/Output 1:
// Input:
// 123000

// Output:
// 3


import java.util.*;
public class Count_Of_Holes
{
    public static int oneHole(int t)
    {
        if(t==0 || t==4 || t==6 || t==9)
            return 1;
        return 0;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] N=obj.next().toCharArray();
        int hole=0;
        for(int i=0;i<N.length;i++)
        {
            int temp=Integer.valueOf(N[i]-'0');
            if(temp==8)
                hole+=2;
            else 
                hole+=oneHole(temp);
        }
        System.out.print(hole);
    }
}