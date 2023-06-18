// The program must accept a string S as the input. The program must print the
// string from the ISt character, then the program must print the string from the 2nd
// character, then the program must print the string from the 3rd character and so
// on.

// Boundary Condition(s):
// 1 <= Length of S <= 100

// Input Format:
// The first line contains the string S.

// Output Format:
// The first line contains the string value as per the above description
// Example Input/Output 1:
// Input:
// orange

// Output:
// orangerangeangengegee

// Explanation:
// In the string orange, the first character is o. So orange is printed.
// In the string orange, the second character is r. So print the string starting from the
// second character. Hence, range is printed.
// In the string orange, the third character is a. So print the string starting from the
// third character. Hence, ange is printed.
// In the string orange, the fourth character is n. So print the string starting from the
// fourth character. Hence, nge is printed.
// In the string orange, the fifth character is g. So print the string starting from the
// fifth character. Hence, ge is printed.
// In the string orange, the sixth character is e. So the last character is e. Hence, e is
// printed.

// Example Input/Output 2:
// Input:
// ant

// Output:
// antntt


import java.util.*;
public class Expansion_String
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next();
        for(int i=0;i<a.length();i++)
            for(int j=i;j<a.length();j++)
                System.out.print(a.charAt(j));
    }
}