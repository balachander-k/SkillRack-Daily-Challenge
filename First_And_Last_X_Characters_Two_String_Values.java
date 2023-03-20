// The program must accept two string values Sl, S2 and an integer X as the input. The
// program must print first X characters in the string Sl and then the program must print last X
// characters in the string S2 as the output.

// Boundary Condition(s):
// 1 <= Length of Sl, S2 <= 100
// 1 <= X Length of Sl, S2

// Input Format:
// The first line contains the string Sl.
// The second line contains the string S2.
// The third line contains the integer X.

// Output Format:
// The first line contains 2*X characters.

// Example Input/Output 1:
// Input:
// coconutTree
// banana
// 4

// Output:
// coconana

// Explanation:
// The first 4 characters in the string coconutTree are
// coco.
// The last 4 characters in the string banana are
// nana.
// Hence the output is coconana

// Example Input/Output 2:
// Input:
// encourage
// victory
// 3

// Output:
// encory

import java.util.*;
public class First_And_Last_X_Characters_Two_String_Values
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next(),b=obj.next(),val="";
        int c=obj.nextInt(),count=0;
        for(int i=0;i<a.length();i++)
        {
            if(i==c)
                break;
            else 
                System.out.print(a.charAt(i));
        }
        for(int i=b.length()-1;i>=0;i--)
        {
            if(c==count)
                break;
            else 
            {
                val=b.charAt(i)+val;
                count++;
            }
        }
        System.out.print(val);
    }
}