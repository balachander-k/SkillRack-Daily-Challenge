import java.util.*;
public class FlowChartLogic_035 
{
    public static int getPower(int x,int y)
    {
        int powerVal=1;
        while(y>0)
        {
            powerVal=powerVal*x;
            y--;
        }
        return powerVal;
    }
    public static void main(String[] arg)
    {
        int N=obj.nextInt(),temp=N,numOfDigits=0;
        while(temp>0)
        {
            numOfDigits++;
            temp=temp/10;
        }
        int tenPowerVal=getPower(10,numOfDigits/2);
        System.out.print((N/tenPowerVal==N%tenPowerVal)?"YES":"NO");
    }
}