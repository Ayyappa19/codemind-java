import java.util.Scanner;
public class fjf{
    public static void main(String ary[]){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=x.nextInt();
        }
        int s=0;
        int j=0;
        for(int i=n-1;i>=0;i--){
            int k=0;
            if(a[i]!=0){
            k=(int)Math.pow(2,j);
            }
            //System.out.print(k+" ");
            j+=1;
            s+=k;
        }
        System.out.print(s);
        
    }
}