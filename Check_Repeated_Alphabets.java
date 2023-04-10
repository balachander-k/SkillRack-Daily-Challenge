// The program must accept a string value S as the input. The program must print
// invalid if the alphabets are repeated continuously for more than two times. Else the
// program must print valid as the output.

// Boundary Condition(s):
// 3 <= Length Of S <=100

// Input Format:
// The first line contains the values of string S.

// Output Format:
// The first line contains either invalid or valid.

// Example Input/Output 1:
// Input:
// dreaaam

// Output:
// invalid

// Explanation:
// In dreaaam, a is repeated more than two times continuously.
// Hence the output is invalid

// Example Input/Output 2:
// Input:
// skillrack

// Output:
// valid


import java.util.*;
public class Check_Repeated_Alphabets
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char[] b=a.toCharArray();
        int count=0;
        for(int i=0;i<a.length();i++)
        {
            if(i+2<a.length())
            {
                if(b[i]==b[i+1] && b[i]==b[i+2])
                    count++;
            }
        }
        if(count==0)System.out.print("valid");
        else System.out.print("invalid");
    }
}