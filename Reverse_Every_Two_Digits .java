// The program must accept an integer N with even number of digits as the input.
// The program must reverse every two digits in N and print the modified N as the
// output.

// Boundary Condition(s):
// 10 <= N < 10^16

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the modified N.

// Example Input/Output 1:
// Input:
// 214587

// Output:
// 125478

// Explanation:
// The first two digits are 2 and 1 which are reversed as 1 and 2.
// The second two digits are 4 and 5 which are reversed as 5 and 4.
// The third two digits are 8 and 7 which are reversed as 7 and 8.

// Example Input/Output 2:
// Input:
// 504786

// Output:
// 57468


import java.util.*;
public class Reverse_Every_Two_Digits 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine(),val="";
        char[] b=a.toCharArray();
        int len=a.length()/2,odd=1,even=0;
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<1;j++)
            {
                val=val+b[odd];
                val=val+b[even];
                odd=odd+2;
                even=even+2;
            }
        }
        System.out.print(Long.parseLong(val));
    }
}