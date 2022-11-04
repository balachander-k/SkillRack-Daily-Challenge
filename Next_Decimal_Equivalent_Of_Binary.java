// The program must accept the binary representation X as the input. The program must print the binary representation of the next decimal equivalent of X as the output.

// Boundar Condition(s);
// 1<=X<=10^8

// Input Format:
// The first line contains the given binary representation.

// Example Input/Output 1:
// Input:
// 101

// Output:
// 110

// Explanation:
// The decimal equivalent of 101 is 5.
// The next decimal equivalent of 5 is 6.
// The binary representation of 6 is 110
// Hence the output is 110

// Example Input/Output 2:
// Input:
// 11111

// Output:
// 100000


import java.util.*;
public class Next_Decimal_Equivalent_Of_Binary
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        int b=Integer.parseInt(a,2);
        ++b;
        System.out.print(Integer.toBinaryString(b));
    }
}