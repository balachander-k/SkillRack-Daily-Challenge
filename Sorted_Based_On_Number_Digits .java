// The program must accept N integers as the input. The program prints yes if the
// integers are sorted in ascending order based on the number of digits in it. Else the
// program prints no as the output.

// Boundary Conditions:
// 1 <= N <= 100
// 1 <= Each integer value <= 10^8

// Input Format:
// The first line contains the value of N.
// The second line contains the N integers separated by space(s).

// Output Format:
// The first line contains either yes or no.
// Example Input/Output 1:
// Input:
// 5
// 9 12 56 20 850

// Output:
// yes

// Explanation:
// The number of digits in 9 is 1.
// The number of digits in 12 is 2.
// The number of digits in 56 is 2.
// The number of digits in 20 is 2.
// The number of digits in 850 is 3.
// Hence the integers are sorted in ascending order based on the number of digits.
// So yes is printed as the output.

// Example Input/Output 2:
// Input:
// 6
// 20 50 18 110 99 147

// Output:
// no


import java.util.*;
public class Sorted_Based_On_Number_Digits 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt(),count=0;
        String[] arr=new String[size];
        int[] num=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=obj.next();
            num[i]=arr[i].length();
        }
        Arrays.sort(num);
        for(int i=0;i<size;i++)
            if(arr[i].length()==num[i])
                count++;
        System.out.print((count==size)?"yes":"no");
    }
}