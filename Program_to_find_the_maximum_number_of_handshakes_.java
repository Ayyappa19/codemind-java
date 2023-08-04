import java.util.Scanner;
public class hand{
    public static void main(String args[])
    {
        Scanner g = new Scanner(System.in);
        int a,b;
        a=g.nextInt();
        b=(a*(a-1))/2;
        System.out.println(b);
    }
}