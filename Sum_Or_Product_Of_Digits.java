// The program must accept an integer N as the input. The program must print the sum of the digits in N if N is even. Else the program must print the product of digits in N as the output.

// Boundary Condition(s);
// 1<= N <=10^18

// Input Format:
// The first line contains the integer N.

// Output Format:
// The first line contains either the sum of the digits in N or the product of digits in N.

// Example Input/Output 1:
// Input:
// 453652

// Output:
// 25

// Explanation:
// The integer 453652 is odd. So the sum of the digits in 453652 is 25(4+5+3+6+5+2).
// Hence the output is 25.

// Example Input/Output 2:
// Input:
// 21841

// Output:
// 64 


import java.util.*;
public class Sum_Or_Product_Of_Digits
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        long a=obj.nextLong();
        String b=String.valueOf(a);
        char[] c=b.toCharArray();
        int temp=0,sum=0,pro=1;
        if(a%2==0)
        {
            for(int i=0;i<c.length;i++)
            {
                temp=Integer.parseInt(String.valueOf(c[i]));
                sum=sum+temp;
            }
            System.out.print(sum);
        }
        else 
        {
            for(int i=0;i<c.length;i++)
            {
                temp=Integer.parseInt(String.valueOf(c[i]));
                pro=pro*temp;
            }
            System.out.print(pro);
        }
        
    }
    
}