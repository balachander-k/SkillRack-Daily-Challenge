import java.util.*;
public class FlowChartLogic_042
{
    public static void main(String[] arg)
    {
        int x=obj.nextInt(),y=obj.nextInt(),z=obj.nextInt(),isPrinted=0,max=0;
        if(x>y)
            max=x;
        else 
            max=y;
        int val=2;
        while(val<=max)
        {
            if(x%val==0 && y%val==0 && z%val!=0)
            {
                System.out.print(val+" ");
                isPrinted=1;
            }
            val++;
        }
        if(isPrinted==0)
            System.out.print("-1");
        
    }
}