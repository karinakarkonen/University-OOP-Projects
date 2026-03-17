/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coordinateproject;

/**
 *
 * @author Karina
 */
public class Circle {
    
    private double radius;
    private Point center;
    private double perimeter;
    private double area;
    
    private void calculatePerimeter(){
        
        this.perimeter=2 * Math.PI * radius;
        
    }
    
    private void calculateArea(){
        
        this.area= Math.PI * Math.pow(radius, 2);
        
    }
    
    public Circle(){
        
        this.radius = 1.0;
        this.center = new Point();
        this.calculateArea();
        this.calculatePerimeter();
    }
    
    public Circle(double radius, Point center){
        
        this.radius = radius;
        this.center = center;
        this.calculateArea();
        this.calculatePerimeter();
        
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public double getPerimeter(){
        return this.perimeter;
    }
    
    public double getArea(){
        return this.area;
    }
    
    public Point getCenter(){
        return this.center;
    }
    
    public void setCenter(Point center){
        this.center = center;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
        calculateArea();
        calculatePerimeter();
    }
}
