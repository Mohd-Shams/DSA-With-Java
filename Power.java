import java.util.Scanner;

public class Power {
    double Pow(double x,double n)
    {
        double pow=Math.pow(x,n);
        return pow;
    }
     public static void main (String args[])
    {
           try( Scanner sc = new Scanner(System.in)){
            System.out.println("enter the Base Number");
            double base=sc.nextDouble();
            System.out.println("enter the Power Number");
            double power=sc.nextDouble();
            Power obj = new Power();

            double p =obj.Pow(base,power);
            System.out.println("Answer :"+ p);
            sc.close();
           }
        
    }
    
}
