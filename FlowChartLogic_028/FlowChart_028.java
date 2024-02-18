import java.util.*;
public class FlowChart_028 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] str=new char[101];
        String val=obj.next();
        for(int i=0;i<val.length();i++)
            str[i]=val.charAt(i);
        int len=val.length(),index=0;
        while(index<len)
        {
            if(str[index]>='a' && str[index]<='j')
                System.out.print(str[index]);
            else 
                System.out.print("*");
            index++;
        }
    }
}