// The program must accept N integers as the input. The program must print the integers having both the adjacent elements as two or three digit integers. If no such integer matches the given condition,them the program must print -1 as the output.

// Note: The first and the last integers have only one adjacent integer and it must be checked.

// Boundary Condition(s);
// 2<= M <=100

// Input Format:
// The first line contains the value of N.
// The second line contains N integers separated by space(s);

// Output Format:
// The first line contains the integers with two or three digit integers as their adjacent elements separated by space.

// Example Input/Output 1:
// Input:
// 6
// 12 421 98 2 23 9348

// Output:
// 12 421 2 9348


// Explanation:
// The adjacent integer of 12 is 421. Here 421 is a three digit integer. So 12 is printed.
// The adjacent integer of 421 is 12 and 98. Here both 12 and 98 are two digit. So 421 is printed.
// The adjacent integer of 98 is 421 and 2. Here 2 is only one digit. So 98 is not printed.
// The adjacent integer of 2 is 98 and 23. Here both 12 and 98 are two digit. So 2 is printed.
// The adjacent integer of 23 is 2 and 9348. Here both 2 is only one digit. So 23 is printed.
// The adjacent integer of 9348 is 23. Here is a two digit integer. So 9348 is printed.
// Hence the output is 12 421 2 9348.


import java.util.*;
public class Two_OR_Three_Digit_Adjacent_Elements
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),count=0,last=a-1;
        String[] b=new String[a];
        for(int i=0;i<a;i++)b[i]=obj.next();
        for(int i=0;i<a;i++)
        {
            if(i==0)
            {
                char[] d=b[i+1].toCharArray();
                if(d.length==2 || d.length==3)
                {
                    System.out.print(b[i]+" ");
                    count++;
                }
            }
            if(i>0 && i!=last)
            {
                char[] e=b[i-1].toCharArray();
                char[] f=b[i+1].toCharArray();
                if((e.length==2 || e.length==3) && (f.length==2 || f.length==3))
                {
                    System.out.print(b[i]+" ");
                    count++;
                }
            }
            if(i==last)
            {
                char[] t=b[i-1].toCharArray();
                if(t.length==2 || t.length==3)
                { 
                    System.out.print(b[i]+" ");
                    count++;
                }
            }
        }
        if(count==0)System.out.print("-1");
    }
}