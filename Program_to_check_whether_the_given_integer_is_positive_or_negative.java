import java.util.Scanner;
public class ain{
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int a;
        a=x.nextInt();
        if(a<0){
        System.out.print("Negative Number");
        }
        else{
             System.out.print("Positive Number");
        }
    }
}