// The program must accept an integer N as the input. The program must swap the last two digits of N if N is an odd integer. Else the program must remove the last two digits. Finally, the program must print the modified N as the output.

// Boundary Condition(s);
// 100<= N <= 10^8


// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the modified N.

// Example Input/Output 1:
// Input:
// 1245

// Output:
// 1254

// Explanation:
// 1245 is an odd integer so the last two digits are swapped and the output 1254 is printed.

// Example Input/Output 2:
// Input:
// 63532

// Output:
// 635




import java.util.*;
public class Swap_Or_Remove_Digits 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        long a=obj.nextLong();
        String b=String.valueOf(a);
        if(a%2!=0)
        {
            for(int i=0;i<b.length()-2;i++)
                System.out.print(b.charAt(i));
            System.out.print(b.charAt(b.length()-1));
            System.out.print(b.charAt(b.length()-2));
        }
        else 
            for(int i=0;i<b.length()-2;i++)System.out.print(b.charAt(i));
    }
}