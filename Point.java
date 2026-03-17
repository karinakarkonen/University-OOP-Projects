/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coordinateproject;

/**
 *
 * @author Karina
 */
public class Point {
    
    private double x;
    private double y;
    
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    
    public Point(){
        this(0,0);
    }
    
    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
    
    public void setX(double x){
        this.x=x;
    }
    
    public void setY(double y){
        this.y=y;
    }
    
    public double calculateDistance(Point p){
        double difX=this.x - p.x;
        double difY=this.y - p.y;
        double distance= Math.sqrt(Math.pow(difX,2) + Math.pow(difY, 2));
        return distance;
    }
}
