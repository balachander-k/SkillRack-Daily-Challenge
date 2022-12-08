// The program must accept N integers as the input. The program must print the average of N integers with the precision up to 2 decimal places as the output.

// Boundary Condition(s);
// 1<= N <=100
// 1<= Each Integer Value <=10^7

// Input Format:
// The first line contains the value of N.
// The second line contains N integers separated by space(s).

// Output Format:
// The first line contains the average of N integers with the precision up to 2 decimal places.

// Example Input/Output 1:
// Input:
// 6
// 10 20 45 78 16 43

// Output:
// 35.33

// Explanation:
// The average of 6 integers (10,20,45,78,16,43) IS 35.333333
// The value 35.333333 with the precision up to two decimal places is 35.33

// Example Input/Output 2:
// Input:
// 5
// 1 2 3 4 5

// Output:
// 3.00



import java.util.*;
public class Average_Of_N_Integers
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int[] b=new int[a];
        float sum=0,avg;
        for(int i=0;i<a;i++)
            b[i]=obj.nextInt();
        for(int i=0;i<a;i++)
            sum=sum+b[i];
        System.out.printf("%.2f",(sum/a));
    }
}