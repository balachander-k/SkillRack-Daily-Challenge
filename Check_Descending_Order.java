// The program must accept N integers as the input. The program must print the yes if the integers are sorted in descending order as the output. Else the program must print no as the output.

// Boundary Condition(s);
// 1<= N <=1000

// Input Format:
// The first line contains the value of N.
// The second line contains N integers separated by a space(s).

// Output Format:
// The first line contains either yes or no.


// Example Input/Output 1:
// Input:
// 6 
// 8 4 4 2 2 2

// Output:
// yes

// Explanation:
// All the 6 integers are arranged in descending order so the output is yes.

// Example Input/Output 2:
// Input:
// 8 
// 10 10 6 8 8 6 6 4

// Output:
// no




import java.util.*;
public class Check_Descending_Order
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int[] b=new int[a];
        for(int i=0;i<a;i++)b[i]=obj.nextInt();
        int count=1;
        for(int i=0;i<a;i++)
        {
            if(i+1<a)
            {
                if(b[i]>=b[i+1])
                    count++;
            }
        }
        if(count==a)System.out.print("yes");
        else System.out.print("no");
    }
}