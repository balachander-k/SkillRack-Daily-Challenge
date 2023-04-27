// The program must accept N string values and an integer K as the input. The
// program must sort N string values in descending order and then print the first K
// string values in descending order as the output.
// Note: Assume that all the lowercase alphabets are greater than all the uppercase
// alphabets when sorting in descending order.

// Boundary Condition(s):
// 3 <=N < = 99
// 1<= K <=N
// 3 <= Length of each string < = 100

// Input Format:
// The first line contains the value of N and K separated by a space.
// The next N lines contain the N string values.

// Output Format:
// The first K lines contain the first K string values in descending order.

// Example Input/Output 1:
// Input:
// 5 3
// ball
// hello
// mango
// zebra
// energy

// Output:
// zebra
// mango
// hello

// Explanation:
// After sorting the 5 string values in descending order are zebra, mango, hello,
// energy and ball.
// Here, the first 3 string values are
// Hence the output is
// zebra
// mango
// hello

// Example Input/Output 2:
// Input:
// 6 6
// Antennae
// apple
// baG
// bag
// 800K
// TaBLe

// Output:
// bag
// baG
// apple
// TaBLe
// BoOK
// Antennae


import java.util.*;
public class First_K_String_Values
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=obj.nextInt(),count=0;
        String[] c=new String[a];
        for(int i=0;i<a;i++)
            c[i]=obj.next();
        Arrays.sort(c);
        for(int i=a-1;i>=0;i--)
        {
            if(count!=b)
            {
                System.out.println(c[i]);
                count++;
            }
        }
    }
}