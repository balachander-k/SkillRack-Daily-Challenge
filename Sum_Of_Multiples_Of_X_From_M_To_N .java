// The program must accept three integers M,N, and X as the input. The program must print the sum of multiples of X from M to N as the output. If there is no multiple of X from M to N then the program must print -1 as the output.

// Boundary Condition(s);
// 1<= N <=1000
// 1<= M <= N
// 1<= X <= 100

// Input Format:
// The first line contains the values of M,N and X separated by space(s).

// Output Format:
// The first line contains either the sum of multiples of X from M to N or -1.

// Example Input/Output 1:
// Input:
// 5 25 3

// Output:
// 105

// Explanation:
// The multiples of 3 from 5 t0 25 are 6,9,12,15,18,21 and 24.
// So their sum is 105 (6+9+12+15+18+21+24).
// Hence the output is 105.

// Example Input/Output 2:
// Input:
// 10 20 33

// Output:
// -1




import java.util.*;
public class Sum_Of_Multiples_Of_X_From_M_To_N 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int m=obj.nextInt();
        int n=obj.nextInt();
        int x=obj.nextInt();
        int sum=0;
        for(int i=m;i<=n;i++)
        {
            if(i%x==0)
                sum=sum+i;
        }
        if(sum==0)
            System.out.print("-1");
        else 
            System.out.print(sum);
    }
}