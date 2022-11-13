// The program must accept N integers as the input. The program must print the minimum and maximum integers among N integers as the output.

// Boundary Condition(s);
// 1<=N<=10^5
// 1<=Each integer value <=10^4

// Input Format:
// The first line contains the integer N.
// The second line contains N integers separated by space(s).

// Output Format:
// The first line contains the minimum and maximum integers among N integers separated by a space.

// Example Input/Output 1:
// Input:
// 7
// 10 29 128 7 28 39 11

// Output:
// 7 128

// Example Input/Output 2:
// Input:
// 4
// 98 29 18 21

// Output:
// 18 98



import java.util.*;
public class Minimum_And_Maximum
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int[] b=new int[a];
        int temp;
        for(int i=0;i<a;i++)
        {
            b[i]=obj.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            for(int j=i+1;j<a;j++)
            {
                if(b[i]>b[j])
                {
                    temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        System.out.print(b[0]+" "+b[a-1]);
    }
}