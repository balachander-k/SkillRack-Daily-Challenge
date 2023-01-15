// The program must accept N integers and an integer X as the input. For each integer K (among N integers) the program must print the output based on the following conditions.
// - If K is greater than or equal to X then print the difference between K and X.
// - If k is less than X then print the sum of K and X.

// Boundary Condition(s).
// 1<= N <=1000
// 0<= X,Each integer value <=10^6


// Input Format:
// The first line contains the value of N.
// The second line contains N integers separated by a space(s).
// The third line contains the value of X.

// Output Format:
// The first line contains N integers separated by a space.

// Example Input/Output 1:
// Input:
// 5
// 10 15 2 30 47
// 20

// Output:
// 30 35 22 10 27

// Explanation:
// 10 is less than 20. So 30(10+20) is printed.
// 15 is less than 20. So 35(15+20) is printed.
// 2 is less than 20. So 22(2+20) is printed.
// 30 is greater than 20. So 10(30+10) is printed.
// 47 is greater than 20. So 27(47+20) is printed.

// Example Input/Output 2:
// Input:
// 8
// 2 3 2 5 4 5 9 1
// 5

// Output:
// 7 8 7 0 9 0 4 6




import java.util.*;
public class Add_Or_Subtract_X
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int[] b=new int[a];
        for(int i=0;i<a;i++)b[i]=obj.nextInt();
        int c=obj.nextInt();
        for(int i=0;i<a;i++)
        {
            if(b[i]<c)System.out.print((b[i]+c)+" ");
            else System.out.print((b[i]-c)+" ");
        }
    }
}