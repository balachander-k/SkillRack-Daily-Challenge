// The program must accept an integer N as the input. The program must print the each digit of N in the words as the output.

// Boundary Condition(s);
// 1<= N <=10^7

// Input Format:
// The first line contains the integer N.

// Output Format:
// The first line contains the list of string values which represents each digit of N in words separated by a space(s).

// Example Input/Output 1:
// Input:
// 2048

// Output:
// two zero four eight

// Explanation:
// The digit 2 in 2048 is convereted into word as two.
// The digit 0 in 2048 is converered into word as zero.
// The digit 4 in 2048 is convereted into word as four.
// The digit 8 in 2048 is convereted into word as eight.
// Hence the output is two zero four eight.

// Example Input/Output 2:
// Input:
// 2019

// Output:
// two zero one nine



import java.util.*;
public class Number_In_Words 
{
    public static void word(int r)
    {
        if(r==0)
            System.out.print("zero"+" ");
        else if(r==1)
            System.out.print("one"+" ");
        else if(r==2)
            System.out.print("two"+" ");
        else if(r==3)
            System.out.print("three"+" ");
        else if(r==4)
            System.out.print("four"+" ");
        else if(r==5)
            System.out.print("five"+" ");
        else if(r==6)
            System.out.print("six"+" ");
        else if(r==7)
            System.out.print("seven"+" ");
        else if(r==8)
            System.out.print("eight"+" ");
        else
            System.out.print("nine"+" ");
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] a=obj.nextLine().toCharArray();
        for(int i=0;i<a.length;i++)
        {
            int temp=Integer.parseInt(String.valueOf(a[i]));
            word(temp);
        }
    }
}