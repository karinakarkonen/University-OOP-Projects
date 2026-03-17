/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coordinateproject;

/**
 *
 * @author Karina
 */
public class coordinateProject {
    
    public static void main(String[] args){
        
        Point center = new Point();
        double radius = 5.0;
        
        Circle c = new Circle(radius, center);
        
        System.out.println("Circle's area: "+c.getArea());
        System.out.println("Circle's Perimeter: "+c.getPerimeter());
        
        c.setRadius(0.5);
        System.out.println("Circle's new area: "+c.getArea());
        System.out.println("Circle's new perimeter: "+c.getPerimeter());
        
        System.out.println("-----------------------------------------");
        
        
    
  }
}
