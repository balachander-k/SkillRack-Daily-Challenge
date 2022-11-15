// The program must accept two characters CH1,CH2 and an integer N as the input. The program must print the desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s);
// 1<=N<=100

// Input Format:
// The first line contains the values of CH1,CH2 and N separated by space(s).


// Output Format:
// The first N lines containing the desired pattern as shown in the Example Input/Output section.

// Example Input/Output 1:
// * # 4

// Output:
// * # # # 
// * * # # 
// * * * #
// * * * * 

// Example Input/Output 2:
// Input:
// A C 7

// Output:
// A C C C C C C 
// A A C C C C C 
// A A A C C C C 
// A A A A C C C 
// A A A A A C C 
// A A A A A A C
// A A A A A A A




import java.util.*;
public class Character_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char ch1=obj.next().charAt(0);
        char ch2=obj.next().charAt(0);
        int a=obj.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=a;j++)
            {
                if(j<=i)
                    System.out.print(ch1+" ");
                else 
                    System.out.print(ch2+" ");
            }
            System.out.println();
        }
    }
}