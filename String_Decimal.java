// The program must accept a string S containing only a and b as the input. The
// program must form the binary represention of an integer X by replacing a by 1
// and b by O in the string S. Then the program must print the value of X as the
// output.

// Boundary Condition(s):
// 1 <= Length of S <= 30

// Input Format:
// The first line contains the string S.

// Output Format:
// The first line contains the integer X.

// Example Input/Output 1:
// Input:
// aabba

// Output:
// 25

// Explanation:
// After replacing all the occurrences of a by 1 and b by O, the string becomes
// 11001.
// So the decimal equivalent of (11001)2 is 25.
// Hence the output is 25

// Example Input/Output 2:
// Input:
// abbaaba

// // Output:
// 77

import java.util.*;
public class String_Decimal
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next().replace("a","1").replace("b","0");
        System.out.print(Integer.parseInt(a,2));
    }
}