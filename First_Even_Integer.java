// The program must accept N integers as the input. The program must print the integers starting from the even integer as the output.
// Note: There will be at least one even integer.

// Boundary Condition(s);
// 1<= N <=1000

// Input Format:
// The first line contains the value of N.
// The second line contains N integers separated by space(s).

// Output Format:
// The first line contains the integers separated by a space.

// Example Input/Output 1:
// Input:
// 7
// 1 3 4 6 7 -2 15

// Output:
// 4 6 7 -2 15

// Explanation:
// The first occurring even integer among N integers is 4.
// So all the integers from 4 are printed as the output.

// Example Input/Output 2:
// Input:
// 10
// 37 841 791 843 35 727 600 831 764 366

// Output:
// 600 831 764 366





import java.util.*;
public class First_Even_Integer
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        int[] array=new int[N];
        int even=0;
        for(int i=0;i<N;i++)
            array[i]=obj.nextInt();
        for(int i=0;i<N;i++)
        {
            if(array[i]%2==0)
            {
                even=i;
                while(even!=N)
                {
                    System.out.print(array[even]+" ");
                    even++;
                }
                i=N;
            }
        }
    }
}