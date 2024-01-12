// The program must accept N integers and two integers X and Y as the input. The
// program must print the sum of integers which are present in the range from X to Y
// among the N integers as the output.

// Boundary Condition(s):
// 1 <= N < = 100
// 1 <= Each integer value <= 10^5
// 1 <= X < Y <=10^5

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.
// The third line contains X and Y separated by a space.

// Output Format:
// The first line contains the sum as per the given condition.

// Example Input/Output 1:
// Input:
// 5
// 4 2 1 5 8
// 2 6

// Output:
// 11

// Explanation:
// The integers which are present in the range from 2 to 6 are 4, 2 and 5.
// So their sum 11 (4 + 2 + 5) is printed as the output.

// Example Input/Output 2:
// Input:
// 6
// 10 5 177 125 27 14
// 15 20

// Output:
// 0

import java.util.*;
public class Sum_Range_From_X_TO_Y 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int arr[]=new int[size];
        int x=obj.nextInt(),y=obj.nextInt(),sum=0;
        for(int i=0;i<size;i++)
            arr[i]=obj.nextInt();
        for(int i=0;i<size;i++)
        {
            for(int j=x;j<=y;j++)
                if(arr[i]==j)
                    sum=sum+arr[i];
            
        }
        System.out.print(sum);
    }
}