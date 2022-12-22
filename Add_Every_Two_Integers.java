// The program must accpet N integers as the input. The program must add every two integers and print their sum as the output.

// Boundary Condition(s);
// 2<= N <=100
// 1<= Each integer value <=10^7

// Input Format:
// The first line contains the value of N.
// The second line contains N integers separated by space(s).

// Output Format:
// The first line contains N-1 values separated by space.

// Example Input/Output 1:
// Input:
// 5
// 6 5 3 2 8

// Output:
// 11 8 5 10

// Explanation:
// The sum of the first integer and the second integer (6+5) is 11.
// The sum of the second integer and the third integer (5+3) is 8.
// The sum of the third integer and the fourth integer (3+2) is 5.
// The sum of the fourth integer and the fifth (2+8) is 10.
// Hence the output is 11 8 5 10.

// Example Input/Output 2:
// Input:
// 7
// 12 23 34 45 56 67 78

// Output:
// 35 57 79 101 123 145



import java.util.*;
public class Add_Every_Two_Integers
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int[] b=new int[a];
        for(int i=0;i<a;i++)b[i]=obj.nextInt();
        int sum=0;
        for(int i=0;i<a;i++)
        {
            if(i+1<a)
            {
                sum=b[i]+b[i+1];
                System.out.print(sum+" ");
                sum=0;
            }
        }
    }
}