import java.util.Scanner;
public class Fibonacci {
    static void fab(int n)
    {
        int a=0,b=1;
       

        for(int i=1;i<=n;i++)
        {
            System.out.print(a+" ");
            int c = a+b;
            a=b;
            b=c;
        }
            
            

        }
    
        public static void main (String args[])
    {
           try( Scanner sc = new Scanner(System.in)){
            System.out.println("enter  Number");
            int num=sc.nextInt();
            fab(num);
            
            sc.close();
           }
        
    }
}
