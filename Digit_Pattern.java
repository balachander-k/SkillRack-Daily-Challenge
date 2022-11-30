// The program must accept an integer N the input. The program must print the desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s);
// 1<= N <=10^6

// Input Format:
// The first line contains the value of N.


// Output Format:
// The list od lines containing the desired pattern as shown in the Example/Input Output section.

// Example Input/Ouput 1:
// Input:
// 41325

// Output:
// |****
// |*
// |***
// |**
// |*****

// Example Input/Output 2:
// Input:
// 60710

// Output:
// |******
// |
// |*******
// |*
// |




import java.util.*;
public class Digit_Pattern 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] a=obj.nextLine().toCharArray();
        for(int i=0;i<a.length;i++)
        {
            int temp=Integer.parseInt(String.valueOf(a[i]));
            if(temp==0)
                System.out.print("|");
            else 
            {
                System.out.print("|");
                for(int j=1;j<=temp;j++)
                {
                    System.out.print(*);
                }
            }
        }
        System.out.println();
    }
}