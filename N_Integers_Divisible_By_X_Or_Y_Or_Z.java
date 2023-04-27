// The program must accept four integers N, X, Y and Z as the input. The program
// must print the first N integers which are only divisible by X or Y or Z as the output

// Boundary Condition(s):
// 1 <= N <=1000

// Input Format:
// The first line contains four integers N, X, Y and Z separated by space(s).

// Output Format:
// The first line contains the first N integers which are only divisible by X or Y or Z
// separated by a space.

// Example Input/Output 1:
// Input:
// 10 5 7 3

// Output:
// 3 5 6 7 9 10 12 14 18 20

// Explanation:
// 3 is only divisible by 3.
// 5 is only divisible by 5.
// 6 is only divisible by 3.
// 7 is only divisible by 7.
// 9 is only divisible by 3.
// 10 is only divisible by 5.
// 12 is only divisible by 3.
// 14 is only divisible by 7.
// 18 is only divisible by 3.
// 20 is only divisible by 5.
// Hence the output is 3 5 6 7 9 10 12 14 18 20

// Example Input/Output 2:
// Input:
// 5 9 2 7

// Output:
// 2 4 6 7 8


import java.util.*;
public class N_Integers_Divisible_By_X_Or_Y_Or_Z
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=obj.nextInt(),c=obj.nextInt(),d=obj.nextInt(),temp=1,count=0;
        while(count!=a)
        {
            if((temp%b==0 && (temp%c!=0 && temp%d!=0)) || (temp%c==0 && (temp%d!=0 && temp%b!=0)) || (temp%d==0 && (temp%b!=0 && temp%c!=0)))
            {
                System.out.print(temp+" ");
                count++;
            }
            temp++;
        }
    }
}