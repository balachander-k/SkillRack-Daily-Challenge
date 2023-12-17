// The program must accept an integer N and a character CH as the input. The
// program must print the desired pattern as shown in the Example Input/Output
// section.

// Boundary Condition(s):
// 4 <= N <=50

// Input Format:
// The first line contains N and CH separated by a space.

// Output Format:
// The lines contain the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 5 *

// Output:
// ----*
// ---***
// --*-*-*
// -*--*--*
// *********
// -*--*--*
// --*-*-*
// ---***
// ----*


// Example Input/Output 2:
// Input:
// 6 #

// Output:
// -----#
// ----###
// ---#-#-#
// --#--#--#
// -#---#---#
// #############
// -#---#---#
// --#--#--#
// ---#-#-#
// ----###
// -----#



import java.util.*;
public class Diamond_Diagonal_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<String>();
        int n=obj.nextInt(),t=1,r=3,y=1;
        char ch=obj.next().charAt(0);
        for(int i=1;i<n;i++)
        {
            String alt="";
            for(int j=n-i;j>=1;j--)
            {
                System.out.print("-");
                alt=alt+"-";
            }
            if(i<=2)
            {
                for(int j=1;j<=t;j++)
                {
                    System.out.print(ch);
                    alt=alt+ch;
                }
            }
            else 
            {
                for(int j=1;j<=r;j++)
                {
                    System.out.print(ch);
                    alt=alt+ch;
                    if(j!=r)
                    {
                        for(int k=1;k<=y;k++)
                        {
                            System.out.print("-");
                            alt=alt+"-";
                        }
                    }
                }
                y++;
            }
            t=t+2;
            list.add(alt);
            System.out.println();
        }
        for(int i=1;i<=t;i++)
            System.out.print(ch);
        System.out.println();
        for(int i=list.size()-1;i>=0;i--)
            System.out.println(list.get(i));
    }
}