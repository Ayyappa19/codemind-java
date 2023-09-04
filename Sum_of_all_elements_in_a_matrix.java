import java.util.*;
public class fhf{
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int r=x.nextInt();
        int c=x.nextInt();
        int a[][]= new int[r][c];
        int se=0,so=0;
        for (int i =0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=x.nextInt();
                
                    so+=a[i][j];
            }
        }
        System.out.print(so);
    }
}