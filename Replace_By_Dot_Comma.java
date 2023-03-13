// The program must accept a string S as the input. The program must replace all the special
// characters by . (dot) and , (comma) such that the next ocurring special character of . (dot)
// must be a , (comma) and also the next ocurring special character of , comma must . (dot).
// Finally, the program must print the modified string as the ouput.

// Note: The first ocurring special character must be . (dot) in the output.

// Boundary Condition(s):
// 1 <= Length of S <= 1000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the modified string.

// Example Input/Output 1:
// Input:
// yum.as;io/d'p

// Output:
// yum.as,io.d,p

// Explanation:
// There are four special characters which are replaced by . and , alternatively.

// Example Input/Output 2:
// Input:
// \s.s/qw'sd?fe2'3r

// Output:
// .s,s.qw,sd.fe2,3r


import java.util.*;
public class Replace_By_Dot_Comma 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char[] b=a.toCharArray();
        int count=0;
        for(int i=0;i<a.length();i++)
        {
            if(Character.isDigit(b[i]) || Character.isAlphabetic(b[i]))
                System.out.print(b[i]);
            else
            {
                count++;
                if(count==1)System.out.print(".");
                if(count==2)
                {
                    System.out.print(",");
                    count=0;
                }
            }
        }
    }
}