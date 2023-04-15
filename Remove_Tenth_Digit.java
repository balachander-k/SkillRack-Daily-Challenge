// A number N is passed as the input. The program must remove tenth digit (if present)
// and print the resulting value.

// Boundary Condition(s):
// 1 <= N <= 10^8

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains an integer value (after tenth digit is removed).

// Example Input/Output 1:
// Input:
// 569

// Output:
// 59

// Explanation:
// The tenth digit is 6. So after removing it the value is 59.

// Example Input/Output 2:
// Input:
// 3

// Output:
// 3


import java.util.*;
public class Remove_Tenth_Digit
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine(),val="";
        int len=a.length()-2;
        if(a.length()==2)
            System.out.print(a.charAt(1));
        else 
        {
            for(int i=a.length()-1;i>=0;i--)
            {
                if(len==i)
                    continue;
                else
                    val=a.charAt(i)+val;
                    
            }
            System.out.print(val);
        }
            
    }
}