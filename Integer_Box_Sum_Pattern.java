// The program must accept two integers X and Y as the input. The program must
// print the desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 1 <= N <= 1000

// Input Format:
// The first line contains X and Y separated by a space.

// Output Format:
// The lines contain the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 1 5

// Output:

// +--+
// |01|
// |02|
// |03|
// |04|
// |05|
// +--+
// |15|
// +--+

// Example Input/Output 2:
// Input:
// 110 113

// Output:
// +---+
// |110|
// |111|
// |112|
// |113|
// +---+
// |446|
// +---+

import java.util.*;
public class Integer_Box_Sum_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt(),y=obj.nextInt(),sum=0;
        for(int i=x;i<=y;i++)
            sum=sum+i;
        int slen=(int)Math.log10(sum)+1;
        String hypen="-";
        System.out.println("+"+hypen.repeat(slen)+"+");
        while(x<=y)
        {
            int len=(int)Math.log10(x)+1;
            int zero=Math.abs(len-slen);
            System.out.print("|");
            for(int i=0;i<zero;i++)
                System.out.print("0");
            System.out.println(x+"|");
            x++;
        }
        System.out.println("+"+hypen.repeat(slen)+"+");
        System.out.println("|"+sum+"|");
        System.out.println("+"+hypen.repeat(slen)+"+");
    }
}