import java.util.*;
public class FlowChartLogic_032
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int n,sum,temp;
        n=obj.nextInt();
        n=temp;
        sum=0;
        while(temp!=0)
        {
            sum=sum+temp%10;
            temp=temp/10;
        }
        System.out.print((n%sum==0)?"YES":"NO");

    }
}