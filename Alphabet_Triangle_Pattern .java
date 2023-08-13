// The program must accept an alphabet CH as the input. The program must print
// the desired pattern as shown in the Example Input/Output section.

// Input Format:
// The first line contains the alphabet CH.

// Output Format:
// The lines containing the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// F

// Output:
// A
// B B
// C C C 
// D D D D
// E E E E E
// F F F F F F 

// Example Input/Output 2:
// Input:
// g

// Output:
// A
// B B
// C C C 
// D D D D
// E E E E E 
// F F F F F F
// G G G G G G G


import java.util.*;
public class Alphabet_Triangle_Pattern 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char inp=Character.toUpperCase(obj.next().charAt(0));
        for(int i=1;i<=(int)inp-64;i++)
            for(int j=1;j<=i;j++)
                System.out.print((j!=i)?((char)(i+64)+" "):((char)(i+64)+"\n"));
    }
}