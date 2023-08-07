// The program must accept an integer X and swap the first occurring odd and even
// digit. The integer X will have at least one odd and one even digit Consider 0 (zero)
// also as an even digit.

// Boundary Condition(s):
// 10 <= X <= 10^8

// Input Format:
// The first line contains X.

// Output Format:
// The first line contains the modified integer value.

// Example Input/Output 1:
// Input:
// 12345

// Output:
// 21345

// Example Input/Output 2:
// Input:
// 106

// Output:
// 16

import java.util.*;
public class Swap_First_Occurring_Odd_And_Even_Digit
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next();
        char[] b=a.toCharArray();
        int o=0,ev=0,e=0,od=0;
        char odd='0',even='0';
        for(int i=0;i<b.length;i++)
        {
            int value=Integer.parseInt(String.valueOf(b[i]));
            if(value%2==0 && e==0)
            {
                even=b[i];
                e++;
            }
            if(value%2!=0 && o==0)
            {
                odd=b[i];
                o++;
            }
        }
        for(int i=0;i<b.length;i++)
        {
            int value=Integer.parseInt(String.valueOf(b[i]));
            if(value%2==0 && ev==0)
            {
                b[i]=odd;
                ev++;
            }
            if(value%2!=0 && od==0)
            {
                b[i]=even;
                od++;
            }
        }
        String val=String.valueOf(b);
        System.out.print(Integer.parseInt(val));
    }
}