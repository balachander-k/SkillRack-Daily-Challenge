// The program must accept an integer N as the input. The program msut print the desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s);
// 1<= N <=10^15

// Input Format:
// The fisrt line contains the integer N.

// Output Format:
// The list of lines containing the desired pattern as shown in the Example Input/Ouput Section.

// Example Input/Output 1:
// Input:
// 43785

// Output:
// 4
// 33
// 777
// 8888
// 55555

// Example Input/Output 2:
// Input:
// 10001

// Output:
// 1
// 00
// 000
// 0000
// 11111


import java.util.*;
public class Triangle_Digit_Pattern 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char a[]=obj.nextLine().toCharArray();
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<=i;j++)System.out.print(a[i]);
            System.out.println();
        }
    }
}