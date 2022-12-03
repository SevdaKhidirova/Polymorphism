/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;
public class Rectangular extends Figure {
    private double length;
    private double width;

    
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
          if(length<0){
            System.out.print("negative value for width");
            length=0;
        }
        else{
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<0){
            System.out.print("negative value for width");
            width=0;
        }
        else{
            this.width = width;
        }
    }
    
    public Rectangular(double length,double width){
        setLength(length);
        setWidth(width);
    }

    @Override
    public double CalcArea() {
       return width*length;
    }
    
    
}
