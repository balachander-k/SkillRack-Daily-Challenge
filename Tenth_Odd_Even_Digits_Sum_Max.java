]// The program must accept a list of integers (whose count is less than 100) as the input. The program must calculate the sum of odd digits in the tenth digit position as X. The program must calculate the sum of even digits in the tenth digit position as Y. Then the program must print the maximum value between X and y.

// Boundary Condition(s);
// 10<= value of each integer <=999

// Input Format:
// The first line contains the list of numbers separated by space(s).

// Output Format:
// The first line contains the maximum value between X and Y.

// Example Input/Output 1:
// Input:
// 10 20 30 40 50

// Output:
// 9

// Explanation:
// sum of odd digits in the tenth digit position is 9 (1+3+5=9).
// sum of even digits in the in the tenth digit position is 6(2+4=6).
// 9 > 6 so, 9 is printed as the output.

// Example Input/Output 2:
// Input:
// 100 120 240 360

// Output:
// 12 


import java.util.*;
public class Tenth_Odd_Even_Digits_Sum_Max
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        String[] b=a.split(" ");
        int d=0,ten=0,even=0,odd=0,rem=0,val=0;
        for(int i=0;i<b.length;i++)
        {
            d=Integer.parseInt(b[i]);
            ten=d%100;
            val=ten/10;
            if(val%2==0)
                even=even+val;
            else 
                odd=odd+val;
        }
        if(even>odd)System.out.print(even);
        else System.out.print(odd);
    }
}