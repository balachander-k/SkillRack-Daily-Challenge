// The program must accept a string S with spQaces as the input. The program must
// replace all the spaces by * (asterisk) in the string S. Then the program must bring
// all the asterisks to the end of the string S. Finally, the program must print the
// modified string S as the output.

// Boundary Condition(s):
// 3 <= Length of S <= 1000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the modified S.

// Example Input/Output 1:
// Input:
// Handle with care

// Output:
// Handlewithcare**

// Explanation:
// After replacing all the spaces by * in the string Handle with care, it becomes
// Handle*with*care
// After bringing all the asterisks to the end of the string, it becomes
// Handlewithcare**
// Hence the output is Handlewithcare**


// Example Input/Output 2:
// Input:
// of the people by the people for the people

// Output:
// ofthepeoplebythepeopleforthepeople********

import java.util.*;
public class Replace_Space_By_Asteriks 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String temp=obj.nextLine(),s="",asterik="*";
        String[] val=temp.split(" ");
        for(int i=0;i<val.length;i++)
            s=s+val[i];
        System.out.print(s+asterik.repeat(Math.abs(temp.length()-s.length())));
    }
}