// The program must accept three integers X, Y and Z as the input. The program must
// print the value having the largest tenth digit as the output. If multiple values have the
// largest tenth digit, then the program must print the largest value among them as the
// output.

// Boundary Condition(s):
// 10 < X,Y,Z 10^8

// Input Format:
// The first line contains the value Of X, Y and Z separated by spaces(s).

// Output Format:
// The first line contains the largest value based on the given conditions.

// Example Input/Output 1:
// Input:
// 520 100 210

// Output:
// 520

// Explanation:
// The tenth digits are 2, 0 and 1.
// The largest of them is 2.
// Hence 520 is printed.

// Example Input/Output 2:
// Input:
// 862 62 332

// Output:
// 862



import java.util.*;
public class Largest_Tenth_Digit_Integer
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt(),y=obj.nextInt(),z=obj.nextInt();
        int first=(x/10)%10,second=(y/10)%10,third=(z/10)%10;
        if((first>second) && (first>third))
            System.out.print(x);
        else if((second>first) && (second>third))
            System.out.print(y);
        else if((third>first) && (third>second))
            System.out.print(x);
        else if(first==second)
            System.out.print(Math.max(x,y));
        else if(second==third)
            System.out.print(Math.max(y,z));
        else if(third==first)
            System.out.print(Math.max(z,x));
    }
}