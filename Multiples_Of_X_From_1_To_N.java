// The program must accept two integers N and X as the input. The program must print the multiples of X from 1 to N in the order given below.
// The order must be the 1st multiple of X, the last mutilple of X, the 2nd multiple of X, the last byt second multiple of X and so on.

// Boundary Condition(s);
// 1<= N,X <=1000

// Input Format:
// The first line contains the values of N and X separated by a space.

// Output Format:
// The first line contains the multiples of X and from 1 to N in the above-mentioned order.

// Example Input/Output 1:
// Input:
// 50 10

// Output:
// 10 50 20 40 30

// Explanation:
// The multiple sof 10 from 1 t0 50 are 10,20,30,40 and 50.
// The 1st multiple of 10 is 10.
// The 5th multiple of 10 is 50.
// The 2nd mutliple of 10 is 20.
// The 4th multiple of 10 is 40.
// The 3rd mutliple of 10 is 30.
// Hence the output is 10 50 20 40 30

// Example Input/Output 2:
// Input:
// 30 3

// Output:
// 3 30 6 27 9 24 12 21 15 18



import java.util.*;
public class Multiples_Of_X_From_1_To_N
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=obj.nextInt();
        int first=1,alter=0,check=0,t=0,count=0,val=0,second=1,u=0;
        while(check<a)
        {
            check=first*b;
            count++;
            first++;
        }
        int[] c=new int[count];
        while(val<a)
        {
            val=second*b;
            if(val<=a)
            {
                c[t]=val;
                t++;
                second++;
            }
        }
        int value=t-1,index=0;
        for(int i=0;i<t;i++)
        {
            if(i%2!=0)
            {
                System.out.print(c[value]+" ");
                value--;
            }
            if(i%2==0)
            {
                System.out.print(c[index]+" ");
                index++;
            }
        }
        
    }
}