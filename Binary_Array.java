import java.util.*;
public class jd{
    public static void main(String arg[]){
        Scanner c=new Scanner (System.in);
        int a=c.nextInt();
        int ar[]=new int[a];
        int k=0;
        for (int i=0;i<a;i++){
            ar[i]=c.nextInt();
            if(ar[i]!=1 && ar[i]!=0){
                k=1;
                //System.out.print("False");
                break;
            }
            
        }
        if(k==1){
            System.out.print("False");
        }
        else{
            System.out.print("True");
        }
        
    }
}