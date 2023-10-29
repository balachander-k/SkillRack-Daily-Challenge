import java.util.*;
public class FlowcharLogic_031 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int x,y,val;
        val=0;
        x=obj.nextInt();
        y=obj.nextInt();
        while(x>0 && y>0)
        {
            val=val*10;
            val=val+x%10;
            val=val*10;
            val=val+y%10;
            x=x/10;
            y=y/10;
        }
        while(x>0)
        {
            val=val*10;
            val=val+x%10;
            x=x/10;
        }
        while(y>0)
        {
            val=val*10;
            val=val+y%10;
            y=y/10;
        }
        System.out.print(val);
    }
}