// The program must accept an integer X and N integers representing the weight of the N sweet items. If the weight of any sweet item exceeds X then 1kg of the same sweet item will be given as complimentary. The program must print the total weight of sweets bought as the output.

// Boundary Condition(s);
// 1<= N, Weight X <=1000

// Input Format:
// The first line contains N and X separated by a space.
// The second line contains N integers separated by space(s).

// Output Format:
// The first line contains the total weight of sweets.

// Example Input/Output 1:
// Input:
// 5 10
// 5 10 15 3 20

// Output:
// 55

// Explanation:
// The sweets with weight 15 and 20 exceed the given X value 10 so they 1kg is added to each.
// So their weight becomes 16 and 21.
// The total sum is 5 + 10 + 16 + 3 + 21 = 55

// Example Input/Output 2:
// Input:
// 5 5 
// 2 6 8 1 12

// Output:
// 32



import java.util.*;
public class Complimentary_Sweets 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=obj.nextInt();
        int[] c=new int[a];
        for(int i=0;i<a;i++)c[i]=obj.nextInt();
        int value=0,sum=0;
        for(int i=0;i<a;i++)
        {
            if(c[i]>b)value=++c[i];
            else value=c[i];
            sum=sum+value;
        }
        System.out.print(sum);
    }
}