// The program must accept an integer N as the input. The program must alternatively
// multiply and add the integers from 1 to N and then the program must print the
// obtained result as the output.

// Boundary Condition(s):
// 1 <=  N <= 30

// Input Format:
// The first line contains an integer N.

// Output Format:
// The first line contains the modified value.

// Example Input/Output 1:
// Input:
// 5

// Output:
// 25
// Explanation:
// The integers from 1 to 5 are 1, 2, 3, 4, and 5.
// The first two integers are 1 and 2 and their product is 2 (1*2) and then the product is
// added with the next integer 3. So the result is 5 (2+3).
// And then the result is multiplied by the next integer 4. So the product is 20 (5*4) and
// then the product is added with the next integer 5. So the result is 25 (20+5).
// Hence the output is 25

// Example Input/Output 2:
// Input:
// 20

// Output:
// 12252937700

import java.util.*;
public class Alternate_Addition_And_Multiplication
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        long a=obj.nextLong();
        long val=0,temp=2;
        if(a==1)
            System.out.print(1);
        else 
        {
            for(int i=3;i<=a;i++)
            {
                if(i%2!=0)
                    val=temp+i;
                if(i%2==0)
                    temp=val*i;
            }
        
        if(a%2==0)
            System.out.print(temp);
        if(a%2!=0)
            System.out.print(val);
        }
    }
}