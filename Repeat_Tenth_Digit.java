// The program must accept an integer N as input. The program must find the tenth
// digit of N as T. Then the program must expand the integer N by repeating each
// digit fot T times. Finally, the program must print the modified value of N.
// Note: Tenth digit of N is always a non-zero value.

// Boundary Condition(s):
// 10 <= N <10^8

// Input Format:
// The first line contains the value of N

// Output Format:
// The first line contains the modified value of N

// Example Input/Output 1:
// Input:
// 346

// Output:
// 333344446666

// Explanation:
// The tenth digit of N is 4.
// The hundredth digit 3 is expanded as 3333
// The tenth digit 4 is expanded as 4444
// The unit digit 6 is expanded as 6666
// Hence the output is 333344446666

// Example Input/Output 2:
// Input:
// 150

// Output:
// 111115555500000

import java.util.*;
public class Repeat_Tenth_Digit
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int value=obj.nextInt();
        int ten=(value/10)%10;
        String con=String.valueOf(value);
        for(int i=0;i<con.length();i++)
            for(int j=0;j<ten;j++)
                System.out.print(con.charAt(i));
    }
}