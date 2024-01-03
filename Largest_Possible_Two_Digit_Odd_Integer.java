import java.util.*;
public class Largest_Possible_Two_Digit_Odd_Integer 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        char[] x=obj.next().toCharArray(),y=obj.next().toCharArray();
        for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<y.length;j++)
            {
                String c=String.valueOf(x[i])+String.valueOf(y[j]);
                String d=String.valueOf(y[j])+String.valueOf(x[i]);
                int r=Integer.parseInt(c),t=Integer.parseInt(d);
                if(r%2!=0)list.add(r);
                if(t%2!=0)list.add(t);
            }
        }
        Collections.sort(list);
        System.out.print((list.isEmpty())?"-1":list.get(list.size()-1));
    }
}