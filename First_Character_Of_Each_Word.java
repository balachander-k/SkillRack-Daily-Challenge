// The program must accept a space separated string S as the input. The program must print the first characters of each word in the string as the output.

// Boundary Condition(s);
// 1<= Length of S <=100

// Input Format:
// The first line contains the string S.

// Output Format:
// The first line contains a list of character(s).

// Example Input/Output 1:
// Input:
// hello dude

// Output:
// hd

// Example Input/Output 2:
// Input:
// she is my friend

// Output:
// simf



import java.util.*;
public class First_Character_Of_Each_Word
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char[] b=a.toCharArray();
        String val=String.valueOf(b[0]);
        for(int i=0;i<a.length();i++)
            if(b[i]==' ')val=val+b[i+1];
        System.out.print(val);
    }
}