// The program must accept an integer N as the input. The program must print the odd
// digits from the last digit and remove the last digit of N then again print the odd
// digits from the last digit and remove the last digit and so on. If there is no odd digit
// in the original N then print -1 as the output.

// Boundary Condition(s):
// 1 <=  N<= 1O^7

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains either odd digits as per the condition separated by a space or

// Example Input/Output 1:
// Input:
// 12345

// Output:
// 5 3 1 3 1 3 1 1 1

// Explanation:
// In 12345, the odd digits 5,3 and 1 are printed.
// After removing the last digit the integer becomes 1234.
// In 1234, the odd digits 3 and 1 are printed.
// After removing the last digit the integer is 123.
// In 123, the odd digits 3 and 1 are printed.
// After removing the last digit the integer is 12.
// In 12, the odd digit 1 is printed.
// After removing the last digit the integer becomes 1.
// In 1, the odd digit 1 is printed.

// Example Input/Output 2:
// Input:
// 2468

// Output:
// -1

import java.util.*;
public class Odd_Digits_Reverse_Pattern 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int temp=obj.nextInt(),val=0,count=0;
        while(temp!=0)
        {
            val=temp;
            while(val!=0)
            {
                int rev=val%10;
                if(rev%2!=0)
                {
                    System.out.print(rev+" ");
                    count++;
                }
                val=val/10;
            }
            temp=temp/10;
        }
        if(count==0)System.out.print("-1");
    }
}