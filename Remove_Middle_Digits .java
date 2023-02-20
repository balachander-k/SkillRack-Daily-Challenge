// An integer N is pase as the input to the program. The program must
// between the first and last digit
// Then the program must print the modified N as the output.

// Boundary Condition(s):
// 100 N 1009

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the modified N.

// Example Input/Output 1:
// Input:
// 4785

// Output:
// 45

// Explanation:
// The digits between the first and last digit are 7 and 8.
// Which are removed and printed as 45.

// Example Input/Output 2:
// Input:
// 543158

// Output:
// 58


import java.util.*;
public class Remove_Middle_Digits 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        System.out.print(a.charAt(0)+""+a.charAt(a.length()-1));
    }
}