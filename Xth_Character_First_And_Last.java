// The program must accept a string S and an integer X as the input. The program must print the Xth character form the first and then print the Xth character from the last in the string S as the output.

// Boundary Condition(s);
// 1<= Length of S <=100
// 1<= X <=Length of S

// Input Format:
// The first line contains the string S.
// The second line contains the integer X.

// Output Format:
// The first line contains two characters.

// Example Input/Output 1:
// Input:
// watermelon
// 3

// Output:
// tl


// Example Input/Output 2:
// Input:
// umbrella
// 6

// Output:
// lb



import java.util.*;
public class Xth_Character_First_And_Last
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        int b=obj.nextInt();
        System.out.print(a.charAt(b-1));
        System.out.print(a.charAt(a.length()-b));
    }
}