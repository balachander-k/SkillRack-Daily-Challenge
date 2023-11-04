import java.util.*;
public class FlowChart_Logic_034 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int sum=0,x=obj.nextInt();
        while(x>0)
        {
            sum=sum+x%1000;
            x=x/1000;
        }
        System.out.print(sum);
    }
}