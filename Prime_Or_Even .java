// The program must accept an integer N as the input. The program must print valid if N is a prime number or an even number. Else the program must print the invalid as the output.

// Boundary Condition(s);
// 1<= N <=10^5

// Input Format:
// The first line contains the integer N.

// Output Format:
// The first line contains either valid or invalid.

// Example Input/Output 1:
// Input:
// 53

// Output:
// valid

// Explanation:
// The integer 53 is a prime number.
// Hence the output is valid.

// Example Input/Output 2:
// Input:
// 27

// Output:
// invalid

// Example Input/Output 3:
// Input:
// 100

// Output:
// valid



import java.util.*;
public class Prime_Or_Even 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        long a=obj.nextLong();
        long count=0;
        for(int i=1;i<=100000;i++)
        {
            if(a%i==0)
                count++;
        }
        if((count==2)|| a%2==0)
            System.out.print("valid");
        else 
            System.out.print("invalid");
    }
}