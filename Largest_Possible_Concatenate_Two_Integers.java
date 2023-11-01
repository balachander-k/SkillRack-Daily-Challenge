// The program must accept three integers X, Y and Z as the input. The program
// must print the largest possible integer which is obtained by concatenating any two
// integers among X, Y and Z as the output.

// Boundary Condition(s):
// 0 <= X,Y,Z <=10^5

// Input Format:
// The first line contains X, Y and Z.

// Output Format:
// The first line contains an integer based on the given condition.

// Example Input/Output 1:
// Input:
// 100 2 10

// Output:
// 10100

// Explanation:
// The largest possible integer 10100 is obtained by concatenating the integers 10
// and 100.
// Hence the output is 10100

// Example Input/Output 2:
// Input:
// 45 81 12

// Output:
// 8145

// Example Input/Output 3:
// Input:
// 0 2 5

// Output:
// 52


import java.util.*;
public class Largest_Possible_Concatenate_Two_Integers
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        long[] arr={obj.nextLong(),obj.nextLong(),obj.nextLong()};
        long max1=0,max2=0;
        if(arr[0]==0 && arr[1]==0 && arr[2]==0)
            System.out.print(0);
        else
        {
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]>=max1)
                {
                    max2=max1;
                    max1=arr[i];
                }
                else if(arr[i]>=max2 && arr[i]<=max1)
                {
                    max2=arr[i];
                }
            }
            String t=String.valueOf(max2)+String.valueOf(max1);
            String h=String.valueOf(max1)+String.valueOf(max2);
            System.out.print(Long.parseLong(t)>Long.parseLong(h)?t:h);
        }
    }
}