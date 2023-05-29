// The program must accept N integers as the input.The program must print two integers among the N integers whose difference is maximum as the output. The two integers must be printed in 
// ascending order.

// Boundary Condition(s);
// 2<= N <=10^5
// 1<= Each integer value <=10^5

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains two integers separated by a space.

// Example Input/Output 1:
// Input:
// 4
// 3 3 4 5

// Output:
// 3 5

// Explanation:
// The difference between 3 and 5 is 2.
// The difference between 3 and 4 is 1.
// The difference between 4 and 5 is 1.
// Hence 3 and 5 are printed.

// Example Input/Output:
// Input:
// 6
// 23 25 12 46 24 13

// Output:
// 12 46


import java.util.*;
public class Maximum_Difference
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++)
            arr[i]=obj.nextInt();
        Arrays.sort(arr);
        System.out.print(arr[0]+" "+arr[a-1]);
    }
}