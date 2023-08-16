// Given a positive integer N as an input, the program must check if N can be
// expressed as 2AK+1 or 2AK-1 (where K is a positive integer) and print K as the
// output. If N cannot be expressed as 2AK+1 or 2AK-1, the program must print No
// as the output.

// Boundary Condition(s):
// 3 <= N < = 10^8

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the value of K or No.

// Example Input/Output 1:
// Input:
// 17

// Output:
// 4

// Explanation:
// 17 = 2A4 + 1, here K=4 which is printed as the output.

// Example Input/Output 2:
// Input:
// 19

// Output:
// No

// Example Input/Output 3:
// Input:
// 31

// Output:
// 5

import java.util.*;
public class (2_Power_K+1)_OR_ (2_Power_K-1)
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt(),count=0;
        for(int i=1;i<=num;i++)
        {
            int pos=(int)Math.pow(2,i)+1;
            int neg=(int)Math.pow(2,i)-1;
            if(pos==num || neg==num)
            {
                System.out.print(i);
                count++;
                break;
            }
        }
        if(count==0)System.out.print("No");
    }
}