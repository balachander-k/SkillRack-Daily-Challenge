// The program must accept N integers as the input. The program must print the
// integers which are having the same digit among the N integers as the output. If
// there is no such integer, the program must print -1 as the output.

// Boundary Condition(s):
// 1 <= N <=100
// 1 <= Each integer value <= 10^8

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains the integers which are having the same digit separated by a
// space or -1.

// Example Input/Output 1:
// Input:
// 4
// 87 222 9999 1

// Output:
// 222 9999 1

// Explanation:
// All digits in 222 are 2.
// All digits in 9999 are 9.
// The only digit in 1 is 1.
// Hence the output is 222 9999 1

// Example Input/Output 2:
// Input:
// 5
// 887 56566 122 1000 56

// Output:
// -1


import java.util.*;
public class Integers_With_Same_Digit
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),yes=0;
        for(int i=1;i<=N;i++)
        {
            int num=obj.nextInt(),len=(int)Math.log10(num)+1;
            int count=0,temp=num,last=num%10;
            while(temp!=0)
            {
                if(last==temp%10)
                    count++;
                temp=temp/10;
            }
            if(len==1||count==len)
            {
                System.out.print(num+" ");
                yes++;
            }
        }
        if(yes==0)System.out.print("-1");
    }
}