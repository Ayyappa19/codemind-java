import java.util.Scanner;
public class area{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int r;
        float a;
        r=v.nextInt();
        a=(float)3.14*r*r;
       
        System.out.println(String.format("%.2f",a));
        
    }
}