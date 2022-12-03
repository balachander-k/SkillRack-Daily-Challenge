// The program must accept an integer N as the input. The program must print the first N terms in the series given below as the output.
// Note:
// The order of the series must be 1, 5,15,34,65,111,175,260,369,505 and so on.

// Boundary Condition(s);
// 1<= N <=1000

// Input Format:
// The first line contains the integer N.

// Output Format:
// The first line contains the first N terms in the above mentioned series separated by space.

// Example Input/Output 1:
// Input:
// 5

// Output:
// 1 5 15 34 65

// Explanation:
// The first term in the series is 1.
// The second term in the series is 5(2+3).
// The third term in the series is 15(4+5+6).
// The fourth term in the series is 34(7+8+9+10).
// The fifth term in the series is 65(11+12+13+14+15).
// Hence the output is 1 5 15 34 65

// Example Input/Output 2:
// Input:
// 8

// Output:
// 1 5 15 34 65 111 175 260






import java.util.*;
public class First_N_Terms
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int temp=1,sum=0;
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=i;j++)
            {
                sum=sum+temp;
                temp++;
            }
            System.out.print(sum+" ");
            sum=0;
        }

    }
}