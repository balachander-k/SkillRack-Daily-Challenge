// The program must accept two integers X representing the voltage supplied from a socket
// and Y representing the voltage required by a television. The television can stabilize voltage
// variations of plus or minus 50 units. The program must print yes if the television can work if
// plugged into the socket. Else the program must print no as the output.

// Boundary Condition(s):
// 50 <=X, Y <=1000

// Input Format:
// The first line contains X and Y separated by space.

// Output Format:
// The first line contains yes or no.

// Example Input/Output 1:
// Input
// 220 260

// Output:
// yes

// Explanation:
// The voltage supplied from the socket is 40 less than the required voltage (260) which can be
// stabilized by the television.
// So yes is printed as the output.

// Example Input/Output 2:
// Input:
// 150 205

// Output:
// no




import java.util.*;
public class Stabilized_Voltage
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=obj.nextInt(),mins=Math.abs(b-a);
        if(mins<=50)System.out.print("yes");
        else System.out.print("no");
    }
}