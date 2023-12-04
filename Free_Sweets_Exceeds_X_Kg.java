// The program must accept N integers and two integers X, Y as the input. The N
// integers represent the weight of N sweet items. If the weight of any sweet item
// exceeds X kg then Y kg of the same sweet item will be given as complimentary.
// The program must print the total weight of N sweet items as the output.

// Boundary Condition(s):
// 1 <= N, X, Y <= 100
// 1 <= Each integer value <= 100

// Input Format:
// The first line contains N, X and Y separated by a space.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains the total weight of N sweet items.

// Example Input/Output 1:
// Input:
// 5 10 4
// 6 10 13 3 22

// Output:
// 62

// Explanation:
// The sweets with weight 13 and 22 exceed the given X value IO, so 4 kg of the
// same sweet is added to each.
// So their weight becomes 17 and 26.
// The total sum is 6 + 10 + 17 + 3 + 26 = 62

// Example Input/Output 2:
// Input:
// 3 20 20
// 20 21 40

// Output:
// 121


import java.util.*;
public class Free_Sweets_Exceeds_X_Kg
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),x=obj.nextInt(),y=obj.nextInt(),sum=0;
        for(int i=0;i<n;i++)
        {
            int sweet=obj.nextInt();
            if(sweet>x)
                sweet+=y;
            sum=sum+sweet;
        }
        System.out.print(sum);
    }
}