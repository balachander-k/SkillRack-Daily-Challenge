// The program must accept N integers as the input. The program must print the sum of the smallest digit in each integer among N integers as the output.

// Boundary Condition(s);
// 1<= N <=100
// 1<= Each integer value <=10^15

// Input Format:
// The first line contains the integer N.
// The second line contains N integers separated by space(s).

// Output Format:
// The first line contains the sum of the smallest digit in each integer among N integers.

// Example Input/Output 1:
// Input:
// 6
// 98 765 296 43 1 2673

// Output:
// 21

// Explanation:
// The smallest digit in the numbers 98,765,296,43,1 and 2673 are 8,5,2,3,1 and 2 respectively.
// So their sum is 21(8+5+2+3+1+2).
// Hence the output is 21.

// Example Input/Output 2:
// Input:
// 4
// 6097 9674 2313 4407

// Output:
// 5



import java.util.*;
public class Sum_Smallest_Digit_Of_The_Integers
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int[] array=new int[a];
        for(int i=0;i<a;i++)
            array[i]=obj.nextInt();
        int temp,min=0,rem=0,sum=0;
        for(int i=0;i<a;i++)
        {
            temp=array[i];
            min=temp;
            while(temp!=0)
            {
                rem=temp%10;
                if(min>rem)
                    min=rem;
                temp=temp/10;
            }
            sum=sum+min;
        }
        System.out.print(sum);
    }
}