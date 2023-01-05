// The program mst accept N integers and two integers X, Y as the input. The program must print YES if the number of occurences of X is greater than or equal to the number of occurrences of Y. Else the program must print NO as the output.

// Boundary Condition(s);
// 1<= N <=1000
// 1<= X,Y, Each integer value <=10^8


// Input Format:
// The first line contains the value of N.
// The second line contains N integers separated by a space(s).
// The third line contains the values of X and Y separated by a space.

// Output Format:
// The first line contains either YES or NO.

// Example Input/Output 1:
// Input:
// 5
// 8 8 3 8 3
// 8 3

// Output:
// YES

// Explanation:
// The number of occurrences of 8 is 3.
// The number of occurrences of 3 is 2.
// So 8 occurs more than 3.
// Hence the output is YES.

// Example Input/Output 2:
// Input:
// 7
// 17 12 13 12 13 14 13
// 12 13



import java.util.*;
public class Occurrences_Of_X_And_Y
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int[] b=new int[a];
        for(int i=0;i<a;i++)b[i]=obj.nextInt();
        int d=obj.nextInt(),e=obj.nextInt();
        int count1=0,count2=0;
        for(int i=0;i<a;i++)
        {
            if(b[i]==d)
                count1++;
            if(b[i]==e)
                count2++;
        }
        if(count1>=count2)
            System.out.print("YES");
        else 
            System.out.print("NO");
    }
}