// The program must accept an integer N as the input. The program must generate a
// sequence of integers containing the integers from 1 to N. Then the program must
// invert the sign of all the powers of 2 in the generated sequence. Finally, the
// program must print the sum of all the integers in the modified sequence as the
// output.

// Boundary Condition(s):
// 1 <= N <= 10^4

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the sum of all the integers in the modified sequence.

// Example Input/Output 1:
// Input:
// 4

// Output:
// -4

// Explanation:
// Here N=4, so the sequence is 1 2 3 4.
// After inverting the sign of all the powers of 2, the sequence becomes -1 -2 3 -4.
// Now the sum of integers in the sequence is -4.
// Hence the output is -4

// Example Input/Output 2:
// Input:
// 10

// Output:
// 25

import java.util.*;
public class Sum_Inverted_Powers_Of_Two
{
    public static int TwoPow(int x)
    {
        int i=0,count=0;
        while(i<=x)
        {
            int temp=(int)Math.pow(2,i);
            if(temp==x)
            {
                count++;
                break;
            }
            i++;
        }
        if(count!=0)
            return -x;
        return x;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),sum=0;
        for(int i=1;i<=n;i++)
            sum=sum+TwoPow(i);
        System.out.print(sum);
    }
}