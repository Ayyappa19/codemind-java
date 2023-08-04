import java.util.Scanner;
public class Disk{
    public static void main(String args[])
    {
        Scanner g = new Scanner(System.in);
        int a,b,c,d;
        a=g.nextInt();
        b=g.nextInt();
        c=g.nextInt();
        d=a*b*c*512*2;
        System.out.println(d);
    }
}