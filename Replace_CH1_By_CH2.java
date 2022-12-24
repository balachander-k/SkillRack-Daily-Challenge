// The program must accept a string S and two characters CH1 and CH2 as the input. The program must replace all the occurrences of CH1 by CH2 in the string S. Then the program must print the modified string as the output.

// Boundary Condition(s);
// 1<= Length of S <=100

// Input Format:
// The first line contains the value of the string S.
// The second line containst the value of CH1 and CH2 separated by a space.

// Output Format:
// The frist line contains the modified string.

// Example Input/Output 1:
// Input:
// terrorist
// r d

// Output:
// teddodist

// Explanation:
// All the characters of 'r' are replaced by 'd' in the string teddodist.
// Hence the output is teddodist.

// Example Input/Output 2:
// Input:
// manipulasion
// s t

// Output:
// manipulation



import java.util.*;
public class Main 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char b=obj.next().charAt(0),c=obj.next().charAt(0);
        char[] d=a.toCharArray();
        for(int i=0;i<d.length;i++)
        {
            if(d[i]==b)System.out.print(c);
            else System.out.print(d[i]);
        }
    }
}