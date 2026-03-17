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
        
        Point p2 = new Point(3, 4);
        Line l = new Line(center, p2);
        System.out.println("Line length between (0, 0) and (3, 4): " + l.getLength());
        
        System.out.println("-------------------------------------");
        
        Point q1 = new Point(0, 0);
        Point q2 = new Point(4, 0);
        Point q3 = new Point(4, 3);
        Point q4 = new Point(0, 3);
        Quad q = new Quad(q1, q2, q3, q4);
        System.out.println("Quadrilateral Perimeter: " + q.getPerimeter());
        
    
  }
}
