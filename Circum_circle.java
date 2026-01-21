import java.util.*;
public class Circum_circle 
{
      double Circumferrence(double r)
      {
            double circum = 2*Math.PI*r;
            return circum;
        }
    public static void main (String args[])
    {
           try( Scanner sc = new Scanner(System.in)){
            System.out.println("enter the radius of the circle");
            double radi=sc.nextDouble();
            Circum_circle obj = new Circum_circle();

            double circumferrence=obj.Circumferrence(radi);
            System.out.println("Circumferrence of the Circle is :"+ circumferrence);
            sc.close();
           }
        
    }
}
    

