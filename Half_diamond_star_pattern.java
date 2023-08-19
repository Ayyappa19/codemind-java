import java.util.Scanner;

public class ABCD {
    public static void main (String args[] )
    {
         Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        if(3<=n && n<=100)
        {
            for(int i=1;i<n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
       
        
        }
        else{
            System.out.print("The pattern is not possible");
        }
        }
    }

