// The program must accept an integer Y representing a year as the input. The
// program must print the last date of each month in the year Y as the output. The
// format of each date must be DD-MMM-YYYY.

// Note: The value of MMM will be from Jan, Feb, Mar, Apr,... till Dec.

// Boundary Condition(s):
// 1000 < = Y <= 2500

// Input Format:
// The first line contains Y.

// Output Format:
// The first 12 lines, each containing the last date of each month in the year Y.

// Example Input/Output 1:
// Input:
// 2010

// Output:
// 31-Jan-2010
// 28-Feb-2010
// 31-Mar-2010
// 30-Apr-2010
// 31-May-2010
// 30-Jun-2010
// 31-Jul-2010
// 31-Aug-2010
// 30-Sep-2010
// 31-Oct-2010
// 30-Nov-2010
// 31-Dec-2010

// Explanation:
// There are 31 days in the months Jan, Mar, May, Jul, Aug, Oct and Dec.
// There are 30 days in the months Apr, Jun, Sep and Nov.
// There are 28 days in the month Feb as the year 2010 is not a leap year.

// Example Input/Output 2:
// Input:
// 1940

// Output:
// 31-Jan-1940
// 29-Feb-1940
// 31-Mar-1940
// 30-Apr-1940
// 31-May-1940
// 30-Jun-1940
// 31-Jul-1940
// 31-Aug-1940
// 30-Sep-1940
// 31-Oct-1940
// 30-Nov-1940
// 31-Dec-1940


import java.util.*;
public class Last_Date_In_Year
{
    public static boolean isLeapYear(int y)
    {
        if(y%4==0)
        {
            if(y%100==0)
                return y%400==0;
            return true;
        }
        return false;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int year=obj.nextInt();
        String[] month={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        int[] day={31,isLeapYear(year)?29:28,31,30,31,30,31,31,30,31,30,31};
        for(int i=0;i<12;i++)
            System.out.println(day[i]+"-"+month[i]+"-"+year);
    }
}