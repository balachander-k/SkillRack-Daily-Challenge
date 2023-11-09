// The program must accept four integers as the input. The program must print YES
// if the sum of any two integers is equal to the sum of the remaining integers. Else
// the program must print NO as the output.

// Boundary Condition(s):
// 1 <= Each integer value <= 10^7

// Input Format:
// The first line contains four integers separated by a space.

// Output Format:
// The first line contains YES or NO.

// Example Input/Output 1:
// Input:
// 2 3 1 4

// Output:
// YES

// Explanation:
// The sum of 2 and 3 is 5.
// The sum ofl and 4 is 5.
// Here, both results are the same.
// Hence the output is YES

// Example Input/Output 2:
// Input:
// 3 5 8 2

// Output:
// NO

import java.util.*;
public class Sum_Of_Any_Two_Equal_To_Other
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt(),y=obj.nextInt(),z=obj.nextInt(),w=obj.nextInt();
        int ff=x+y,fs=x+z,fh=x+w;
        int sf=y+z,ss=y+w;
        int hf=z+w;
        System.out.print((ff==hf||fs==ss||fh==sf)?"YES":"NO");
    }
}