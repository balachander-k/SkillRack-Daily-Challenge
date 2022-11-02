import java.util.*;
public class Main 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N,X;
        N=obj.nextInt();
        X=obj.nextInt();
        int currValue,sum=0,ctr=1;
        while(ctr<=N)
        {
            currValue=obj.nextInt();
            sum=sum+(int)Math.pow(X,currValue);
            ctr++;
        }
        System.out.println(sum/X);
    }
}