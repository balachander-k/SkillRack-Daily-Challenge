// N integers are passed as input to the program. The program must print YES if all the N-2 integers between first and last integers are greater than the first integer and lesser than the last (Nth) integer. Else the program must print the NO as the output.

// Boundary Condition(s);
// 1<= N <=100

// Input Format:
// The first line contains the value of N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains either YES or NO

// Example Input/Output 1:
// Input:
// 5
// 10 20 12 18 90

// Output:
// YES


// Explanation:
// 20 12 18 - all three are greater than 10 and lesser than 90. Hence YES is printed.

// Example Input/Output 2:
// Input:
// 5
// 10 20 12 18 19

// Output:
// NO

// Explanation:
// 20 is not lesser than 19. Hence NO is printed.




import java.util.*;
public class Middle_Integers_Within_Range
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int[] b=new int[a];
        for(int i=0;i<a;i++)b[i]=obj.nextInt();
        int mins=a-2,count=0;
        for(int i=0;i<a;i++)
        {
            if((b[i]>b[0]) && (b[i]<b[a-1]))
                count++;
        }
        if(count==mins)
            System.out.print("YES");
        else 
            System.out.print("NO");
    }
}