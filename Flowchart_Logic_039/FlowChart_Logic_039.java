import java.util.*;
public class FlowChart_Logic_039
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt(),y=obj.nextInt();
        while(x<y)
        {
            System.out.print(x%10);
            System.out.print(y%10);
            x=x/10;
            y=y/10;
        }
        
    }
}