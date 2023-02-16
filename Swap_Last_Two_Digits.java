// The program must accept two integers X and Y as the input. The program must swap the last two digits of X with the last two digits of Y. Then the program must print their product as the output.

// Boundary Condition(s);
// 10 <= X,Y <=10^4


// Input Format:
// The first line contains X and Y separated by a space.

// Output Format:
// The first line contains the product as per the given condition.


// Example Input/Output 1:
// Input:
// 34 123

// Output:
// 3082

// Explanation:
// The last two digits in both integers are swapped to get 23 and 134.
// The product of the modified integers is 23 * 134 = 3082


// Example Input/Output 2:
// Input:
// 5323 1295

// Output:
// 6598085




import java.util.*;
public class Swap_Last_Two_Digits
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next(),b=obj.next();
        char[] c=a.toCharArray(),d=b.toCharArray();
        char temp='0';
        int t=0,flen=a.length()-1,slen=b.length()-1;
        while(t!=2)
        {
            temp=c[flen];
            c[flen]=d[slen];
            d[slen]=temp;
            t++;
            slen--;
            flen--;
        }
        String convert1=String.valueOf(c),convert2=String.valueOf(d);
        int f=Integer.parseInt(convert1),s=Integer.parseInt(convert2);
        System.out.print(f*s);
    }
}