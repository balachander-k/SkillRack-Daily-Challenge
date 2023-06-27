// The program must accept a string S and two characters as CHI and CH2 as the
// input The program must print the minimum distance between CHI and CH2 in the
// string S as the output.

// Note: The characters CHI and CH2 must be in same order as given in the input for
// measuring the distance.

// Boundary Condition(s):
// 2 <= Lenght of S <=100

// Input Format:
// The first line contains the string S.
// The second line contains two characters separated by a space.

// Output Format:
// The first line contains the minimum distance between two characters in S.

// Example Input/Output 1:
// Input:
// hello world
// o l

// Output:
// 1

// Explanation:
// The distance between o and I in the hell wor d is 4.
// The distance between o and I in the hello w rd is 1.
// Here the minimum distance is 1.
// Hence the output is 1

// ExampleInput/Output 2:
// Input:
// may i know your good name
// a m

// Output:
// 0

// import java.util.*;


public class Minimum_Distance_Between_Two_Character
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char b=obj.next().charAt(0),c=obj.next().charAt(0);
        int count=0,min=Integer.MAX_VALUE;
        for(int i=0;i<a.length();i++)
        {
            count=0;
            if(a.charAt(i)==b)
            {
                for(int j=i+1;j<a.length();j++)
                {
                    if(a.charAt(j)==c)
                    {
                        if(count<min)
                            min=count;
                        break;
                    }
                    else 
                        count++;
                }
            }
        }
        System.out.print(min);
    }
}