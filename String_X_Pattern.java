// The program must accept a string S as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 3 <= Length of S <= 50

// Input Format:
// The first line contains S.

// Output Format:
// The lines containing the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// water

// Output:
// w***a
// *t*e*
// **r**
// *t*e*
// w***a



import java.util.*;
public class String_X_Pattern 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] temp=obj.next().toCharArray();
        int travese=temp.length%2!=0?temp.length/2+1:temp.length/2;
        int k=0;
        ArrayList<String> list=new ArrayList<String>();
        for(int i=0;i<travese;i++)
        {
            String con="";
            for(int j=0;j<temp.length;j++)
            {
                if(i==j || i+j==temp.length-1)
                {
                    con=con+temp[k]+" ";
                    System.out.print(temp[k++]+" ");
                }
                else 
                {
                    con=con+"*"+" ";
                    System.out.print("*"+" ");
                }
            }
            list.add(con);
            System.out.println();
        }
        int rep=temp.length%2!=0?list.size()-2:list.size()-1;
        for(int i=rep;i>=0;i--)
            System.out.println(list.get(i));
    }
}