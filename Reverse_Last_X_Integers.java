// The program must accept N integers and an integer X as the input. The program must print the last X integers (among N integers) in reverse order as the output.

// Boundary Condition(s);
// 1<= N <=1000
// 1<= X <=N

// Input Format:
// The first line contains the values of N and X separated by a space.
// The second line contains N integers separated by a space(s).

// Output Format:
// The first line contains the last X integers in reverse order separated by a space.

// Example Input/Output 1:
// Input:
// 7 4
// 20 84 64 19 63 26 99

// Output:
// 99 26 63 19

// Explanation:
// The last 4 integers are 19,63,26 and 99.
// The last 4 integers in reverse order are 99,26,63 and 19.
// Hence the output is 99 26 63 19.


// Example Input/Output 2:
// Input:
// 10 10
// 1 2 3 4 5 6 7 8 9 10

// Output:
// 10 9 8 7 6 5 4 3 2 1




import java.util.*;
public class Reverse_Last_X_Integers
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=obj.nextInt(),j=0,count=0;
        int[] array=new int[a];
        for(int i=0;i<a;i++)array[i]=obj.nextInt();
        for(int i=a-1;i>=0;i--)
        {
            if(count!=b)
            {
                System.out.print(array[i]+" ");
                count++;
            }
        }
    }
}