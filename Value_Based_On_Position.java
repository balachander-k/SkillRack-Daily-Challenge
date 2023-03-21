// The program must accept an integer N as the input. The program must print a value for
// each digit as the digit multiplied by its position value.

// Boundary Condition(s):
// 1 <= N <= IO^8

// Input Format:
// The first line contains an integer N.

// Output Format:
// The first line contains values separated by a space.

// Example Input/Output 1:
// Input:
// 12354

// Output:
// 10000 2000 300 50 4

// Explanation:
// In 12354, the digit at 10000th position is 1. 1 multiplied by 10000 is 10000.
// The digit at 1000 position is 2 and 2 multiplied by 1000 is 2000.
// The digit at 100th position is 3 and 3 multiplied by 100 is 300.
// The digit at 10th position is 5 and 5 multiplied by 10 is 50.
// The digit at unit position is 4 and 4 multiplied by 1 is 4.
// Hence the output is 10000 2000 300 50 4

// Example Input/Output 2:
// Input:
// 5001

// Output:
// 5000 0 0 1



import java.util.*;
public class Value_Based_On_Position
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next(),val="";
        String[] array=new String[a.length()];
        int mul=1,j=0;
        for(int i=a.length()-1;i>=0;i--)
        {
            int conv=Integer.parseInt(String.valueOf(a.charAt(i)));
            int s=conv*mul;
            mul=mul*10;
            array[j]=String.valueOf(s);
            j++;
        }
        for(int i=j-1;i>=0;i--)System.out.print(array[i]+" ");
    }
}