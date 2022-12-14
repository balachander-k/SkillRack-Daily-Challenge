// The program must accpet a string S and an integer K as the input. The program must reverse the middle K characters in S. Then the program must print the modified string as the output.
// Note: The length of S and the integer K always either odd or even.

// Boundary Condition(s);
// 1<= Length of S <=100
// 1<= K <=Length of S

// Input Format:
// The first line contains the modified string.
// The second line contains the integer K.

// Output Format:
// The first line contains the modified string.

// Example Input/Output 1:
// Input:
// acknowledgement
// 7

// Output:
// acknegdelwoment

// Explanation:
// The middle 7 characters are '0','w','I','e','d','g' and 'e'.
// After reversing the middle 7 characters, the string becomes acknegdelwoment
// Hence the output is acknegdelwoment

// Example Input/Output 2:
// Input:
// bottle
// 4

// Output:
// blttoe



import java.util.*;
public class Reverse_Middle_K_Characters 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] a=obj.next().toCharArray();
        int b=obj.nextInt();
        int len=(a.length-b)/2;
        int count=0,mid_index=0;
        String temp="";
        if(a.length==b)
        {
            for(int i=a.length-1;i>=0;i--)
                System.out.print(a[i]);
        }
        else 
        {
            for(int i=0;i<len;i++)
                System.out.print(a[i]);
            for(int i=a.length-1;i>=0;i--)
            {
                if(count==len)
                    break;
                else 
                {
                    temp=a[i]+temp;
                    mid_index=i-1;
                    count++;
                }
            }
            for(int i=mid_index;i>=len;i--)
                System.out.print(a[i]);
            System.out.print(temp);
        }
    }
}