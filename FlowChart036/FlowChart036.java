import java.util.*;
public class FlowChart036
{
    public static int getNumberOfBinary(int n)
    {
        int onesCount=0;
        while(n>0)
        {
            onesCount+=n%2;
            n/=2;
        }
        return onesCount;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int m=obj.nextInt(),n=obj.nextInt();
        System.out.print(getNumberOfBinary(m)^n);
    }
}