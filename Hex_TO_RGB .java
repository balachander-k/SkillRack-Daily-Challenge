// The program must accept a 24-bit color code in hexadecimal representation as the
// input The program must convert the color code to (R,G,B) representation and
// print it in the format as shown in the Example Input/Output section.

// Boundary Condition(s):
// 000000 <= Hexadecimal color code <= FFFFFF

// Input Format:
// The first line contains # followed by 6 hexadecimal digits.

// Output Format:
// The first line contains the (R,G,B) representation as shown in the Example

// Input/Output section.
// Example Input/Output 1:
// Input:
// #001AFF

// Output:
// (0,26,255)

// Explanation:
// The first two digit value is 00 which is converted to decimal as 0.
// Hence 0 is printed for the color R.
// The second two digit value is IA which is converted to decimal as 26.
// Hence 26 is printed for the color G.
// The third two digit value is FF which is converted to decimal 255.
// Hence 255 is printed for the color B.

// Example Input/Output 2:
// Input:
// #COFFEE

// Output:
// (192,255,238)

import java.util.*;
public class Hex_TO_RGB 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        int r=Integer.valueOf(a.substring(1,3),16);
        int v=Integer.valueOf(a.substring(3,5),16);
        int t=Integer.valueOf(a.substring(5,7),16);
        System.out.print("("+r+","+v+","+t+")");
    }
}