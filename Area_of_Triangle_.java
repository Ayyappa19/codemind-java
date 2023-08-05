import java.util.Scanner;
public class avg{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int a,b,c;
        float s,d;
        a=v.nextInt();
        b=v.nextInt();
        c=v.nextInt();
        s=(float)(a+b+c)/2;
        d=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(String.format("%.2f",d));
        
    }
}