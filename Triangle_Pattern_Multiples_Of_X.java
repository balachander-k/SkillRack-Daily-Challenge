// The program must accept two integers N and X as the input. The program must print the desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s);
// 1<= N,X <=100


// Input Format:
// The first line contains the values of N and X separated by a space.

// Output Format:
// The first N lines containing the desired pattern as shown in the Example Input/Output section.

// Example Input/Output 1:
// Input:
// 4 5

// Output:
// 1
// 2 3
// 4 * 6
// 7 8 9 *

// Example Input/Output 2:
// Input:
// 5 2

// Output:
// 1 
// * 3
// 4 5 *
// 7 * 9 *
// 11 * 13 * 15




import java.util.*;
public class Triangle_Pattern_Multiples_Of_X
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=obj.nextInt();
        int temp=1;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(temp%b==0)
                    System.out.print("*"+" ");
                else 
                    System.out.print(temp+" ");
                temp++;
            }
            System.out.println();
        }
    }
}
