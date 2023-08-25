import java.util.*;
public class maaa{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int t=x.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=x.nextInt();
            int a[]=new int[n-1];
            for (int j=0;j<n-1;j++)
            {
                 a[j]=x.nextInt();
                
            }
            Arrays.sort(a);
            
            int f=0;
            int k;
            for(k=0;k<n-2;k++)
            {
                if(a[k+1]-a[k]>=2){
                    f=1;
                    System.out.println(a[k]+1);
                }
                
            }
            if(f==0)
            {
                System.out.println(a[k]+1);
            }
        }
    }
    }
