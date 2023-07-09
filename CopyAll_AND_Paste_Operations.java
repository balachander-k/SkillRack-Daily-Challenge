// The program must accept an integer N and a string S as the input. The program
// must perform two operations they are copyAll and paste repeatedly for N times.
// Each time when the copyAll operation is performed, all the characters in the string
// S are copied. The paste operation pastes the last copied characters at the end of
// the string S. Finally, the program must print the number of characters present in
// the string S after repeating the two operations for N times.

// Boundary Condition(s):
// 1 <= N <=100
// 1 <= Length of S <= 100

// Input Format:
// The first line contains the integer N and the string S separated by a space

// Output Format:
// The first line contains the length of the final string.

// Example Input/Output 1:
// Input:
// 2 abc

// Output:
// 12

// Explanation:
// Initially, the string S contains
// The first time copyAll operation is performed. So abc is copied.
// Then the paste operation is performed. Now, the string contains the characters
// The second time copyAll operation is performed. So abcabc is copied.
// Then the paste operation is performed. Now, the string S contains the characters
// There are 12 characters in the string S.
// Hence the output is 12

// Example Input/output 2:
// Input:
// 4 kj*gf$k

// Output:
// 112

import java.util.*;
public class CopyAll_AND_Paste_Operations
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        String b=obj.next();
        long len=b.length();
        for(int i=0;i<a;i++)
            len=len+len;
        System.out.print(len);
    }
}