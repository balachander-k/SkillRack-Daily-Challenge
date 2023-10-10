// There are three water tanks A, B and C are filled with X, Y and Z litres of water
// respectively. The values of X, Y and Z are passed as the input to the program. The
// program must print the minimum quantity of additional water (in litres) is required
// to fill all three tanks with equal water.
// Note: The water can not be drained from any tank.

// Boundary Condition(s):
// 1<= X,Y,Z <=10^4

// Input Format:
// The first line contains X, Y and Z separated by a space.

// Output Format:
// The first line contains an integer representing the minimum quantity of additional
// water (in litres).

// Example Input/Output 1:
// Input:
// 5 10 7

// Output:
// 8


// Explanation:
// Here Y-IO and
// The tank A requires 5 litres of water and tank C requires 3 litres of water to make
// all the three tanks equal.
// The minimum quantity of water required is 8 (5 + 3).
// So 8 is printed as the output.

// Example Input/Output 2:
// Input:
// 5 5 1
// Output:
// 4

// Example Input/Output 3:
// Input:
// 9 9 9
// Output:
// 0

import java.util.*;
public class Three_Tanks_With_Equal_Water
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int arr[]={obj.nextInt(),obj.nextInt(),obj.nextInt()},cop[]=arr.clone();
        Arrays.sort(arr);
        int lr=arr[arr.length-1],sum=0;
        for(int i=0;i<cop.length;i++)
            sum=sum+Math.abs(cop[i]-lr);
        System.out.print(sum);
    }
}