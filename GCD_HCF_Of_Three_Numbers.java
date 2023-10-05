// The program must accept three integers X, Y and Z as the input. The program
// must print the GCD (Greatest Common Divisor) of X, Y and Z as the output.

// Boundary Condition(s):
// 1<= X,y,Z <= 10^8

// Input Format:
// The first line contains X, Y and Z separated by a space.

// Output Format:
// The first line contains the GCD of X, Y and Z.

// Example Input/Output 1:
// Input:
// 70 100 50

// Output:
// 10

// Example Input/Output 2:
// Input:
// 26 65 13

// Output:
// 13

import java.util.*;
public class GCD_HCF_Of_Three_Numbers 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt(),y=obj.nextInt(),z=obj.nextInt(),gcd=0;
        for(int i=1;i<=x && i<=y && i<=z;i++)
            if(x%i==0 && y%i==0 && z%i==0)
                gcd=i;
        System.out.print(gcd);
    }
}