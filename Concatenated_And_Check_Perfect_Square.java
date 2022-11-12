// The program must accept two integers X and Y as the input. The program must concatenate both the integers and check whether the formed integer is a perfect square or not. If the formed integer is a perfectsquare, then the program must print Yes.Else the program must print No as the Output.

// Boundary Condition(s);
// 1<=X<=10000
// 1<=Y<=10000

// Input Format:
// The first line contains the value of X and Y separated by a space.

// Output Format:
// The first line contains either Yes or No.

// Example Input/Output 1:
// Input:
// 1 21

// Output:
// Yes

// Explanation:
// Integers values 1 and 21 can be concatenated as 211 and 121.
// 211 is not a perfect square. But 121(11*11) is a perfect square.
// Hence the output is Yes.

// Example Input/Output 2:
// Input:
// 2 65

// Output:
// No



import java.util.*;
public class Concatenated_And_Check_Perfect_Square
{
    public static int prefectSquare(int x,int y)
    {
        double cmp=0.0;
        int temp1=(int)Math.sqrt(x);
        int temp2=(int)Math.sqrt(y);
        double check1=Math.sqrt(x)-temp1;
        double check2=Math.sqrt(y)-temp2;
        if(check1==cmp||(check2==cmp))
            return 1;
        else 
            return 2;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        String c=String.valueOf(a)+String.valueOf(b);
        String d=String.valueOf(b)+String.valueOf(a);
        int e=Integer.parseInt(c);
        int f=Integer.parseInt(d);
        if(prefectSquare(e,f)==1)
            System.out.print("yes");
        else
            System.out.print("No");
    }
}