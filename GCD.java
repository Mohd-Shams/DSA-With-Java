import java.util.Scanner;

public class GCD {
    static int GreatestCommonDivisor(int n1,int n2)
    {
        while(n2!=0)
        {
            int rem=n1%n2;
            n1=n2;
            n2=rem;
        }
        return n1;
    }
    public static void main (String args[])
    {
           try( Scanner sc = new Scanner(System.in)){
            System.out.println("enter first Number");
            int a=sc.nextInt();
            System.out.println("enter second Number");
            int b=sc.nextInt();
            
            System.out.println("Greatest Common Divisor of "+ a+ "and"+b +"is :"+ GreatestCommonDivisor(a,b));
            sc.close();
           }
        
    }
}
