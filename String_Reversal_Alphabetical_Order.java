// The program must accept a string S as the input. The program must print the alphabets of S in reversal alphabetical order as the output.
// Note: The string S always contain only lowercase alphabets.

// Boundary Condition(s);
// 1<= Length of S <=100

// Input Format:
// The first line contains the string S.

// Output Format:
// The first line contains the alphabets of S in reversal alphabetical order.

// Example Input/Output 1:
// Input:
// orange

// Output:
// rongea

// Explanation:
// In the string orange, the alphabets in reversal alphabetical order are r o n g e a.
// Hence the output is rongea

// Example Input/Output 2:
// Input:
// sweet

// Output:
// wtsee




import java.util.*;
public class String_Reversal_Alphabetical_Order
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] a=obj.nextLine().toCharArray();
        Arrays.sort(a);
        for(int i=a.length-1;i>=0;i--)
            System.out.print(a[i]);
    }
}