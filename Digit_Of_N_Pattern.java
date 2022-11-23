// The program must accept an integer N the input. The program must print the desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s);
// 1<= N <= 10^15

// Input Format:
// The first line contains the value of N.

// Output Format:
// The list of lines containing the desired pattern as shown in the Example Input/Output section.

// Example Input/Output 1:
// Input:
// 725181

// Output:
// 7777777
// 22
// 55555
// 1
// 88888888
// 1


// Example Input/Output 2:
// Input:
// 502

// Output:
// 55555
// 22





import java.util.*;
public class Digit_Of_N_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char[] b=a.toCharArray();
        int j=0;
        for(int i=0;i<a.length();i++)
        {
            int c=Integer.parseInt(String.valueOf(b[i]));
            while(j!=c)
            {
                System.out.print(c);
                j++;
            }
            if(c==0)
                continue;
            System.out.println();
            j=0;
        }
    }
}