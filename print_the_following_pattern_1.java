import java.util.Scanner;

public class ABCD {
    public static void main (String args[] )
    {
         Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
       
        
        }
    }


