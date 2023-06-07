// The program must accept N integers and a digit D as the input. The program must
// print all the integers which are not having the digit D as the output. If there is no
// such integer then the program must print -1 as the output.

// Boundary Condition(s):
// 1 <= N <=100
// 0 <= D <=9
// 1 <= Each integer value <= 10^8

// Input Format:
// The first line contains the values of N and D separated by a space.
// The second line contains N integers separated by space(s).

// Output Format:
// The first line contains the integers separated by a space as per the given conditions.

// Example Input/Output 1:
// Input:
// 82
// 14 21 492 58 67 622 827 904

// Output:
// 14 58 67 904

// Explanation:
// The integers which are not having the digit 2 are 14, 58, 67 and 904. So they are
// printed as the output.

// Example Input/Output 2:
// Input:
// 5 0
// 150 708 302 950 460

// Output:
// -1

import java.util.*;
public class Integers_Without_Digit_D
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt(),digit=obj.nextInt(),flag=0,rem=0;
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=obj.nextInt();
        for(int i=0;i<size;i++)
        {
            int temp=arr[i];
            int count=0;
            while(temp!=0)
            {
                rem=temp%10;
                if(rem==digit)
                    count++;
                temp=temp/10;
            }
            if(count==0)
            {
                System.out.print(arr[i]+" ");
                flag=1;
            }
        }
        if(flag==0)
            System.out.print("-1");
    }
}