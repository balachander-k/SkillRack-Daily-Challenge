// The program must accept two lists of integers as the input. The program must print
// YES if the sum of the largest integer from the first list and the smallest integer from
// the second list is equal to the sum of the smallest integer from the first list and the
// largest from the second list. Else the program must print NO as the output.

// Boundary Condition(s):
// 2 <= Size of First List and Second List < = I0^5
// 1 <= Each integer value <= 10^8

// Input Format:
// The first line contains the list of integers.
// The second line contains the list of integers.

// Output Format:
// The first line contains either YES or NO.

// Example Input/Output I:
// Input:
// 3 2 4 1 5
// 7 8 4

// Output:
// YES

// Explanation:
// The largest integer and the smallest integer in the first list is 5 and
// The largest integer and the smallest integer in the second list is 8 and
// The sum of the largest integer (5) from the first list and the smallest integer ( ) from
// the second list is 9.
// The sum of the smallest integer ( ) from the first list and the largest integer (8) from
// the second list is 9.
// Here both the sum values are equal.
// Hence the output is YES

// Example Input/Output 2:
// Input:
// 4 1 3
// 8 1 2 6

// Output:
// NO


import java.util.*;
public class Sum_Smallest_And_Largest
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine(),b=obj.nextLine();
        String[] c=a.split(" ");
        int max1=Integer.MIN_VALUE,min1=Integer.MAX_VALUE;
        int max2=Integer.MIN_VALUE,min2=Integer.MAX_VALUE;
        for(int i=0;i<c.length;i++)
        {
            int val=Integer.parseInt(c[i]);
            if(val>max1)
                max1=val;
            if(val<min1)
                min1=val;
        }
        String[] d=b.split(" ");
        for(int i=0;i<d.length;i++)
        {
            int temp=Integer.parseInt(d[i]);
            if(temp>max2)
                max2=temp;
            if(temp<min2)
                min2=temp;
        }
        int first=max1+min2;
        int second=min1+max2;
        System.out.print((first==second)?"YES":"NO");
    }
}