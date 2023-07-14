// The program must accept a space separated string S as the input. The program
// must print every word in the string in a separate line.

// Boundary Condition(s):
// 1 <= Length of S <= 100

// Input Format:
// The first line contains the string S.

// Output Format:
// The list of lines containing the word in each line.

// Example Input/Output 1:
// Input:
// hil how are you?

// Output:
// hil
// how
// are
// you?

// Example Input/Output 2:
// Input:
// hello friends

// Output:
// hello
// friends

import java.util.*;
public class One_Word_One_Line
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        String[] b=a.split(" ");
        for(int i=0;i<b.length;i++)
            System.out.println(b[i]+" ");
    }
}