// The program must accept three integers N, A and B as the input. The program must toggle
// the bits in the positions from A to B in the binary representation of N. Then the program
// must print the modified value of N as the output. If it is not possible to apply the given
// range in the binary representation of N, then the program must pad the minimum number
// of leading zeros in the binary representation of N and toggle the bits in the range.

// Boundary Condition(s):
// 1 <= N <= 10^5
// 1 <= N <= 30

// Input Format:
// The first line contains N.
// The second line contains A and B separated by a space.

// Output Format:
// The first line contains the modified value of N.

// Example Input/Output 1:
// Input:
// 16
// 2 4

// Output:
// 30

// Explanation:
// The binary representation of 16 is 10000.
// After toggling the bits in the positions from 2 to 4, the binary representation becomes
// So 30 is printed as the output.
// So 30 is printed as the output.

// Example Input/Output 2:
// Input
// 50
// 2 7

// Output:
// 13

// Explanation:
// The binary representation of 50 is 110010.
// Here B = 7 but the binary representation of 50 contains only 6 bits. So one leading zero is
// padded. Now the binary representation becomes 0110010.
// After toggling the bits in the positions from 2 to 7, the binary representation becomes
// 0001101.
// The decimal equivalent of 0001101 is 13.
// So 13 is printed as the output.


import java.util.*;
public class Toggle_Bits_In_Range 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),a=obj.nextInt(),b=obj.nextInt();
        String v=Integer.toBinaryString(N),r="";
        if(b>v.length())
        {
            int temp=Math.abs(b-v.length());
            for(int i=1;i<=temp;i++)
                v="0"+v;
        }
        for(int j=0;j<v.length();j++)
        {
            int count=0;
            for(int i=a-1;i<=b-1;i++)
                if(j==i){
                    count++;break;
                }
            if(count!=0)
            {
                if(v.charAt(j)=='0')
                    r+="1";
                else 
                    r+="0";
            }
            else 
                r+=v.charAt(j);
        }
        System.out.print(Long.valueOf(r,2));
    }
}