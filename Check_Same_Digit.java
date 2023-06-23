// The program must accept two integers Nl and N2 as the input. The program must
// print Valid if the tenth digit or the unit digit of N2 is present in Nl. Else the program
// must print Invalid as the output.

// Boundary Condition(s):
// 10 < = Nl, N2 <=99

// Input Format:
// The first line contains the two integer values Nl and N2 separated by a space.

// Output Format:
// The first line contains either Valid or Invalid.

// Example Input/Output 1:
// Input:
// 12 23

// Output:
// Valid

// Example Input/Output 2:
// Input:
// 90 13

// Output:
// Invalid

import java.util.*;
public class Check_Same_Digit
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=obj.nextInt();
        System.out.print(((b%10)==(a%10) || (b%10)==((a%100)/10) || ((b%100)/10)==(a%10) || ((b%100)/10)==((a%100)/10))?"Valid":"Invalid");
    }
}