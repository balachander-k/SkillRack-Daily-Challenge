// The program must accept an integer N as the input. The program must print the
// largest digit among the unit digit, the tenth digit and the hundredth digit as the
// output.

// Boundary Condition(s):
// 100 <= N <=1000000

// Input Format:
// The first line contains the value of N.

// Output Format:
// The first line contains the largest digit among the unit digit, the tenth digit and the
// hundredth digit.

// Example Input/Output 1:
// Input:
// 54232

// Output:
// 3

// Explanation:
// The unit digit is 2
// The tenth digit is 3
// the hundredth digit is 2
// The largest among these digits is 3. Hence 3 is printed.

// Example Input/Output 2:
// Input:
// 764356

// Output:
// 6

import java.util.*;
public class Maxmium_Of_Last_Three
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int unit=num%10,ten=(num/10)%10,hun=(num/100)%10;
        System.out.print((unit>ten && unit>hun)?unit:(ten>unit && ten>hun)?ten:hun);
    }
}