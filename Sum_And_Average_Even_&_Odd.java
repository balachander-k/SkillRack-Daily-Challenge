// The program must accept a list of integers as the input. The program must print
// the sum of even integers in the list then the program must print the average of
// odd integers in the list with the precision up to one decimal place. If there is no
// even integer in the list, the program must print -1 as the output. If there is no odd
// integer in the list, the program must print -1 as the output.
// Note: Zero is neither odd nor even. So no need to consider the zero to find the
// sum of even integers and to find the average of odd integers.

// Boundary Condition(s):
// 0 <= Each integer value <= 10^5

// Input Format:
// The first line contains the list of integers separated by space(s).

// Output Format:
// The first line contains the sum of even integers in the list or -1.
// The second line contains the average of odd integers in the list or -1.

// Example Input/Output 1:
// Input:
// 1 2 3 4 5 6 7 8

// Output:
// 20
// 4.0

// Explanation:
// The even integers are 2 4 6 and 8. So their sum is 20
// The odd integers are 1 3 5 and 7. So their average is 4.0
// Hence the output is
// 20
// 4.0

// Example Input/Output 2:
// Input:
// 10 20 30 40 50

// Output:
// 150
// -1

// Example Input/Output 3:
// Input:
// 11 13 15 17 19

// Output:
// -1
// 15.0

import java.util.*;
import java.text.DecimalFormat; 
public class Sum_And_Average_Even_&_Odd
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        int even=0,sum=0;
        double od=0.0,odd=0.0;
        DecimalFormat df=new DecimalFormat("#.#");
        while(obj.hasNext())
        {
            int value=obj.nextInt();
            if(value!=0)
                list.add(value);
        }
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)%2==0)
            {
                sum=sum+list.get(i);
                even++;
            }
            if(list.get(i)%2!=0)
            {
                od=od+list.get(i);
                odd++;
            }
        }
        double avg=(o/odd);
        System.out.print((even!=0)?sum:"-1");
        System.out.print((odd!=0)?df.format(avg)?"-1");
    }
}