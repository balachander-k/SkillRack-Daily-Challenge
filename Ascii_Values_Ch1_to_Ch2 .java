// The program must accept two characters CHI and CH2 as the input. The program
// must print all the ASCII values from the ASCII of CHI to the ASCII of CH2 as the
// output.

// Boundary Condition(s):
// 1 <= ASCII of CH1 <= ASCII of CH2 <= 127

// Input Format:
// The first line contains CHI and CH2 separated by a space.

// Output Format:
// The first line contains the ASCII values from CHI to CH2 separated by a space.

// Example Input/Output 1:
// Input:
// a e

// Output:
// 97 98 99 100 101

// Explanation:
// ch1=a ch2=e
// The ASCII value of is 97 and the ASCII value of
// Hence the output is 97 98 99 100 101

// Example Input/Output 2:
// Input:
// U c

// Output:
// 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99



import java.util.*;
public class Ascii_Values_Ch1_to_Ch2 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char ch1=obj.next().charAt(0),ch2=obj.next().charAt(0);
        int as1=(int)ch1,as2=(int)ch2;
        while(as1<=as2)
        {
            System.out.print(as1+" ");
            as1++;
        }
    }
}