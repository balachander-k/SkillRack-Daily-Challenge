// An integer N and a string S are passed as the input to the program. The program
// must reverse the first N words in S and print the modified S as the output.

// Boundary Condition(s):
// 2 <= N <= 50
// 3 <= Length of S <= 250

// Input Format:
// The first line contains N.
// The second line contains S.

// Output Format:
// The first line contains the modified string.

// Example Input/Output 1:
// Input:
// 3
// the pen is mightier than the sword

// Output:
// is pen the mightier than the sword

// Explanation:
// The first 3 words "the pen is" are reversed and the remaining words are printed as
// it is.

// Example Input/Output 2:
// Input:
// 6
// the squeaky wheel gets the grease

// Output:
// grease the gets wheel squeaky the



import java.util.*;
public class Reverse_First_N_Words 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        obj.nextLine();
        String b=obj.nextLine();
        String[] c=b.split(" ");
        int len=a-1,temp=a,count=0;
        for(int i=0;i<c.length;i++)
        {
            if(count<a)
            {
                System.out.print(c[len]+" ");
                len--;
            }
            else 
                System.out.print(c[i]+" ");
            count++;
        }
    }
}