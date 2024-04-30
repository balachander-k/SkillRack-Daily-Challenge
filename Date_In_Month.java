// The program must accept a valid date D in the format of DD-MM-YYYY as the
// input The program must print the name of the month in the given date as the
// output.

// Boundary Condition(s):
// 1 <= DD <= 31
// 1 <= MM <= 12
// 1000 <= YYYY <= 2020

// Input Format:
// The first line contains a valid date.

// Output Format:
// The first line contains the month for the given date.

// Example Input/Output 1:
// Input:
// 27-11-1997

// Output:
// November

// Explanation:
// The given date is 27-11-1997. The month 11 indicates November.
// Hence the output is November

// Example Input/Output 2:
// Input:
// 08-04-2020

// Output:
// April


import java.util.*;
public class Date_In_Month
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String val=obj.nextLine();
        String[] arr=val.split("-");
        if(arr[1].equals("01"))
            System.out.print("January");
        else if(arr[1].equals("02"))
            System.out.print("February");
        else if(arr[1].equals("03"))
            System.out.print("March");
        else if(arr[1].equals("04"))
            System.out.print("April");
        else if(arr[1].equals("05"))
            System.out.print("May");
        else if(arr[1].equals("06"))
            System.out.print("June");
        else if(arr[1].equals("07"))
            System.out.print("July");
        else if(arr[1].equals("08"))
            System.out.print("August");
        else if(arr[1].equals("09"))
            System.out.print("Setepmber");
        else if(arr[1].equals("10"))
            System.out.print("October");
        else if(arr[1].equals("11"))
            System.out.print("November");
        else 
            System.out.print("December");
    }
}