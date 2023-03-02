// A string S with space is passed as the input to the program. The program must print the
// words in S separated by exactly one space character and the additional space characters
// (following the first space character) must be replaced by asterisk (*) if present.

// Boundary Condition(s):
// 1 <= Length Of s <= 1000

// Input Format:
// The first line contains the string S.

// Output Format:
// The first line contains the words as per the given condition.

// Example Input/Output 1:
// Input:
// Practice     makes       perfect

// Output:
// Practice *******makes ******perfect

// Explanation:
// The additional spaces between words are replaced by asterisks and printed.

// Example Input/Output 2:
// Input:
// The    process    needed   30   minutes   to   finish

// Output:
// The **process ****needed *minutes ***to finish


import java.util.*;
public class Replace_Additional_Space
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        int count=0;
        for(int i=0;i<a.length();i++)
        {
            try{
                if(a.charAt(i)==' ')
                {
                    ++count;
                    if(count==1)System.out.print(a.charAt(i));
                    else System.out.print("*");
                }
                else 
                {
                    count=0;
                    System.out.print(a.charAt(i));
                }
            }
            catch(Exception e)
            {
                break;
            }
        }
    }
}