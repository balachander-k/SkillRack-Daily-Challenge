// The program must accept a list of integers as the input. The program
// must invert the sign of all the integers in the list and print them as the
// output. If an integer is 0 (neither positive nor negative) then print 0 as it
// is.

// Boundary Condition(s):
// -1000 <= Each integer value <= 1000

// Input Format:
// The first line contains a list of integers separated by a space.

// Output Format:
// The first line contains the modified list of integers separated by a space.

// Example Input/Output 1:
// Input:
// 5 7 -2 8 -7 -9 6

// Output:
// -5 -7 2 -8 7 9 -6

// Example Input/Output 2:
// Input:
// -77 85 48 -26

// Output:
// 77-85-48 26

import java.util.*;
public class List_Invert_Sign
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        while(obj.hasNext())
        {
            int value=obj.nextInt();
            if(value==0)
                System.out.print("0"+" ");
            else if(value>0)
                System.out.print(-value=" ");
            else 
                System.out.print(value+" ");
        }
    }
}