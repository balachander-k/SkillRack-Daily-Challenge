// The program must accept N string values as the input. The program must print
// those N string values vertically as shown in the Example Input/Output section.

// Boundary Condition(s):
// 1 <= N, Length of each string <= 100

// Input Format:
// The first line contains N.
// The second line contains N string values separated by a space.

// Output Format:
// The lines containing the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 3
// All is well

// Output:
// Aiw
// Ise
// l*l
// **l

// Example Input/Output 2:
// Input:
// 4
// Robotic process automation RPA

// Output:
// RpaR
// oruP
// botA
// oco*
// tem*
// isa*
// cst*
// **i*
// **o*
// **n*


import java.util.*;
public class Vetrical_String_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt(),max=0;
        String[] arr=new String[num];
        for(int i=0;i<num;i++)
            arr[i]=obj.next();
        for(int i=0;i<num;i++)
            if(arr[i].length()>max)
                max=arr[i].length();
        int i=0;
        while(i!=max)
        {
            for(int j=0;j<num;j++)
            {
                try{
                char[] temp=arr[j].toCharArray();
                System.out.print(temp[i]);
                }
                catch(Exception e)
                {
                    System.out.print("*");
                }
            }
            i++;
            System.out.println();
        }
    }
}