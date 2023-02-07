// The program must accept two years Y1 and Y2 as the input. The program must print all the leap years from Y1 to Y2 (inclusive of Y1 and Y2) as the output. If there is no leap year from Y1 to Y2 then the program must print -1 as the output.

// Boundary Condition(s);
// 1 <= Y1 < Y2 <= 9999

// Input Format:
// The first line contains Y1 and Y2 separated by a space.

// Output Format:
// The first line contains the leap years from Y1 to Y2 or -1.

// Example Input/Output 1:
// Input:
// 1996 2019

// Output:
// 1996 2000 2004 2008 2012 2016

// Example Input/Output 2:
// Input:
// 1897 1903

// Output:
// -1





import java.util.*;
public class Leap_Year_From_Y1_To_Y2 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int year1=obj.nextInt(),year2=obj.nextInt(),count=0;
        for(int i=year1;i<=year2;i++)
        {
            if(((i%4==0) && (i%100!=0)) || (i%400==0))
            {
                System.out.print(i+" ");
                count++;
            }
        }
        if(count==0)System.out.print("-1");
    }
}