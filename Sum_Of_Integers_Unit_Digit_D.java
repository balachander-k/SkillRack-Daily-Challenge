// The program must accept an integer N and a digit D as the input. The program musst print the sum of the integers from 1 to N which have the unit digit as D as the output. If there is a no such integer from 1 to N then the program must print -1 as the output.

// Boundary Condition(s);
// 1<=N<=1000
// 0<=D<=9

// Input Format:
// The first line contains the values of N and D separated by space.

// Output Format:
// The first line contains either the sum of the integers from 1 to N which have the unit digit as D or -1.

// Example Input/Output 1:
// Input:
// 30  3 

// Output:
// 39

// Explanation:
// The integers from 1 to 30 which have the unit digit as 3 are 3, 13, and 23.
// So the sum is 39 (3+13+23).
// Hence the output is 39.

// Example Input/Output 2:
// Input:
// 5   7

// Output:
// -1


import java.util.*;
public class Sum_Of_Integers_Unit_Digit_D
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int count=0,sum=0,temp=0;
        for(int i=1;i<=a;i++)
        {
            temp=i%10;
            if(temp==b)
            {
                sum=sum+i;
                count++;
            }
        }
        if(count==0)
            System.out.print("-1");
        else 
            System.out.print(sum);
    }
}