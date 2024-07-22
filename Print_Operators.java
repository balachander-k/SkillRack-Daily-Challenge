// The program must accept N integers and two other integers P and Q as the input. For each
// integer value X among the N integers, the program must print the operator based on the
// following conditions.
// If X is a result of P / Q then print/
// If X is a result of P * Q then print *
// If X is a result of P + Q then print +
// If X is a result of P - Q then print -
// otherwise, print #
// Note: The expression evaluation based on precedence (/,
// integer arithmetic and hence 3/2 can be considered as 1.

// Boundary Condition(s):
// 1 <= N <=100
// O <= Each integer value <= 10^8

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.
// The third line contains P and Q separated by a space.

// Output Format:
// +1 The division follows
// The first line contains the operators as per the given conditions separated by a space.

// Example Input/Output 1:
// Input:
// 6
// 2 50 7 5 1 15
// 10 5

// Output:
// / * # - # +

// Explanation:
// The integer 2 is a result of 10/5. So '/' is printed.
// The integer 50 is a result of 10*5. So is printed.
// The integer 7 is not a result of any operation of 10 and 5 (10/5, 10*5, 10+5, 10-5). So is
// printed.
// The integer 5 is a result of 10-5. So '-' is printed.
// The integer 1 is not a result of any operation of 10 and 5 (10/5, 10*5, 10+5, 10-5). So is
// printed.
// The integer 15 is a result of 10+5. So '+' is printed.

// Example Input/Output 2:
// Input:
// 5
// 2 6 7 5 1
// 3 2

// Output:




import java.util.*;
public class Print_Operators
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=obj.nextInt();
        int p=obj.nextInt(),q=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            if((p/q)==arr[i])
                System.out.print("/"+" ");
            else if((p*q)==arr[i])
                System.out.print("*"+" ");
            else if((p+q)==arr[i])
                System.out.print("+"+" ");
            else if((p-q)==arr[i])
                System.out.print("-"+" ");
            else 
                System.out.print("#"+" ");
            
        }
        
    }
}