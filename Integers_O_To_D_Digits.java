// The program must accept an integer N and a digit D as the input The program
// must print yes if N has all the digits from O to D. Else the program must print no as
// the output.

// Boundary Condition(s):
// 10 <= N <=10^17
// 1 <= D <= 9

// Input Format:
// The first line contains N and D separated by a space.

// Output Format:
// The first line contains yes or no.

// Example Input/Output I:
// Input
// 102435 4

// Output
// yes

// Explanation:
// Here N = 102435 and D = 4.
// The integer 102435 contains all the digits from O to 4. So yes is printed as the
// output.

// Example Input/Output 2:
// Input
// 21342 3

// Output:
// no

import java.util.*;
public class Integers_O_To_D_Digits
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] n=obj.next().toCharArray();
        int d=obj.nextInt(),digit=0;
        for(int i=0;i<=d;i++)
        {
            int count=0;
            for(int j=0;j<n.length;j++)
            {
                int temp=Integer.valueOf(n[j]-'0');
                if(temp==i)
                    count++;
            }
            if(count!=0)digit++;
        }
        System.out.print((digit==(d+1))?"yes":"no");
    }
}