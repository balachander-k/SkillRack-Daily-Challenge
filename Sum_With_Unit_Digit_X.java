// The program must accept N integers and an integer X as the input. The program must print the sum of integers (among N integers) which are having X as their unit digit as the output.

// Boundary Condition(s);
// 1<= N <=1000
// 0<= X <=9

// Input Format:
// The first line contains N and X separated by space(s).
// The second line contains N integers separated by space(s).

// Output Format:
// The first line contains an integer.

// Example Input/Output 1:
// Input:
// 5 8
// 23 68 21 8 42

// Output:
// 76

// Explanation:
// The integers with unit digit as 8 are 68 and 8.
// Their sum is 76.

// Example Input/Output 2:
// Input:
// 8 9
// 79 80 71 59 55 18 69 68

// Output:
// 207


import java.util.*;
public class Sum_With_Unit_Digit_X
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),X=obj.nextInt();
        int array[]=new int[N];
        for(int i=0;i<N;i++)
            array[i]=obj.nextInt();
        int temp,sum=0;
        for(int i=0;i<N;i++)
        {
            temp=array[i]%10;
            if(temp==X)
                sum=sum+array[i];
        }
        System.out.print(sum);
    }
}