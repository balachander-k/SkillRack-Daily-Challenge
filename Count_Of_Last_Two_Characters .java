// The program must accept a string S as the input. The program must find and print
// the number of occurrences of the last two characters of S in the same string S as
// the output.

// Boundary Condition(s):
// 2 <= Length of S <= 10^4

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the number of occurrences of the last two characters of S in
// the same string S.

// Example Input/Output 1:
// Input:
// hiabchi

// Output:
// 2

// Explanation:
// The last two characters of the string hiabchi are h and i. Here the hi has occurred
// 2 times in the string hiabchi.
// Hence the output is 2

// Example Input/Output 2:
// Input:
// MOOONOO

// Output:
// 3


import java.util.*;
public class Count_Of_Last_Two_Characters 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] val=obj.next().toCharArray();
        char ch1=val[val.length-2],ch2=val[val.length-1];
        int i=0,j=1,count=0;
        while(true)
        {
            try{
                if(val[i]==ch1 && val[j]==ch2)
                    count++;
                i++;
                j++;
            }
            catch(Exception e)
            {
                break;
            }
        }
        System.out.print(count);
    }
}