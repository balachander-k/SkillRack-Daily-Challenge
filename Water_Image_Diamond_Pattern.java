// The program must accept an integer N as the input. The program must print 2*N lines of
// output based on the following conditions.

// - In the first line, the program must print N-1 asterisks without any space. Then the
// program must print the integer 1.
// - In the second line, the program must print N-2 asterisks without any space. Then the
// program must print the integers 2 and 3 separated by a space in reverse order.
// - In the third line, the program must print N-3 asterisks without any space. Then the
// program must print the integers 4, 5 and 6 separated by a space in reverse order.
// - Similarly, the program must print the lines till the Nth line.
// - After printing the N line, the program must print the exact water image of the first N
// lines as the output.

// Boundary Condition(s):
// 100

// Input Format:
// The first line contains N.

// Output Format:
// The first 2*N lines containing the asterisks and integer value(s) based on the given
// conditions.

// Example Input/Output 1:
// Input:
// 3

// Output:
// **1
// *3 2 
// 6 5 4 
// 6 5 4
// *3 2 
// **1


// Explanation:
// Here N = 3, so the pattern contains 6 lines of output.
// The first 3 lines are given below.
// After printing the first 3 lines, the water image of the above 3 lines is printed.
// Hence the output is
// **1
// *3 2 
// 6 5 4 
// 6 5 4
// *3 2 
// **1

// Example Input/Output 2:
// Input:
// 4

// Output:
// ***1
// **3 2
// *6 5 4
// 10 9 8 7 
// 10 9 8 7 
// *6 5 4
// **3 2 
// ***1




import java.util.*;
public class Water_Image_Diamond_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<String>();
        int N=obj.nextInt(),r=1,c=1;
        while(c<=N)
        {
            ArrayList<Integer> l=new ArrayList<Integer>();
            String temp="";
            for(int i=1;i<=N-c;i++)
                temp+="*";
            for(int i=1;i<=c;i++)
                l.add(r++);
            for(int i=l.size()-1;i>=0;i--)
                temp+=String.valueOf(l.get(i))+" ";
            System.out.println(temp);
            list.add(temp);
            c++;
        }
        for(int i=list.size()-1;i>=0;i--)
            System.out.println(list.get(i));
    }
}