// N integers are passed as the input to the program. Two integers X and Y (X <= Y) are also passed as the input to the program. The program must print the sum of the values among these N integers which are from X to Y (inclusive of X and Y).

// Boundary Condition(s);
// 1< = N <=100
// -10^5 <= X <=Y <=10^5
// -10^5 <= Each integer values <=10^5

// Input Format:
// The first line contains the value of N,X and Y separated by a space.
// The second line contains N integers values separated by a space.

// Output Format:
// The first line contains the sum of the values in the range from X to Y.

// Example Input/Output 1:
// Input:
// 5 -100 100
// 10 -30 400 -500 0

// Output:
// -20

// Explanation:
// The integer values which are between -100 and 100 are 10 -30 0 and their sum is -20 which is printed as the output.

// Example Input/Output 2:
// Input:
// 10 -600 500
// 787 561 214 -586 879 647 -893 -617 152 -900

// Output:
// -220



import java.util.*;
public class Sum_Of_Values_Within_Range
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=obj.nextInt(),c=obj.nextInt(),sum=0;
        for(int i=0;i<a;i++)
        {
            int d=obj.nextInt();
            for(int j=b;j<=c;j++)
            {
                if(d==j)
                    sum=sum+d;
            }
        }
        System.out.print(sum);
    }
}