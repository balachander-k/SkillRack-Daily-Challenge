// The program must accept N integers as the input. The program must print the
// integer which is having the maximum number of factors among the N integers as
// the output. If more than one integer is having the same maximum number of
// factors then the program must print the largest integer among those integers as
// the output.

// Boundary Condition(s):
// 2 <= N <= 10^4
// 1 <= Each integer value <= 10^4

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains the integer based on the given conditions.

// Example Input/Output 1:
// Input:
// 5
// 10 45 8 121 100

// Output:
// 100


// Explanation:
// The factors of 10 are 1 2 5 and 10, the factors count is 4.
// The factors of 45 are 1 3 5 9 15 and 45, the factors count is 6.
// The factors of 8 are 1 2 4 and 8, the factors count is 4.
// The factors of 121 are 1 11 and 121, the factors count is 3.
// The factors of 100 are 1 2 4 5 IO 20 25 50 and 100, the factors count is 9.
// So 100 has the maximum number of factors.
// Hence the output is 100

// Example Input/Output 2:
// Input:
// 4
// 13 7 29 2

// Output:
// 29

import java.util.*;
public class Maximum_Number_Of_Factors
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt(),max=Integer.MIN_VALUE,val=0;
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=obj.nextInt();
        for(int i=0;i<size;i++)
        {
            int count=0;
            for(int j=1;j<=arr[i];j++)
            {
                if(j%arr[i]==0)
                    count++;
            }
            if(count>max || count==max)
            {
                if(count==max)
                {
                    if(arr[i]>=val)
                    {
                        val=arr[i];
                        max=count;
                    }
                }
                else 
                {
                    val=arr[i];
                    max=count;
                }
            }
        }
        System.out.print(val);
    }
}