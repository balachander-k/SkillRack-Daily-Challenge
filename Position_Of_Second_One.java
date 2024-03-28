// The program must accept tvv'0 integers M and N as the input The program must
// print the position of the second 1 in the binary representation of the sum of M and N
// as the output. If there is no second 1 then the program must print O as the output.

// Boundary Condition(s):
// 1 <= M, N <= 10^8

// Input Format:
// The first line contains M and N separated by a space.

// Output Format:
// The first line contains an integer value as per the given condition.

// Example Input/Output I:
// Input
// 13 5

// Output
// 4

// Explanation:
// Here M-13 and N=5.
// The binary representation of 18 (13+5) is 10010.
// The position of the second I in 10010 is 4, so 4 is printed as the output.

// Example Input/Output 2:
// Input
// 20 12

// Output
// 0


import java.util.*;
public class Position_Of_Second_One
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int M=obj.nextInt(),N=obj.nextInt(),s=M+N,count=0,pos=0;
        String f=Integer.toBinaryString(s);
        for(int i=0;i<f.length();i++)
        {
            int temp=Integer.valueOf(f.charAt(i)-'0');
            if(temp==1)
            {
                count++;
                if(count==2)
                    pos=i;
            }
        }
        System.out.print((pos==0)?"0":(pos+1));
    }
}