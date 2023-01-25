// The program must accept N integers (where N is always even) as the input. The program must sort every two integers in ascending order among the N integers. Then the program must print the modified value of all N integers as the output.

// Boundary Condition(s);
// 2<= N <=100
// 1<= Each integer value <=999

// Input Format:
// The first line contains the value of N.
// The second line contains N integers separated by space(s).

// Output Format:
// The first line contains N integers values separated by a space.

// Example Input/Output 1:
// Input:
// 4
// 10 5 2 4

// Output:
// 5 10 2 4

// Explanation:
// The first two integers are 10 and 5. So sort them in ascending order.
// The next two integers are 2 and 4. They are already sorted in ascending order. So no need to sort them again.
// Hence the output is 5 10 2 4

// Example Input/Output 2:
// Input:
// 8 
// 36 22 87 87 44 54 93 10

// Output:
// 22 36 87 87 44 54 10 93



import java.util.*;
public class Sort_Every_Two_Integers
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int[] b=new int[a];
        for(int i=0;i<a;i++)b[i]=obj.nextInt();
        int even=a/2,r=0,t=1;
        for(int i=0;i<even;i++)
        {
            if(b[r]<=b[t])System.out.print(b[r]+" "+b[t]+" ");
            else System.out.print(b[t]+" "+b[r]+" ");
            r=r+2;
            t=t+2;
        }
    }
}