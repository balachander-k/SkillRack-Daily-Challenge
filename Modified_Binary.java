// The program must accept an integer N as the input. The program must find the
// binary representation of N. Then the program must replace all the I's by
// numbering them from 1 (left to right). Then the program must replace all the O's
// by numbering them from 1 (right to left). Finally, the program must print the
// modified binary representation of N as the output.

// Boundary Condition(s):
// 1 <= N <=10^8

// Input Format:
// The first line contains the value of N.

// Output Format:
// The first line contains the modified binary representation of N.

// Example Input/Output 1:
// Input:
// 34

// Output:
// 143221

// Explanation:
// The binary representation of 34 is 100010
// After replacing all the I's by numbering them from 1 (left to right), the binary
// representation becomes 100020.
// After replacing all the 0's by numbering them from 1 (right to left), the binary
// representation becomes 143221.


// Example Input/Output 2:
// Input:
// 90402

// Output:
// 1112310987465543261



import java.util.*;
public class Modified_Binary
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        String b=Integer.toBinaryString(a);
        char[] c=b.toCharArray();
        int one=0,zero=0;
        int[] arr=new int[b.length()];
        for(int i=0;i<c.length;i++)
        {
            int t=Integer.parseInt(String.valueOf(c[i]));
            if(t==1)
            {
                one++;
                arr[i]=one;
            }
        }
        for(int i=c.length-1;i>=0;i--)
        {
            int q=Integer.parseInt(String.valueOf(c[i]));
            if(q==0)
            {
                zero++;
                arr[i]=zero;
            }
        }
        for(int i=0;i<c.length;i++)
            System.out.print(arr[i]);
        
    }
}