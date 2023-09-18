// The program must accept a string S with spaces as the input. The program must
// print the desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 2 <= Length of S <=100

// Input Format:
// The first line contains S.

// Output Format:
// The lines contain the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// Very Useful One

// Output:
// V
// Ve
// Ver
// Very
// U
// Us
// Use
// Usef
// Usefu
// Useful
// O
// On
// One

// Example Input/Output 2:
// Input:
// skill is power
// Output:
// s
// sk
// ski
// skil
// skill
// i
// is
// P
// po
// pow
// powe
// power

import java.util.*;
public class Words_In_Triangle_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String S=obj.nextLine();
        String[] arr=S.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            char[] val=arr[i].toCharArray();
            for(int j=0;j<arr[i].length();j++)
            {
                for(int k=0;k<j+1;k++)
                    System.out.print(val[k]);
                System.out.println();
            }
        }
    }
}