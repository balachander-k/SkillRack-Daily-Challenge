// The program must accept an integer N as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 2 <= N <=100

// Input Format:
// The first line contains the integer N.

// Output Format:
// The lines containing the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 4

// Output:
// ---<0>
// --<123>
// -<45678>
// <9012345>
// -<67890>
// --<123>
// ---<4>

// Example Input/Output 2:
// Input:
// 7

// Output:
// ------<0>
// -----<123>
// ----<45678>
// ---<9012345>
// --<678901234>
// -<56789012345>
// <6789012345678>
// -<90123456789>
// --<012345678>
// ---<9012345>
// ----<67890>
// -----<123>
// ------<4>



import java.util.*;
public class Diamond_Pattern_With_Digits
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),temp=a-1,val=1,value=0,t=1,h=a-1;
        for(int i=0;i<a;i++)
        {
            for(int j=temp;j>=0;j--)
            {
                if(j!=0)
                    System.out.print("-");
                if(j==1 || (j==0 && i==a-1))
                    System.out.print("<");
            }
            for(int k=1;k<=val;k++)
            {
                if(value>9)
                    value=0;
                System.out.print(value);
                value++;
            }
            for(int j=temp;j>=0;j--)
            {
                if(j==1 || (j==0 && i==a-1))
                    System.out.print(">");
            }
            System.out.println();
            val=val+2;
            temp--;
            t++;
        }
        int next=val-4;
        for(int i=1;i<=h;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("-");
                if(j==i)
                    System.out.print("<");
            }
            for(int j=next;j>0;j--)
            {
                if(value<0 || value>9)
                {
                    value=0;
                    System.out.print(value);
                    value++;
                }
                else 
                {
                    System.out.print(value);
                    value++;
                }
            }
            for(int j=1;j<=i;j++)
                if(j==i)
                    System.out.print(">");
            next=next-2;
            System.out.println();
        }
    }
}