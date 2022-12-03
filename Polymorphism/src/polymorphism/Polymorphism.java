package polymorphism;
import java.util.Scanner;

public class Polymorphism {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
     int input=1;
     System.out.println("1.Square Area\n2.Rectangular Area\n3.Exit");
     while(input!=0){
         input=scan.nextInt();
         if(input==1){
             System.out.println("Pls Enter Side of Square: ");
             double side=scan.nextDouble();
             Square square=new Square(side);
             System.out.println(square.CalcArea());
         }
         else if(input==2){
             System.out.println("Pls Enter width of Rectangular: ");
             double width=scan.nextDouble(); 
             System.out.println("Pls Enter length of Rectangular: ");
             double length=scan.nextDouble();
             Rectangular rec=new Rectangular(length,width);
             System.out.println(rec.CalcArea());
         }
          System.out.println("1.Square Area\n2.Rectangular Area\n3.Exit");
     }
    
   }
    
}
