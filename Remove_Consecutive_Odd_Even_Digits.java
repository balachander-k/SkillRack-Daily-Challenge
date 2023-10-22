// The program must accept an integer N as the input. The program must remove
// the last occurring consecutive odd digits of N if the last digit of N is odd. Else the
// program must remove the last occurring consecutive even digits of N. Finally, the
// program must print the modified integer N as the output.

// Note: At least one odd digit and one even digit are always present in the integer N.

// Boundary Condition(s):
// 100 < = N <= 10^8

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the modified N.

// Example Input/Output 1:
// Input:
// 2315642

// Output:
// 2315

// Explanation:
// Here N=2315642. The last digit of 2315642 is even.
// After removing the last occurring consecutive even digits of 2315642.
// Now the integer becomes 2315.
// Hence the output is 2315

// Example Input/Output 2:
// Input:
// 92423

// Output:
// 9242

import java.util.*;
public class Remove_Consecutive_Odd_Even_Digits 
{
    public static void isRemove(int w,int e)
    {
        String temp=String.valueOf(e);
        int len=Math.abs(temp.length()-w);
        for(int i=0;i<len;i++)
            System.out.print(temp.charAt(i));
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt(),t=0,j=0,q=x;
        if((x%10)%2==0)
        {
            while(true)
            {
                int rem=x%10;
                if(x%2!=0)
                {
                    t=j;
                    break;
                }
                x=x/10;
                j++;
            }
            isRemove(t,q);
        }
        else 
        {
            while(true)
            {
                int rem=x%10;
                if(x%2==0)
                {
                    t=j;
                    break;
                }
                x=x/10;
                j++;
            }
            isRemove(t,q);
        }
    }
}