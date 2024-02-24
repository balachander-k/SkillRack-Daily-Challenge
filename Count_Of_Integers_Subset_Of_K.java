// The program must accept three integers X, Y and K as the input. The program
// must print the count of integers from X to Y which contains the integer K as a
// subset.

// Boundary Condition(s):
// 1 <= X < Y <=10^8
// 1 <= K <= Y 

// Input Format:
// The first line contains X, Y and K separated by a space.

// Output Format:
// The first line contains the count of integers from X to Y which contains the integer
// K as a subset.

// Example Input/Output 1:
// Input:
// 100 300 25

// Output:
// 12

// Explanation:
// There are 12 integers from 100 to 300 which contains the integer 25 as a subset.
// 125 225 250 251 252 253 254 255 256 257 258 259

// Example Input/Output 2:
// Input:
// 4987 8959 510

// Output:
// 14

// Explanation:
// There 14 integers from 4987 to 8959 which contain the integer 510 as a subset.
// 5100 5101 5102 5103 5104 5105 5106 5107 5108 5109 5510 6510 7510 8510


import java.util.*;
public class Count_Of_Integers_Subset_Of_K 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt(),y=obj.nextInt(),z=obj.nextInt(),count=0;
        for(int i=x;i<=y;i++)
        {
            String val=String.valueOf(i);
            if(val.contains(String.valueOf(z)))
                count++;
        }
        System.out.print(count);
    }
}