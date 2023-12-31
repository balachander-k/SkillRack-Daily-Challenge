// The program must accept the shortcode of a TV serial as the input. The format of
// the TV serial shortcode is "S followed by the season number E followed by the
// episode number". The program must expand and print the name of the TV serial
// as shown in the Example Input/Output section.

// Note: The length of the TV serial shortcode is always 6.

// Input Format:
// The first line contains the shortcode of a TV serial

// Output Format:
// The first line contains the name of the TV serial

// Example Input/Output 1:
// Input:
// S02E05

// Output:
// Season 2, Episode 5

// Explanation:
// The shortcode of the TV serial is S02E05
// In the shortcode, S represents Season and E represents Episode.
// Hence the output is Season 2, Episode 5

// Example Input/Output 2:
// Input:
// S10E47

// Output:
// Season 10, Episode 47

import java.util.*;
public class TV_Serial_Name 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] TV=obj.next().toCharArray();
        for(int i=0;i<TV.length;i++)
        {
            String con="";
            if(TV[i]=='S')
            {
                con=String.valueOf(TV[i+1])+String.valueOf(TV[i+2]);
                System.out.print("Season "+Integer.valueOf(con));
                i=i+2;
            }
            if(TV[i]=='E')
            {
                con=String.valueOf(TV[i+1])+String.valueOf(TV[i+2]);
                System.out.print(", Episode "+Integer.valueOf(con));
                i=i+2;
            }
        }
    }
}