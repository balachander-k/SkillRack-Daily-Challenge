// The program must accept an integer N of exactly nine digits as the input. The program must print the given integer in the format of (ddd) ddd ddd as the output.

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the formatted value of N.

// Example Input/Output 1:
// Input:
// 142547878

// Output:
// (142) 547 878

// Explanation:
// THe given integer 142547878 is formatted as (142) 547 878

// Example Input/Output 2:
// Input:
// 154735914

// Output:
// (154) 735 914



import java.util.*;
public class Print_Formatted_Integer
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char[] b=a.toCharArray();
        String val1=String.valueOf(b[0])+String.valueOf(b[1])+String.valueOf(b[2]);
        String val2=String.valueOf(b[3])+String.valueOf(b[4])+String.valueOf(b[5]);
        String val3=String.valueOf(b[6])+String.valueOf(b[7])+String.valueOf(b[8]);
        System.out.print("("+val1+")"+" "+val2+" "+val3);
    }
}