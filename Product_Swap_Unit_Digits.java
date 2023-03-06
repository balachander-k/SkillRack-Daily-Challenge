// The program must accept two integers X and Y as the input. The program must print the
// product of X and Y after swapping their unit digits as the output.

// Boundary Condition(s):
// 1 <= X,Y <=IO^9

// Input Format:
// The first line contains the value of X and Y separated by a space.

// Output Format:
// The first line contains the product of X and Y after swapping their unit digits.

// Example Input/Output 1:
// Input:
// 984 51

// Output:
// 52974

// Explanation:
// After swapping the unit digits of 984 and 51, their values become 981 and 54.
// So the product of 981 and 54 is 52974.
// Hence the output is 52974

// Example Input/Output 2:
// Input:
// 3988477 48754884

// Output:
// 194457599172438

import java.util.*;
public class Product_Swap_Unit_Digits
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next(),b=obj.next(),val="",cal="";
        char c=a.charAt(a.length()-1),d=b.charAt(b.length()-1);
        char[] f=a.toCharArray();
        char[] y=b.toCharArray();
        f[a.length()-1]=d;
        y[b.length()-1]=c;
        val=String.valueOf(f);
        cal=String.valueOf(y);
        System.out.print(Long.parseLong(val)*Long.parseLong(cal));
    }
}