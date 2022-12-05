// The program must accept N integers as the input. For each integer, the program must print the product of digits in the integer as the output.

// Boundary Condtion(s);
// 1<= N <=10
// 1<= Each integer value <=10^5

// Input Format:
// The first line contains the integer N.
// The second line contains N integers separated  by a space.

// Output Format:
// The first line contains the product of digits for N integers separated by a space.

// Example Input/Output 1:
// Input:
// 4
// 35 87 63 46

// Output:
// 15 56 18 24

// Explanation:
// The product of digits in 35 is 15(3*5).
// The product of digits in 871 is 56(8*7*1).
// The product of digits in 63 is 18(6*3).
// The product of digits in 46 is 24(4*6).
// Hence the output is 15 56 18 24

// Example Input/Output 2:
// Input:
// 5
// 166 56 12 9 765

// Output:
// 36 30 2 9 210



import java.util.*;
public class Product_Of_Digits
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int[] b=new int[a];
        int rem=0,pro=1,temp=0;
        for(int i=0;i<a;i++)
            b[i]=obj.nextInt();
        for(int i=0;i<a;i++)
        {
            temp=b[i];
            while(temp!=0)
            {
                rem=temp%10;
                pro=pro*rem;
                temp=temp/10;
            }
            System.out.print(pro+" ");
            pro=1;
        }
    }
}