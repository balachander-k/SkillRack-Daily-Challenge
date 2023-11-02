import java.util.*;
public class Flowchart_Logic_033 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt(),unitDigit=num%10;
        while(num>9)
            num=num/10;
        int val=num*10;
        val=val+unitDigit;
        System.out.print(val*val);
    }
}