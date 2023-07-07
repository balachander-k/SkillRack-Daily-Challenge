// The program must accept an integer N and a sum value X (sum of unit digit, tenth
// digit and hundredth digit of N) as the input The hundredth digit is removed
// from N. The program must find the hundredth digit and print N by reframing it as
// the output.

// Boundary Condition(s):
// 1 <= N <= 10^8
// 1 <= x <= 27

// Input Format:
// The first line contains the two integer values N and X separated by a space.
// Output Format:
// The first line contains the reframed N.

// Example Input/Output 1:
// Input:
// 1269 20
// Output:
// 12569

// Explanation:
// The sum of the last two digits in 1269 is 15. The difference between 20 and 15 is 5
// (20-15).
// So the hundredth digit is 5. After reframing the N is 12569.
// Hence the output is 12569.

// Explanation:
// The sum of the last two digits in 1269 is 15. The difference between 20 and 15 is 5
// (20-15).
// So the hundredth digit is 5. After reframing the N is 12569.
// Hence the output is 12569.

// Example Input/Output 2:
// Input:
// 43217 9

// Output:
// 432117

import java.util.*;
public class Reframe_With_Hundread_Digit
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=obj.nextInt();
        int digit=(a/10)%10,diff=digit=Math.abs(digit-b);
        String v=String.valueOf(a),val="";
        for(int i=v.length()-1;i>=0;i--)
        {
            if(i==v.length()-3)
                val=v.charAt(i)+val;
            val=v.charAt(i)+val;
        }
        System.out.print(val);
    }
}