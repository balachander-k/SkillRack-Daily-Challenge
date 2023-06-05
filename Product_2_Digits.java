// The program must accept an integer N as the input. If the number of digits in N is
// even then the program must print product of every two digits in N as the output. If
// the number of the digits in N is odd then the program must print the product of
// every two digits in N then it must print the remaining digit (last digit) as it is as the
// output.
// Boundary Condition(s):
// 1 <= N <=1O^15

// Input Format:
// The first line contains the integer N.

// Output Format:
// The first line contains the integers separated by space as per the given condition.

// Example Input/Output 1:
// Input:
// 1234

// Output:
// 2 12

// Explanation:
// The number of digits in 1234 is 4 which is even.
// The product of the first two digits is 2 (1 * 2).
// The product of the next two digits is 12 (3 * 4).
// Hence the output is 2 12

// Example Input/Output 2:
// Input:
// 19849

// Output:
// 9 32 9

import java.util.*;
public class Product_2_Digits
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next();
        int len=a.length(),y=0;
        if(len%2==0 || len%2!=0)
        {
            for(int i=0;i<len/2;i++)
            {
                int val=1,l=0;
                while(l!=2)
                {
                    int temp=Integer.parseInt(String.valueOf(a.charAt(y)));
                    val=val*temp;
                    y++;
                    l++;
                }
                System.out.print(val+" ");
            }
        }
        if(len%2!=0)
            System.out.print(a.charAt(a.length()-1));
   
    }
}