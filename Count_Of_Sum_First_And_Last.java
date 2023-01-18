// The program must accept N integers as the input. The program must prin the count of the integers which are equal to the sum of the first integer and the last integer.

// Boundary Condition(s);
// 1<= N <= 100
// 1<= Each integer value <=10^8

// Input Format:
// The first line contains the value of N.
// The second line contains  N integers separated by a space(s).

// Output Format:
// The first line contains the count of the integers which are equal to the sum of the first integer and the last integer.

// Example Input/Output 1:
// Input:
// 7
// 4 7 6 10 5 6 2

// Output:
// 2

// Explanation:
// The sum of the first integer and the last integer is 6(4+2).
// So 6 occurs two times.
// Hence the output is 2.

// Example Input/Output 2:
// Input:
// 5
// 5 4 6 8 5

// Output:
// 0





import java.util.*;
public class Count_Of_Sum_First_And_Last
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int[] b=new int[a];
        for(int i=0;i<a;i++)b[i]=obj.nextInt();
        int sum=b[0]+b[a-1],count=0;
        for(int i=0;i<a;i++)
            if(b[i]==sum)count++;
        System.out.print(count);
    }
}