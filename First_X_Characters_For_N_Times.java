// The program must accept a string value S and two integers X and N as the input.
// The program must print the first X characters of S for N times as the output.

// Boundary Condition(s):
// 1 <= Length of S <= 100
// 1 <= X <= Length of S
// 1 <= N <= 100

// Input Format:
// The first line contains the string S.
// The second line contains two integers X and N separated by a space.

// Output Format:
// The first line contains the first X characters of S for N times.

// Example Input/Output 1:
// Input:
// Rectangle
// 3 4

// Output:
// RecRecRecRec

// Explanation:
// The word formed by the first 3 characters of Rectangle is Rec.
// Then Rec is repeated for 4 times as RecRecRecRec.
// Hence the output is RecRecRecRec

// Example Input/Output 2:
// Input:
// january
// 7 2

// Output:
// januaryjanuary

import java.util.*;
public class First_X_Characters_For_N_Times
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next(),val="";
        int b=obj.nextInt(),c=obj.nextInt();
        for(int i=0;i<b;i++)
            val=val+a.charAt(i);
        for(int i=0;i<c;i++)
            System.out.print(val);
    }
}