import java.util.*;
public class Flowchart_Logic_030
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int n,x,y,maxsum;
        maxsum=0;
        n=obj.nextInt();
        int ctr=1;
        while(ctr<=n/2)
        {
            x=obj.nextInt();
            y=obj.nextInt();
            if((x+y)>maxsum)
                maxsum=x+y;
            ctr++;
        }
        System.out.print(maxsum);
    }
}