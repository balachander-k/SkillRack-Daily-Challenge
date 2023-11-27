// The program must accept two integers X and Y as the input. The program must
// swap the first digit of X and the last occurring nonzero digit of Y. Then the
// program must print the sum of X and Y as the output.

// Boundary Condition(s):
// 1 <= X,Y <= 10^8

// Input Format:
// The first line contains X and Y separated by a space.

// Output Format:
// The first line contains the sum of X and Y as per the given condition.

// Example Input/Output 1:
// Input:
// 524 1200

// Output:
// 1724

// Explanation:
// The first digit of 524 is 5.
// The last occurring nonzero digit of 1200 is 2.
// After swaping those two digits, the integers become 224 and 1500.
// So their sum 1724 is printed as the output.

// Example Input/Output 2:
// Input:
// 1000 2000

// Output:
// 3000

import java.util.*;
public class Swap_First_&_Last_Nonzero 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] x=obj.next().toCharArray();
        char[] y=obj.next().toCharArray();
        char c='0';
        int index=0;
        for(int j=y.length-1;j>=0;j--)
            if(y[j]!='0')
            {
                c=y[j];
                index=j;
                break;
            }
        y[index]=x[0];
        x[0]=c;
        System.out.print(Integer.valueOf(String.valueOf(x))+Integer.valueOf(String.valueOf(y)));
    }
}