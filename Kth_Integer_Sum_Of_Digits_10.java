// The program must accept an integer K as the input. The program must print the
// Kth integer in the series given below.
// 19, 28, 37, 46, 55, 64, 73, 82, 91, 109, 118 and so on.
// Note: The sum of digits in each integer of the above series is exactly 10.

// Boundary Condition(s):
// 1 <= K <=1000

// Input Format:
// The first line contains K.

// Output Format:
// The first line contains the Kth integer in the above mentioned series.

// Example Input/Output 1:
// Input:
// 4

// Output:
// 46

// Explanation:
// The 4th integer in the series is 46 (4 +6 = 10)
// So 46 is printed as the output.

// Example Input/Output 2:
// Input:
// 7

// Output:
// 73

import java.util.*;
public class Kth_Integer_Sum_Of_Digits_10 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        long num=obj.nextLong(),temp=9,i=1,n=0;
        while(i<=num)
        {
            String val=String.valueOf(num);
            int sum=0;
            for(int j=0;j<val.length();j++)
                sum=sum+Integer.parseInt(String.valueOf(val.charAt(j)));
            if(sum==10)
            {
                n=temp;
                i++;
            }
            temp=temp+9;
        }
    }
}