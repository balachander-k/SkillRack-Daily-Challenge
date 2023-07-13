// The program must accept a list of unique positive integers and a positive integer X
// as the input. The program must find the sum of integers left to integer X then the
// program must find the sum of integers right to integer X. The program must print
// the minimum sum value among the obtained two sum values as the output. If
// there is no integer before or after integer X, the program must print 0 as the
// minimum sum value.

// Note: The integer X is always present in the given list of integers.

// Boundary Condition(s):
// 1 <= Each integer value <= 1O^5

// Input Format:
// The first line contains the list of integers separated by space(s).
// The second line contains the positive integer X.

// Output Format:
// The first line contains the minimum sum value based on the given conditions.

// Example Input/Output 1:
// Input:
// 1 2 3 4 5 6 7 8 9
// 5

// Output:
// 10

// Explanation:
// The integers left to integer 5 are 1 2 3 and 4. So their sum is 10.
// The integers right to integer 5 are 6 7 8 and 9. So their sum is 30.
// Here the minimum sum is 10.
// So 10 is printed as the output.

// Example Input/Output 2:
// Input:
// 9 1 2 8 7 3
// 7

// Output:
// 3

import java.util.*;
public class Maximum_Left_Or_Right
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        int num=obj.nextInt(),second=0,first=0;
        String[] b=a.split(" ");
        for(int i=0;i<b.length;i++)
        {
            int v=Integer.parseInt(b[i]);
            if(num!=v)
                first=first+v;
            else 
                break;
        }
        for(int i=b.length-1;i>=0;i--)
        {
            int t=Integer.parseInt(b[i]);
            if(num!=t)
                second=second+t;
            else 
                break;
        }
        int[] arr={first,second};
        Arrays.sort(arr);
        System.out.print(arr[0]);
    }
}