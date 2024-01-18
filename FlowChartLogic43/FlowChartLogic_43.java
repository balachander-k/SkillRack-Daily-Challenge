import java.util.*;
public class FlowChartLogic_43
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),x=obj.nextInt(),y=obj.nextInt();
        int ctr=1;
        while(ctr<N)
        {
            if(x%ctr==0 || y%ctr==0)
                if(x%y==0 || y%x==0)
                    System.out.print(ctr+" ");
            ctr++;
        }
        System.out.print(N);
    }
}