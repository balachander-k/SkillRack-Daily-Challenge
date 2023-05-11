// The program must accept an integer N as the input. The program must print the
// integers from 1 to N having all their digits as odd.

// Boundary Condition(s):
// 1 <= N <=10^8

// Input Format:
// The first line contains the value of N.
// Output Format:
// The first line contains the integers separated by a space as per the given
// conditions.

// Example Input/Output 1:
// Input:
// 12

// Output:
// 1 3 5 7 9 11

// Explanation:
// 2, 4, 6, 8, 10 and 12 are having even digits in it. So they are not printed.
// The integers from 1 to 12 having all their digits as odd are printed (1 3 5 7 9 11).

// Example Input/Output 2:
// Input:
// 55

// // Output:
// // Output:
// 1 3 5 7 9 11 13 15 17 1931 33 35 37 39 51 53 55


import java.util.*;
public class 1_TO_N_All_Digits_Odd 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        long a=obj.nextLong(),count=0,rev=0,val=0;
        String conv="";
        for(long i=1;i<=a;i++)
        {
            val=i;
            conv=String.valueOf(val);
            count=0;
            while(val!=0)
            {
                rev=val%10;
                if(rev%2!=0)
                    count++;
                val=val/10;
            }
            if(count==conv.length())
                System.out.print(i+" ");
        }
    }
}