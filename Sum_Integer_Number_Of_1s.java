// The program must accept an integer N as the input. The program must print "YES"
// if N is not equal to the sum of any positive integer X and the numbers of Is in the
// binary representation of X. Else the program must print "NO" as the output.

// Boundary Condition(s):
// 1 <= N <= 10^5

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains YES or NO.

// Example Input/Output 1:
// Input:
// 5

// Output:
// NO

// Explanation:
// Here N = 5.
// If X = 3, the sum of 3 and the number of Is in the binary representation of 3 is
// equal to 5.
// The binary representation of 3 is 11.
// 3 + (Number of Is in 11) = (3 + 2) = 5
// So NO is printed as the output.

// Example Input/Output 2:
// Input:
// 6

// Output:
// YES

// Explanation:
// Here N = 6.
// There is no positive integer that matches the given conditions.
// So YES is printed as the output.



import java.util.*;
public class Sum_Integer_Number_Of_1s
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),pair=0;
        for(int i=1;i<=N;i++)
        {
            int one=0;
            String bin=Integer.toBinaryString(i);
            for(int j=0;j<bin.length();j++)
                if(bin.charAt(j)=='1')
                    one++;
            if((i+one)==N)pair++;
        }
        System.out.println((pair==0)?"YES":"NO");
    }
}