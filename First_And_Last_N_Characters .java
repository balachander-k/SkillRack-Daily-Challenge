// The program must accpet a String S contains only alphabets and an integer N as the input. The program must print the first N alphabets in the string and then print the last N alphabets in the string as the output.

// Boundary Condtion(s);
// 2<= Length of S <=100
// 1<= N <=Length of S

// Input Format:
// The first line contains the string S.
// The second line contains the integer N.

// Output Format:
// The first line contains the first N alphabets and the last N alphabets.

// Example Input/Output 1:
// Input:
// Engineering
// 3

// Output:
// Enging

// Explanation:
// The first 3 alphabets in the string "Engineering" are E n g.
// The last 3 alphabets in the string "Engineering" are i n g.
// Hence the output is Enging.

// Example Input/Output 2:
// Input:
// first 5


// Output:
// firstfirst





import java.util.*;
public class First_And_Last_N_Characters 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] a=obj.nextLine().toCharArray();
        int b=obj.nextInt();
        int sub=a.length-b;
        for(int i=0;i<b;i++)
            System.out.print(a[i]);
        for(int i=sub;i<a.length;i++)
            System.out.print(a[i]);
    }
}