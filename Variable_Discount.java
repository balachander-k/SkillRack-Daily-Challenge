// The program must accept an integer P which represents the price of an item in a supermarket
// as the input. The program must print the discount amount for P up to 2 decimal places based
// on the following conditions,
// - If the price is less than or equal to Rs. 1000 then 10 percentage discount is applied.
// - Else if the price is greater than Rs. 1000 then 10 percentage discount is applied up to Rs. 1000
// and 5 percentage discount is applied for the remaining price amount.

// Boundary Condition(s):
// I <= p <= 99999999

// Input Format:
// The first line contains the value of P.

// Output Format:
// The first line contains the discount price up to 2 decimal places.

// Example Input/Output 1:
// Input:
// 852

// Output:
// 85.20


// Example Input/Output 2:
// Input:
// 1543

// Output:
// 127.15



import java.util.*;
public class Variable_Discount
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        long a=obj.nextLong();
        double f1=0.1,f2=0.05;
        if(a<=1000)
        {
            double dis=f1*a;
            System.out.format("%.2f",dis);
        }
        if(a>1000)
        {
            double t=f1*1000;
            double min=1000-a;
            double dis=min*f2;
            double to=Math.abs(dis)+t;
            System.out.format("%.2f",to);
        }
    }
}