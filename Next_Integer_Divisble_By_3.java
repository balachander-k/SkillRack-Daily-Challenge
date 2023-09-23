// The program must accept a positive integer N as the input. The program must
// print the next greater integer which is divisible by 3 and the sum of digits in it is
// also divisible by 3 as the output.

// Boundary Condition(s):
// 1 <= N < = 1000

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the next greater integer based on the given conditions.

// Example Input/Output 1:
// Input:
// 22

// Output:
// 24

// Explanation:
// The next greater integer which is divisible by 3 and the sum of digits in it 6 (2+4) is
// also divisible by 3 is 24.
// Hence 24 is the output

// Example Input/Output 2:
// Input:
// 84

// Output:
87

import java.util.*;
public class Next_Integer_Divisble_By_3
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        ++num;
        while(true)
        {
            int temp=num,sum=0;
            if(temp%3==0)
            {
                while(temp!=0)
                {
                    int rem=temp%10;
                    sum=sum+rem;
                    temp=temp/10;
                }
                if(sum%3==0 && num%3==0)
                {
                    System.out.print(num);
                    break;
                }
            }
            num++;
        }
    }
}