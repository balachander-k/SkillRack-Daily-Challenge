// The program must accept a matrix of size NXN as the input, the matrix contains
// only 0's and I's. The program must count the number of I's in each row. Then the
// program must print the row number of the row containing the maximum number
// of I's as the output. If two or more rows contain the maximum number of I's then
// print the first occuring row number in the given order as the output.

// Boundary Condition(s):
// 1< N < 10^5

// Input Format:
// The first line contains the integer N.

// Output Format:
// The first line contains the row number of the row contianing the maximum
// number of 1 's.

// Example Input/Output 1:
// Input:
// 4
// 0 1 1 1
// 1 0 1 0
// 1 1 1 1
// 0 0 0 0

// Output:
// 3

// Explanation:
// The first row contains three I's. So, the count is 3.
// The second row contains two 1 's. So, the count is 2.
// The third row contains four I's. So, the count is 4.
// The fourth row contains zero 1 's. So, the count is O.
// Here the maximum count is 4 and their corresponding row is 3.
// Hence the output is 3.

// Example Input/Output 2:
// Input:
// 3
// 1 0 0
// 0 1 1
// 1 1 0

// Output:
// 2

import java.util.*;
public class Maximum_Number_Of_1's_Row
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt(),max=0,index=0;
        for(int i=0;i<size;i++)
        {
            int count=0;
            for(int j=0;j<size;j++)
            {
                int val=obj.nextInt();
                if(val==1)
                    count++;
            }
            if(count>max)
            {
                max=count;
                index=i;
            }
        }
        System.out.print((index+1));
    }
}