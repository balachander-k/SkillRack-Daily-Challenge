// The program must accept an integer N the input. The program must print the desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s);
// 1<= N <=10^9

// Input Format:
// The first line contains the value of N.

// Output Format:
// The list of lines containing the desired pattern as shown in the Example Input/Output section.

// Example Input/Output 1:
// Input:
// 9

// Output:
// 1001
// *001
// **01
// ***1

// Example Input/Output 2:
// Input:
// 15

// Output:
// 1111
// *111
// **11
// ***1


import java.util.*;
public class Triangle_Binary_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        String b=Integer.toBinaryString(a);
        char[] c=b.toCharArray();
        System.out.println(b);
        for(int i=1;i<c.length;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print("*");
            for(int k=i;k<c.length;k++)
                System.out.print(c[k]);
            System.out.println();
        }
    }
}