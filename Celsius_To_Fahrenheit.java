// The program must accept the temperature T of a city in Celsius and print it in
// Fahrenheit with the precision up to two decimal places.

// Formula: T (in OF) = (T (in oc) x 9/5) + 32

// Boundary Condition(s):
// -40 < = T 40

// Input Format:
// The first line contains T.

// Output Format:
// The first line contains the temperature T of the city in Fahrenheit.

// Example Input/Output 1:
// Input:
// 27

// Output:
// 80.60

// Explanation:
// Here T=27,
// The temperature 270c is equal to 80.600F ((27 * 9/5) + 32).
// Hence the output is 80.60.

// Example Input/Output 2:
// Input:
// 30.8

// Output:
// 87.44

// Example Input/Output 3:
// Input:
// -12.7

// Output:
// 9.14


import java.util.*;
public class Celsius_To_Fahrenheit
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        double celsius=obj.nextDouble(),fahrenheit=(celsius*1.8)+32;
        System.out.format("%.2f",fahrenheit);
    }
}