// The program must accept N string values as the input. The program must print the
// alphabets with the least ASCII values in each string as the output.

// Boundary Condition(s):
// 1 <= N < = 100
// 1 <= Length of S <= 100

// Input Format:
// The first line contains N.
// The second line contains N string values separated by a space.

// Output Format:
// The first line contains the alphabet(s) with least ASCII values in each string
// separated by a space.

// Example Input/Output 1:
// Input:
// 3
// apple tree owl

// Output:
// a e l

// Explanation:
// In the string apple, the alphabet with the least ASCII value is a (97).
// In the string tree, the alphabet with the least ASCII value is e (101).
// In the string owl, the alphabet with the least ASCII value is I (108).
// Hence the output is a e I

// Example Input/Output 2:
// Input:
// 5
// GREEK INDIA ZOO LION BULL

// Output:
// E A O I B


import java.util.*;
public class Least_ASCII_Values 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        String[] arr=new String[size];
        for(int i=0;i<size;i++)
            arr[i]=obj.next();
        for(int i=0;i<size;i++)
        {
            char[] d=arr[i].toCharArray();
            int min=Integer.MAX_VALUE;
            for(int j=0;j<d.length;j++)
            {
                int temp=(int)d[j];
                if(temp<min)
                    min=temp;
            }
            System.out.print((char)min+" ");
        }
    }
}