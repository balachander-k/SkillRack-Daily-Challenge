// The program must accept N integers as the input. The program must print the only the integers containing only even digits as the output. If there is no such integer then the program must print -1 as the output.

// Boundary Condition(s);
// 1<= N <=100
// 1<= Each integer value <=10^9

// Input Format:
// The first line contains N.
// The second line contains N integers separated by space.

// Output Format:
// The first line contains integers separated by space.

// Example Input/Ouptut 1:
// Input:
// 5
// 245 62 87 108 24

// Output:
// 62 64

// Explanation:
// The first integer has both odd and even digits so it is not printed.
// The second integer has only even digits so it is printed.
// The third integer has both odd and even digits so it is not printed.
// The fourth integer has only even digits so it is printed.
// The fifth integer has only even digits so it is printed.

// Example Input/Output 2:
// Input:
// 4
// 41 3826 123 921

// Output:
// -1




import java.util.*;
public class Main 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int[] b=new int[a];
        for(int i=0;i<a;i++)b[i]=obj.nextInt();
        int val,rev,even=0,count=0;
        for(int i=0;i<a;i++)
        {
            String c=String.valueOf(b[i]);
            val=b[i];
            while(val!=0)
            {
                rev=val%10;
                if(rev%2==0)
                    even++;
                val=val/10;
            }
            if(even==c.length())
                System.out.print(b[i]+" ");
            else 
                count++;
            even=0;
        }
        if(count==a)
            System.out.print("-1");
    }
}