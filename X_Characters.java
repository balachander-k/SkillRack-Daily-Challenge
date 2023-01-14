// The program must accept a string S and an integer X where the length of S is divisble X as the input. The program must print every X characters in the string S on each line as the output.

// Boundary Condition(s);
// 1<= Length of S,X <=100

// Input Format:
// The first line contains the string S.
// The second line contains the integer X.

// Output Format:
// The first length of S/X lines contains X characters on each line.

// Example Input/Output 1:
// Input:
// orange
// 3

// Output:
// ora
// nge

// Example Input/Output 2:
// Input:
// compartmentalization
// 4

// Output:
// comp
// artm
// enta
// liza
// tion



import java.util.*;
public class X_Characters
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        int b=obj.nextInt();
        int div=a.length()/b;
        char[] d=a.toCharArray();
        int k=0;
        for(int i=0;i<div;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.print(d[k]);
                k++;
            }
            System.out.println();
        }
    }
}