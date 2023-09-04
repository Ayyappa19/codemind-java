import java.util.*;
public class fhf{
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int r=x.nextInt();
        int c=x.nextInt();
        int a[][]= new int[r][c];
        int cn=0,m=0;
        for (int i =0;i<r;i++)
        {
            cn=0;
            for(int j=0;j<c;j++)
            {
                a[i][j]=x.nextInt();
                cn+=a[i][j];
                m=Math.max(m,cn);
            }
        }
        System.out.print(m);
    }
}