// The program must accept two integers X and Y (where X and Y contain the same number of digits) as the input. The program must print the product of the first digits in X and Y, the product of second digits in X and Y and so on.

// Boundary Condition(s);
// 1<= X,Y <=10^9

// Input Format:
// The first line contains the values of X and Y separated by a space.

// Output Format:
// The first line contains the integer values separated by a space.

// Example Input/Output 1:
// Input:
// 153 259

// Output:
// 2 25 27

// Explanation:
// The product of the first digits in 153 and 259 is 2(2 x 1).
// The product of the second digits in 153 and 259 is 25(5x5).
// The product of the third digits in 153 and 259 is 27(3x9).

// Example Input/Output 2:
// Input:
// 1020 9100

// Output:
// 9 0 0 0


import java.util.*;
public class Product_Each_Digit 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next(),b=obj.next();
        char[] c=a.toCharArray();
        char[] d=b.toCharArray();
        int pro1=0,pro2=0;
        for(int i=0;i<a.length();i++)
        {
            pro1=Integer.parseInt(String.valueOf(c[i]));
            pro2=Integer.parseInt(String.valueOf(d[i]));
            System.out.print(pro1*pro2+" ");
        }
    }
}