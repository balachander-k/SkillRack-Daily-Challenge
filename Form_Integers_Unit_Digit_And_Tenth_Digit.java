// The program must accept N integers as the input. For every two consecutive
// integers X and Y among the N integers, the program must form an integer by
// concatenating the unit digit of X and the tenth digit of Y. Then the program must
// print all the obtained integers in the order of occurrence as the output.

// Boundary Condition(s):
// 2 <= N < = 100
// 10 <= Each integer value <= 10^5

// Input Format:
// The first line contains the value of N.
// The second line contains the N integers separated by space(s).

// Output Format:
// The first line contains the integers separated by a space based on the given
// conditions.

// Example Input/Output 1:
// Input:
// 5
// 19 12 56 20 50

// Output:
// 91 25 62 5

// Explanation:
// The unit digit of 19 is 9 and the tenth digit of 12 is 1. so 91 is printed.
// The unit digit of 12 is 2 and the tenth digit of 56 is 5. so 25 is printed.
// The unit digit of 56 is 6 and the tenth digit of 20 is 2. so 62 is printed.
// The unit digit of 20 is O and the tenth digit of 50 is 5. so 5 is printed.

// Example Input/Output 2:
// Input:
// 6
// 520 50 18 10 99 247

// Output:
// 5 1 81 9 94

import java.util.*;
public class Form_Integers_Unit_Digit_And_Tenth_Digit
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=obj.nextInt();
        for(int i=0;i<size;i++)
        {
            try{
                int unit=arr[i]%10;
                int tenth=(arr[i+1]%100)/10;
                int temp=(unit*10)+tenth;
                System.out.print(temp+" ");
            }
            catch(Exception e)
            {
                break;
            }
        }
    }
}