// The program must acept two integers N and X as the input. The program must print the product of the Xth digit from the first and the Xth digit from the last in the integer N as the output.

// Boundary Condition(s);
// 1<= N <=10^18
// 1<= X <=Number of digits in N

// Input Format:
// The first line contains two integers N ans X separated by a space.


// Output Format:
// The first line contains the product of the Xth digit from the first and the Xth digit from the last in the integer N.

// Example Input/Output 1:
// Input:
// 34586 2

// Output:
// 32

// Explanation:
// The 2nd digit from the first in 34586 is 4.
// The 2nd digit from the last in 34586 is 8.
// So their product is 32(4*8).
// Hence the output is 32

// Example Input/Output 2:
// Input:
// 16840 5

// Output:
// 0


import java.util.*;
public class Product_Of_Xth_Digits_First_And_Last 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next();
        int b=obj.nextInt();
        char[] c=a.toCharArray();
        char first='0',last='0';
        int j=0,r=0,len=a.length()-1;
        while(j!=b)
        {
            first=c[j];
            j++;
        }
        while(r!=b)
        {
            last=c[len];
            len--;
            r++;
        }
        int f=Integer.parseInt(String.valueOf(first));
        int l=Integer.parseInt(String.valueOf(last));
        System.out.print(f*l);
    }
}