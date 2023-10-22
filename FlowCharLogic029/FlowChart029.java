import java.util.*;
public class FlowChartLogic029 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),x=obj.nextInt();
        n=n-(n%x);
        while(n>0)
        {
            System.out.print(n+" ");
            n=n-x;
        }
    }
}