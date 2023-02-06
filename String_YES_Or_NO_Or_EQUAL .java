// The program must accept a string S(where S always contains y and n) as the input. The program must print the output based on the following conditions.
// -If the count of y is greater than the count of n in the string S, print "YES".
// -If the count of y is less than the count of n in the string S, print "NO".
// -If the count of y is equal to the count of n in the string S, print "EQUAL".


// Boundary Condition(s);
// 1<= Length of S <=100

// Input Format:
// The first line contains the string S.


// Output Format:
// The first line contains YES or NO or EQUAL


// Example Input/Output 1:
// Input:
// nnnyyny

// Output:
// NO

// Explanation:
// The count of y in the string is 3.
// The count of n in the string is 4.
// So the cound of y is less than the cound of n.
// Hence the output is NO.

// Example Input/Output 2:
// Input:
// ynynyn

// Output:
// EQUAL



import java.util.*;
public class String_YES_Or_NO_Or_EQUAL 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char[] b=a.toCharArray();
        int ycount=0,ncount=0;
        for(int i=0;i<a.length();i++)
        {
            if(b[i]=='y')
                ycount++;
            if(b[i]=='n')
                ncount++;
        }
        if(ycount>ncount)System.out.print("YES");
        if(ycount<ncount)System.out.print("NO");
        if(ycount==ncount)System.out.print("EQUAL");
    }
}