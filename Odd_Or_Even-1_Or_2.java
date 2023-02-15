// The program must accept an integer N as the input. The program must replace all the even digits in N by 1 and replace all the odd digits in N by 2. Then the program must print the modified value of N as the output.

// Boundary Condition(s);
// 1<= N <=10^9

// Input Format:
// The first line contains the value of N.

// Output Format:
// The first line contains the modified value of N.

// Input:
// 465189

// Output:
// 112212

// Explanation:
// All the even digits are in 465189 are replaced by 1.
// All the odd digits are in 465189 are replaced by 2.
// Hence the output is 112212

// Example Input/Output 2:
// Input:
// 212112

// Output:
// 121221



import java.util.*;
public class Odd_Or_Even-1_Or_2
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        for(int i=0;i<a.length();i++)
        {
            int temp=Integer.parseInt(String.valueOf(a.charAt(i)));
            if(temp%2==0)System.out.print("1");
            else System.out.print("2");
        }
    }
}