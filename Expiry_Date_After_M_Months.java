// The program must accept the date of manufacture D (in the format MM-YYYY) and the
// validity of a product in months M as the input. The program must print the expiry date of
// the product in the same format MM-YYYY as the output.

// Boundary Condition(s):
// 1<= N <= 100

// Input Format:
// The first line contains D.
// The second line contains M.

// Output Format:
// The first line contains the expiry date of the product.

// Example Input/Output 1:
// Input:
// 08-2019
// 18

// Output:
// 02-2021

// Explanation:
// The date of manufacture is 08-2019.
// Here the validity M = 18, so after 18 months the date becomes 02-2021.
// Hence the output is 02-2021
// Example Input/Output 2:
// Input:
// 01-2013
// 11

// Output:
// 12-2013

import java.util.*;
public class Expiry_Date_After_M_Months
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String val=obj.nextLine();
        int num=obj.nextInt(),count=1;
        String[] arr=val.split("-");
        int month=Integer.valueOf(arr[0]),year=Integer.valueOf(arr[1]);
        while(count<=num)
        {
            month++;
            count++;
            if(month>12)
            {
                month=1;
                year++;
            }
        }
        if(month<=9)
            System.out.print("0");
        System.out.print(month+"-"+year);
        
    }
}