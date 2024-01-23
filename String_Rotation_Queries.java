// The program must accept a string S and Q queries as the input. Each query
// contains an alphabet D and an integer M. The alphabet D represents a direction (L
// or R). The integer M represents a magnitude. For each query, the program must
// modify the string S based on the conditions.
// - If the direction is L, then the program must rotate the string S by M positions in
// the clockwise direction.
// - If the direction is R, then the program must rotate the string S by M positions in
// the anticlockwise direction.
// After processing each query, the program must print the first character in the
// modified string as the output.

// Boundary Condition(s):
// 1 <= Length of S <= 100
// 1 <= Q <= 30
// O <= M <= 100

// Input Format:
// The first line contains S.
// The second line contains Q.
// The next Q lines, each containing D and M separated by a space.

// Output Format:
// The first line contains the string as per the given conditions.

// Example Input/Output 1:
// Input:
// carriage
// 3
// L 3
// R 2
// L 2

// Output:
// rar

// Explanation:
// Here the string is carriage.
// The first query is L 3, so the string carriage is rotated by 3 positions in the
// clockwise direction. The string becomes riagecar.
// The second query is R 2, so the string riagecar is rotated by 2 positions in the
// anticlockwise direction. The string becomes arriagec.
// The third query is L 2, so the string arriagec is rotated by 2 positions in the
// clockwise direction. The string becomes riagecar.
// The accumulated first characters are rar.
// Hence the output is rar

// Example Input/Output 2:
// Input:
// enormous
// 4
// R 4
// L 1
// R 7 
// L 4 

// Output:
// mouo


import java.util.*;
public class String_Rotation_Queries
{
    public static String RotateClockwise(String val)
    {
        char[] v=val.toCharArray();
        char f=v[0];
        for(int i=0;i<val.length()-1;i++)
            v[i]=v[i+1];
        v[val.length()-1]=f;
        String t=String.valueOf(v);
        return t;
    }
    public static String RotateAntiClockwise(String val)
    {
        char[] v=val.toCharArray();
        char l=v[v.length-1];
        for(int i=val.length()-1;i>0;i--)
            v[i]=v[i-1];
        v[0]=l;
        String t=String.valueOf(v);
        return t;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        int val=obj.nextInt();
        obj.nextLine();
        ArrayList<String> list=new ArrayList<String>();
        for(int i=0;i<val;i++)
            list.add(obj.nextLine());
        String r=String.valueOf(s),rotate="";
        for(int i=0;i<val;i++)
        {
            String[] arr=list.get(i).split(" ");
            int len=Integer.valueOf(arr[1]);
            if(arr[0].equals("L"))
            {
                for(int j=1;j<=len;j++)
                    r=RotateClockwise(r);
                rotate+=String.valueOf(r.charAt(0));
            }
            if(arr[0].equals("R"))
            {
                for(int j=1;j<=len;j++)
                    r=RotateAntiClockwise(r);
                rotate+=String.valueOf(r.charAt(0));
            }
        }
        System.out.print(rotate);
    }
}