// The program must accept N integers and an integer X as the input. The program
// must print the sum of integers from the integer as the output. If there is
// no 2AX integers from the integer then print the sum of all integers from the
// integer as the output.

// Boundary Condition(s):
// 3 <= N < = 1000
// 1 <= Each integer value <=1000
// 1 <= X <=9

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.
// The third line contains X.

// Output Format:
// The first line contains the sum based on the given conditions.

// Example Input/Output 1:
// Input:
// 5
// 2 1 4 3 5
// 2

// Output:
// 13

// Explanation:
// Here X = 2, SO 2A2 = 4.
// The 2nd integer is 1, so the 4 integers from 1 are 1 43 5 and their sum is 13.
// Hence the output is 13

// Example Input/Output 2:
// Input:
// 6
// 5 4 7 3 9 1
// 3

// Output:
// 20


import java.util.*;
public class Sum_2^x_Integers_From_Xth_Integer
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt(),count=0,sum=0;
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=obj.nextInt();
        int x=obj.nextInt(),pow=(int)Math.pow(2,x);
        for(int i=x-1;i<size;i++)
        {
            if(count==pow)
                break;
            sum=sum+arr[i];
            count++;
        }
        System.out.print(sum);
    }
}