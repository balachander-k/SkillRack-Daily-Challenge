// The program must accept an integer N as the input. The program must print the
// sum of prime integers from 1 to N ending with 7 as the output.

// Boundary Condition(s):
// 10 <= N <=10^8

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the sum of prime integers from 1 to N ending with 7.

// Example Input/Output 1:
// Input:
// 42

// Output:
// 61

// Explanation:
// The prime integers from 1 to 42 which ends with 7 are 7, 17 and 37.
// The sum of 7, 17 and 37 is 61.
// Hence the output is 61

// Example Input/Output 2:
// Input:
// 156

// Output:
// 643

import java.util.*;
public class Sum_Prime_Integers_Ending_With_7
{
    public static boolean isPrime(int r)
    {
        boolean flag=false;
        for(int j=2;j<=r/2;j++)
        {
            if(r%j==0)
            {
                flag=true;
                break;
            }
        }
        if(!flag)return true;
        else return false;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),sum=0;
        for(int i=1;i<=N;i++)
        {
            if(isPrime(i))
            {
                String val=String.valueOf(i);
                if(val.charAt(val.length()-1)=='7')
                    sum=sum+i;
            }
        }
        System.out.print(sum);
    }
}