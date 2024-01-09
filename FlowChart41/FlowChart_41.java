import java.util.*;
public class FlowChart_41
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int total=0,ctr=1,N=obj.nextInt(),currNum=0;
        while(ctr<=N)
        {
            currNum=obj.nextInt();
            if(currNum%2==0)
                total+=currNum;
            else 
                total-=currNum;
            ctr++;
        }
        System.out.print(total);
    }
}