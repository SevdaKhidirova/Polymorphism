/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

public class Square extends Figure{
private double Side;
public void setSide(double Side){
    this.Side=Side;
}
public double getSide(){
    return Side;
}
   public Square(double Side){
       if(Side<0){
           setSide(0);
           System.out.println("negative value");
       }
       else{
            setSide(Side);
       }
   } 
    @Override
    public double CalcArea() {
       return Side*Side;
    }
    
}
