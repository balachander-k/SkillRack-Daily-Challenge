// The program must accept an integer M as the input. The program must print the
// number of days in the month M if it is valid. Else the program must print Invalid as
// the output.

// Note: The number of days in each month will be considered from a non-leap year.

// Boundary Condition(s):
// 1 <= M <= 50

// Input Format:
// The first line contains M.

// Output Format:
// The first line contains the number of days in the month M or Invalid.

// Example Input/Output 1:
// Input:
// 5

// Output:
// 31

// Explanation:
// In a non-leap year, there are 31 days in the 5th month.
// So 31 is printed.

// Example Input/Output 2:
// Input:
// 2

// Output:
// 28

// Example Input/Output 3:
// Input:
// 15

// Output:
// Invalid


import java.util.*;
public class Days_In_Month
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int[] arr={1,3,5,7,8,10,12};
        int N=obj.nextInt(),th=0,c=0;
        if(N<=12)
        {
            for(int i=0;i<arr.length;i++)
                if(arr[i]==N)
                    th++;
            if(N==2)
                System.out.print(28);
            else if(th!=0)
                System.out.print(31);
            else 
            {
                System.out.print(30);
                c++;
            }
        }
        if(N!=2 && th==0 && c==0)System.out.print("Invalid");
    }
}