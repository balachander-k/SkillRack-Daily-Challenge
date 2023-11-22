// The program must accept two string values U and P as the input. U represents the
// username of a digital locker and P represents its password. The program must
// print VALID if the password does not contain any characters from the username
// U. Else the program must print INVALID as the output.

// Boundary Condition(s):
// 5 <= Length of U <= 50
// 4 <= Length of P <= 20

// Input Format:
// The first line contains U.
// The second line contains P.

// Output Format:
// The first line contains either VALID or INVALID.

// Example Input/Output 1:
// Input:
// uit047@demo
// srack123

// Output:
// VALID

// Explanation:
// Here the password srack123 does not contains any characters from the username
// uit047@demo.
// So VALID is printed as the output.

// Example Input/Output 2:
// Input:
// AVNG007 bk47
// 07stOct2019

// Output:
// INVALID


import java.util.*;
public class Digital_Locker_Valid_Invalid
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] U=obj.next().toCharArray();
        char[] P=obj.next().toCharArray();
        int count=0;
        for(int i=0;i<P.length;i++)
            for(int j=0;j<U.length;j++)
                if(P[i]==U[j])
                    count++;
        System.out.print((count==0)?"YES":"NO");
    }
}